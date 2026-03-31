import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    // Enqueue
    void enqueue(int x) {
        inStack.push(x);
    }

    // Dequeue
    int dequeue() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}
