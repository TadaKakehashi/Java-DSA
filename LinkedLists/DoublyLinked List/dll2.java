package DoublyLinkedList;

public class dll2 {
    private Node head;
    private Node tail;
    public int length;

    dll2() {
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        dll2 list = new dll2();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printList();
        System.out.println(list.removeLast().data);
        list.printList();
        System.out.println(list.removeLast().data);
        list.printList();
        System.out.println(list.removeLast().data);
        System.out.println(list.removeLast().data);
    }

    private void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    private Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        } else{
            tail = tail.prev;
            tail.next = null;
        }
        temp.prev = null;
        length--;
        return temp;
    }

    private static class Node {
        private int data;
        private Node next;
        private Node prev;

        Node(int data) {
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
