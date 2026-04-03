package collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//LIFO

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.poll());
    }
}
