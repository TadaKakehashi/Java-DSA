package DoublyLinkedList;

public class dll1 {
    private Node head;
    private Node tail;
    public int length;

    dll1(){
        head = null;
        tail = null;
        length = 0;
    }
    public static void main(String[] args) {
        dll1 list = new dll1();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printList();
    }

    private void appendNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        tail = newNode;
        length++;
    }
    private static class Node{
        private int data;
        private Node next;
        private Node prev;
        Node(int data){
            this.data = data;
        }
    }
    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
