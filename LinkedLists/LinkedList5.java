package LinkedLists;

public class LinkedList5 {
    private Node head;
    private Node tail;
    public int length;

    LinkedList5(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args){
        LinkedList5 list = new LinkedList5();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);

        list.printList();

        list.deleteHead();
        list.printList();
    }

    private static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
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

    public void deleteHead(){
        if(head == null){
            System.out.println("List is empty, nothing to remove!");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
        length--;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
