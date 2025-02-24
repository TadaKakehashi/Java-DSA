package DoublyLinkedList;

public class dll3 {
    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args){
        dll3 list = new dll3();
        list.prepend(10);
        list.prepend(10);
        list.prepend(10);
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

    private void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
