package DoublyLinkedList;

public class dll7 {
    private Node head;
    private Node tail;
    public int length;
    public int index;

    public static void main(String[] args){
        dll7 list = new dll7();
        list.append(10);
        list.append(20);
        list.append(30);
        list.prepend(1);
        System.out.print("List before reversing: ");
        list.printList();
        System.out.print("List after reversing: ");
        list.reverseList();
        list.printList();        
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


    private void prepend(int data){
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
