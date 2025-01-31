import java.util.EmptyStackException;

// Stack Interface
interface StackADT {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}

// Stack Implementation using Array
class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stack[++top] = item;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test Stack
public class StackTestInterface {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.display();
            
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped element: " + stack.pop());
            stack.display();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
