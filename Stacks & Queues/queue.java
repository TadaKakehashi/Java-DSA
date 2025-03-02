public class queue {
    public static class Node{
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

        public Node dequeue(){
            if(length == 0){
                System.out.println("Queue is empty!");
                return null;
            }
            Node temp = first;
            first = first.next;
            length--;
            if(length == 0){
                last = null;
            } 
            return temp;
        }

        public void printQueue(){
            Node temp = first;
            System.out.println("Queue: ");
            while(temp != null){
                System.out.print(temp.value + " <- ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();
        Node dequeueNode = queue.dequeue();
        if(dequeueNode != null)
        {
            System.out.println("Dequeued: "+dequeueNode.value);
        }
        queue.printQueue();
    }
}
