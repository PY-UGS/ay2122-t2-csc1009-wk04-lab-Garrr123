package Week4;

public class StackOfIntegers {
    private int[] element;
    private int size;
    int top = -1;

    public StackOfIntegers(){
         element = new int[16];
    }

    public StackOfIntegers(int capacity){
        this.element = new int[capacity];
    }

    public boolean empty(){
        if (top != -1){
            return false;
        }else{
            return true;
        }
    }

    public int peek(){
        return element[element.length];
    }

    public void push(int value){
        element[++top] = value;
    }

    public int pop(){
        return element[top--];
    }

    public int getSize(){
        return top;
    }
}
