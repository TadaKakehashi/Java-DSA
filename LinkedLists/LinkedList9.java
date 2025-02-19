package LinkedLists;

public class LinkedList9 {
    private Node head;
    private Node tail;
    private int length;

    LinkedList9(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args){
        LinkedList9 list = new LinkedList9();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.appendNode(40);
        list.printList();
        list.reverseList();
        list.printList();
    }

    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void reverseList(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    //Optimised way:- 
    // public void reverseList(){
    //     Node temp = head;
    //     Node before = null;
    //     Node after = null;
    //     tail = head; // The original head becomes the new tail
    
    //     while (temp != null) {
    //         after = temp.next;  // Store the next node
    //         temp.next = before; // Reverse the pointer
    //         before = temp;      // Move `before` forward
    //         temp = after;       // Move `temp` forward
    //     }
    //     head = before; // The last node becomes the new head
    // }

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
