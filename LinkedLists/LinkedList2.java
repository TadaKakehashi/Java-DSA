package LinkedLists;

public class LL1 {
    private Node head;
    private Node tail;
    private int length;

    public LL1(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args){
        LL1 list = new LL1();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30); 

        list.printLinkedList();
        System.out.println(list.length);
    }
    

    public void appendNode(int value){
        Node newNode = new Node(value);
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

    private static class Node{
        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
