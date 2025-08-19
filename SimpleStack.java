public class SimpleStack {
    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
    }
}
