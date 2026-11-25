package Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top;
    private int count;

    LinkedListStack() {
        top = null;
        count = 0;
    }

    
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;
        System.out.println(data + " inserted");
    }

    
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;
        count--;
        return removed;
    }

    
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    
    boolean isEmpty() {
        return top == null;
    }

    
    int size() {
        return count;
    }

    
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    
    int middle() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        Node slow = top;
        Node fast = top;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

public class Assignment_stack {

    
    static String reverseString(String text) {
        LinkedListStack stack = new LinkedListStack();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        String result = "";
        while (!stack.isEmpty()) {
            result += (char) stack.pop();
        }

        return result;
    }

    
    static boolean isPalindrome(String text) {
        LinkedListStack stack = new LinkedListStack();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = (char) stack.pop();
            if (ch != text.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    
    
    static LinkedListStack reverseStack(LinkedListStack original) {
        LinkedListStack reversed = new LinkedListStack();

        while (!original.isEmpty()) {
            reversed.push(original.pop());
        }

        return reversed;
    }

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        System.out.println("STACK USING LINKED LIST");
        System.out.println("-----------------------");

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.print("Display: ");
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.print("Display after pop: ");
        stack.display();

        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is Empty: " + stack.isEmpty());
        stack.pop(); 

        System.out.println();
        System.out.println("ADDITIONAL CHALLENGES");
        System.out.println("--------------------");

        
        System.out.println("Reverse of HELLO: " + reverseString("HELLO"));

        
        System.out.println("Is MADAM a palindrome? " + isPalindrome("MADAM"));

        
        LinkedListStack original = new LinkedListStack();
        original.push(10);
        original.push(20);
        original.push(30);

        LinkedListStack reversed = reverseStack(original);
        System.out.print("Reversed stack: ");
        reversed.display();

        
        System.out.println("Middle element: " + reversed.middle());
    }
}
