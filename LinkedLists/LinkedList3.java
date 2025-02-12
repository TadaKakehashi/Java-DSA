package LinkedLists;

public class LL2 {
    private Node head;
    private Node tail;
    private int length;

    public LL2(){
        this.head = null;
        this.tail = null;
        length = 0;
    }

    public static void main(String[] args){
        LL2 list = new LL2();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);

        list.printList();
        System.out.println("List length: " + list.length);
        System.out.println();

        list.removeLast();
        list.printList();
        System.out.println("List length: " + list.length);
        System.out.println();

        list.removeLast();
        list.printList();
        System.out.println("List length: " + list.length);
        
    }


    private static class Node{
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


    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
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
