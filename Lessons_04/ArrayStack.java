// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

package Lessons_04;

public class ArrayStack {
    static int capacity;
    static int[] array;
    static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIndex = -1;
        System.out.println(size());// 0
        System.out.println(empty());// true
        push(3);
        push(2);
        push(7);
        System.out.println(empty());// false
        System.out.println(size());// 3
        System.out.println(pop());// 7
        System.out.println(size());// 2
        System.out.println(peek());// 2

    }

    public static int size() {
        return topIndex + 1;
    }

    public static boolean empty() {
        return topIndex == -1;
    }

    public static void push(int num) {
        array[++topIndex] = num;
        // array[topIndex+1] = num;
        // topIndex++;

    }

    public static int peek() {
        return array[topIndex];
    }

    public static int pop() {
        return array[topIndex--];
    }

}