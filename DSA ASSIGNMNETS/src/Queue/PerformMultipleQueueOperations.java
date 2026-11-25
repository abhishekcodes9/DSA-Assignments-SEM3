package Queue;

public class PerformMultipleQueueOperations {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Deleted Element: " + queue.dequeue());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.print("Queue: ");
        queue.display();

        System.out.println("Front: " + queue.getFront());
        System.out.println("Rear: " + queue.getRear());
    }
}
