package DoublyLinkedList;

public class dll4 {
    private Node head;
    private Node tail;
    public int length;

    public static void main(String[] args){
        dll4 list = new dll4();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printList();
        System.out.println("The element removed is "+list.removeHead().data);
        list.printList();
        System.out.println("The element removed is "+list.removeHead().data);
        list.printList();
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
