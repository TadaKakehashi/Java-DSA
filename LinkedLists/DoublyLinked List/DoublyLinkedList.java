package dll;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printLength();
        list.printList();

        list.prependNode(100);
        list.prependNode(200);
        System.out.println();
        list.printLength();
        list.printList();

        System.out.println();
        System.out.println("Removing the last element of the list: "+list.removeLast().data);
        list.printList();
        list.printLength();

        System.out.println();
        System.out.println("Removing the first element of the list: "+list.removeHead().data);
        list.printList();
        list.printLength();

        System.out.println();
        list.printList();
        System.out.println("The data at index 0: "+list.get(0).data);
        System.out.println("The data at index 1: "+list.get(1).data);

        System.out.println();
        list.set(1,210);
        System.out.println("The data at index 1: "+list.get(1).data);
        list.printList();

        System.out.println();
        list.insertAt(2,501);
        list.printList();

        System.out.println();
        list.removeAt(2);
        list.printList();
        list.printHead();
        list.printTail();

        System.out.println();
        System.out.print("Before reversing the list: ");
        list.printList();
        System.out.println();
        System.out.print("After reversing the list: ");
        list.reverseList();
        list.printList();

    }
    private static class Node{
        private int data;
        private Node next;
        private Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public void reverseList(){
        Node temp = null;
        Node current = head;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
    }

    private Node get(int index){
        if(index< 0 || index >= length){
            return null;
        }
        Node temp;
        if(index < length/2){
            temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
        }
        else{
            temp = tail;
            for(int i = length-1; i>index;i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    private boolean set(int index, int data){
        Node temp = get(index);
        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }
    private void prependNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
    private void appendNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    private boolean insertAt(int index, int data){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prependNode(data);
            return true;
        }
        if(index == length){
            appendNode(data);
            return true;
        }
        Node newNode = new Node(data);
        Node before = get(index-1);

        if(before == null){ //handle invalid index properly
            return false;
        }

        Node after = before.next;
        newNode.prev= before;
        newNode.next = after;
        before.next= newNode;
        if(after != null){ //ensures after is not null before accessing 'prev'
            after.prev = newNode;
        }
        length++;
        return true;
    }

    //Removing methods:
    private Node removeHead(){
        if(head == null){
            return null;
        }
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        temp.next = null;
        length--;
        return temp;
    }
    private Node removeLast(){
        if(head == null){
            return null;
        }
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        temp.prev = null;
        length--;
        return temp;
    }
    private Node removeAt(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeHead();
        }
        if(index == length-1){
            return removeLast();
        }

        Node temp = get(index);
        if(temp == null) return null;

        Node before = temp.prev;
        Node after = temp.next;

        if(before != null){
            before.next = after;
        }
        if(after != null){
            after.prev = before;
        }

        temp.next = null;
        temp.prev = null;
        length--;

        return temp;
    }

    private void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <--> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void printLength(){
        System.out.println("The length of the current list is: "+length);
    }
    public void printHead(){
        if (head == null){
            System.out.println("The list is empty, no head element.");
        } else {
            System.out.println("The head of the list is: " + head.data);
        }
    }

    public void printTail(){
        if (tail == null){
            System.out.println("The list is empty, no tail element.");
        } else {
            System.out.println("The tail of the list is: " + tail.data);
        }
    }
}
