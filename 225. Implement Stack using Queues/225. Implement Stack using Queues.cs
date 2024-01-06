
public class MyStack {
    private Queue<int> queue1;
    private Queue<int> queue2;

    public MyStack() {
        queue1 = new Queue<int>();
        queue2 = new Queue<int>();
    }

    public void Push(int x) {
        // Enqueue the new element to queue2
        queue2.Enqueue(x);

        // Move all elements from queue1 to queue2
        while (queue1.Count > 0) {
            queue2.Enqueue(queue1.Dequeue());
        }

        // Swap queue1 and queue2 to make queue2 the primary queue for top and pop operations
        Queue<int> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int Pop() {
        // Dequeue from the primary queue (queue1)
        return queue1.Dequeue();
    }

    public int Top() {
        // Peek the front element of the primary queue (queue1)
        return queue1.Peek();
    }

    public bool Empty() {
        // Check if the primary queue (queue1) is empty
        return queue1.Count == 0;
    }
}
