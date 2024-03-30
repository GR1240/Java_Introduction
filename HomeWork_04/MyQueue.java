// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди

import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> queue;

    public MyQueue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(int element) {
        queue.addLast(element);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int first() {
        return queue.getFirst();
    }

    public String getElements() {
        return queue.toString();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
