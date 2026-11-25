package Queue;

public class DisplayRearElement {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);

        System.out.println("Rear Element: " + queue.getRear());
    }
}
