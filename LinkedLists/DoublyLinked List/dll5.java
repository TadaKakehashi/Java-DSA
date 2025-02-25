package DoublyLinkedList;

public class dll5 {
    private Node head;
    private Node tail;
    public int length;
    public int index;

    public static void main(String[] args){
        dll5 list = new dll5();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();
        System.out.println(list.get(2).data);
        list.set(1,301);
        list.printList();
        
    }

    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index < length/2){
            for(int i=0; i<length; i++){
                temp = temp.next;
            }
        }
        else{
            temp = tail;
            for(int i=length-1; i>index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int data){
        Node temp = get(1);
        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    private static class Node{
        private int data;
        private Node next;
        private Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node removeHead(){
        Node temp = head;
        if(head == null){
            return null;
        }
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

    private void append(int data){
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
    private void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            if(temp.next != null){
                System.out.print(" <--> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
