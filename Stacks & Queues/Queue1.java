
public class Queue1 {
    private static class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public static class Queue{
        private Node first;
        private Node last;
        private int length;

        public Queue(int value){
            Node newNode = new Node(value);
            first = newNode;
            last = newNode;
            length = 1;
        }

        public void enqueue(int value){
            Node newNode = new Node(value);
            if(length == 0){
                first = newNode;
                last = newNode;
            }
            else{
                last.next = newNode;
                last = newNode;
            }
            length++;
        }

        public void printQueue() {
            Node temp = first;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void printLength(){
            System.out.println("Print length: "+length);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5); // No need for Queue1 instance
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);

        queue.printQueue();
        queue.printLength();
    }
}
