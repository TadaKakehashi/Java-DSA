package LinkedLists;

public class LinkedList7 {
    private Node head;
    private Node tail;
    private int length;

    LinkedList7(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        LinkedList7 list = new LinkedList7();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printList();
        list.printLength();

        System.out.println();
        System.out.println("Getting data of index number 2: "+list.get(2).data);
        System.out.println();

        System.out.println("Setting index 2 data to 100: ");
        list.set(2,100);
        list.printList();

        System.out.println();
        System.out.println("Getting data of index number 2: "+list.get(2).data);
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

    private static class Node {
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
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
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printLength(){
        System.out.println("The length of the current list is: "+length);
    }
}
