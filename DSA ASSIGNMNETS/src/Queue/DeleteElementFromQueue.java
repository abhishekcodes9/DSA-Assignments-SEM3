package Queue;

public class DeleteElementFromQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Deleted Element: " + queue.dequeue());
        System.out.print("Queue: ");
        queue.display();
    }
}
