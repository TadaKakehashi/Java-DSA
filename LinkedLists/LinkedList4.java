package LinkedLists; 

//LinkedList: 

public class LinkedList4{
    private Node head;
    private Node tail;
    private int length;

    public LinkedList4(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
   public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.printList();
        System.out.println("Length of the list: "+list.length);
        System.out.println();

        list.insertHead(100);
        list.printList();
        System.out.println("Lenght of the list after adding a new head: " +list.length);
        System.out.println();

        list.removeTail();
        list.printList();
        System.out.println(list.length);
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

   public void insertHead(int value){
    Node newNode = new Node(value);
    if(head == null){
        head = newNode;
        tail = newNode; 
    }
    else{
        newNode.next = head;
        head = newNode;
    }
    length++;
   }

   public void removeTail(){
        if(head == null){
            System.out.println("List is empty, nothing to remove!");
            return;
        }
        if(head==tail){
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            while(temp.next.next != tail){
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
