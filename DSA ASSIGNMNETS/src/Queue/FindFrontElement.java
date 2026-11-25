package Queue;

public class FindFrontElement {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);

        System.out.println("Front Element: " + queue.getFront());
    }
}
