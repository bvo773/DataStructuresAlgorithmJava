package ds.stack;

public class AppStack {
    public static void main(String[] args) {
        Stack theStack = new Stack(4);
        theStack.push(1);
        theStack.push(2);
        theStack.push(3);
        theStack.push(4);
        theStack.push(5);
        Stack.printStack(theStack);


        GenericStack<Character> stringStack = new GenericStack<>(4);
        stringStack.push('b');
        stringStack.push('i');
        stringStack.push('n');
        stringStack.push('h');
        stringStack.push('s');
        GenericStack.printStack(stringStack);


        System.out.println(reverseString("binh"));
    }

    public static String reverseString(String str) {
        GenericStack<Character> stringStack = new GenericStack<>(str.length());
        int i = 0;
        while (i < str.length()) {
            stringStack.push(str.charAt(i));
            i++;
        }
        str = "";
        while(!stringStack.isEmpty()) {
            str = str.concat(stringStack.pop().toString());
        }
        return str;
    }

}
