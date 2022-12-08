package HomeWork4;

public class Task2 {
    class MyQueue {
        LinkedList<Integer> stack1, stack2;

        public MyQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }


        public void push(int x) {
            stack1.push(x);
        }


        public int pop() {
            if (stack2.size() != 0) {
                return stack2.pop();
            }
            if (stack1.size() == 0) return 0;

            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }


        public int peek() {
            if (stack2.size() != 0) {
                return stack2.peek();
            }
            if (stack1.size() == 0) return 0;

            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.size() == 0 && stack2.size() == 0;
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
