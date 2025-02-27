package Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();

        System.out.println("Element popped is: "+stack.pop().value);
        stack.printStack();
    }

    private static class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;                                     
        }
    }
    

    public static class Stack{
        private Node top;
        private int height;
        public Stack(int value){
            Node newNode = new Node(value);
            top = newNode;
            height = 1;
        }

        public void printStack() {
            Node temp = top;
            while (temp != null) {
                System.out.println("| " + temp.value + " |"); 
                if (temp.next != null) {
                    System.out.println();
                }
                temp = temp.next;
            }
            System.out.println("-----"); // Move to next line after printing the stack
        }

        public void push(int value){
            Node newNode = new Node(value);
            if(height == 0){
                top = newNode;
            }
            else{
                newNode.next = top;
                top = newNode; 
            }
            height++;
        }

        public Node pop(){
            if(height == 0){
                return null;
            }
            Node temp = top;
            top = temp.next;
            height--;

            temp.next = null;
            return temp;
        }
    }
}
