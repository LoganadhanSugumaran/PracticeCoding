package Practice;


public class stackLL {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        private static Node head = null;
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static boolean isEmpty(){
        return head == null;
        }

        public static int pop(){
        if (isEmpty()){
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();

        }
    }
}
