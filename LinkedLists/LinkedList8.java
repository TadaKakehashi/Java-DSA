package LinkedLists;

public class LinkedList8{
    private Node head;
    private Node tail;
    private int length;

    LinkedList8(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        LinkedList8 list = new LinkedList8();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printList();
        list.getLength();

        System.out.println(list.get(2).data);

        list.set(2,102);
        list.printList();
        System.out.println("Node removed is :"+list.remove(2).data);
        list.printList();
    }

    public Node removeFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node removeLast(){
        if(head == null){
            return null;
        }
        Node temp = head;
        Node pre = head;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return temp;
        }
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int data){
        Node temp = get(index);
        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    public boolean insertAt(int index, int data){
        if(index < 0 || index >= length){
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
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index > length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index - 1);
        Node temp = prev.next;
        
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
       
    }

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void prependNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public void appendNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getLength(){
        System.out.println("The length of the list is: "+length);
    }
}