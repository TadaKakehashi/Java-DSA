package LinkedLists;

public class LinkedList1 {
    public static void main(String[] args) {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;

        printList(firstNode);

    }

    private static class Node{
        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
        }
        private Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    } 
    public static void printList(Node head){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
