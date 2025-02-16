package LinkedLists;

public class LinkedList6 {
    private Node head;
    private Node tail;
    public int length;

    LinkedList6(){
        head = null;
        tail = null;
        length = 0;
    }

    public static void main(String[] args) {
        LinkedList6 list = new LinkedList6();
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);

        list.printList();
        System.out.println(list.get(1).data);
    }

    private class Node{
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

    public void printList(){
       Node temp = head;
       while(temp != null){
        System.out.print(temp.data +" -> ");
        temp = temp.next;
       }
       System.out.println("null");
    }

    public Node get(int index){
        if(index < 0|| index >= length){
            return null;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            return temp;
        }
    }
}
