package collection.Stack;

import java.util.Stack;

public class StackDemo {
    static  void stackFun(){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(130);
        System.out.println("check the top element " + stack.peek());
        System.out.println("remove the element " + stack.pop());
        System.out.println("pure list " + stack);
    }

    public static void main(String[] args) {
        stackFun();

    }
}
