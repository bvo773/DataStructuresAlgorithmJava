package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top; //index of the last position of the last item of the stack

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item) {
        if (isFull())
            System.out.println("Stack is full");
        else {
            top++;
            stackArray[top] = item;
        }
    }



    public long pop() {
        if (isEmpty()) {
            return -1; // No more items in the stack
        } else {
            long value = stackArray[top];
            top--;
            return value;
        }
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public static void printStack(Stack stack) {
        while (!stack.isEmpty()) {
            System.out.println("|" + stack.pop() + "|");
        }
    }
}
