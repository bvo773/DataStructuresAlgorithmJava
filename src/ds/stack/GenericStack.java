package ds.stack;

public class GenericStack<T> implements iStack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top; //index of the last position of the last item of the stack

    public GenericStack(int size) {
        this.maxSize = size;
        stackArray = (T[]) new Object[maxSize];
        this.top = -1;

    }

    @Override
    public void push(T item) {
        if (isFull())
            System.out.println("Stack is full");
        else {
            top++;
            stackArray[top] = item;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // No more items in the stack
        } else {
            T value = stackArray[top];
            top--;
            return value;
        }
    }

    @Override
    public T peek() {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }


    @Override
    public boolean isFull() {
        return maxSize-1 == top;
    }

    public static void printStack(GenericStack stack) {
        while(!stack.isEmpty()) {
            System.out.println("|" + stack.pop() + "|");
        }
    }


}
