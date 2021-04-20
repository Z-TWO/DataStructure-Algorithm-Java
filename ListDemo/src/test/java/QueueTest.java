import struct.Array.Array;
import struct.Queue.*;
import struct.Stack.Stack;
import org.junit.Test;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/11 20:01
 */
public class QueueTest {
    @Test
    public void Test() {
        Array<Integer> array = new Array<Integer>();
        array.add(1);
        array.add(1);
        array.add(1);
        array.addFirst(2);
        array.add(3, 10);
        array.removeFirst();
        array.display();
        array.removeFirst();
        array.removeLast();
        array.display();
    }

    @Test
    public void StackTest() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(10);
        stack.display();
        System.out.println(stack.peek());
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
    }

    @Test
    public void QueueArrayTest() {
        QueueArray<Integer> queue = new QueueArray<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.display();

    }

    @Test
    public void LoopQueueTest() {
        LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
        loopQueue.enqueue(1);
        loopQueue.enqueue(2);
        loopQueue.enqueue(3);
        loopQueue.enqueue(4);
        loopQueue.enqueue(5);
        loopQueue.enqueue(6);
        loopQueue.enqueue(7);
        loopQueue.enqueue(8);
        loopQueue.enqueue(9);
        loopQueue.enqueue(10);
        loopQueue.enqueue(10);
        loopQueue.enqueue(10);
        loopQueue.enqueue(11);
        loopQueue.enqueue(30);
        loopQueue.display();
    }

    @Test
    public void LinkQueueTest() {
        LinkQueue<Integer> linkQueue = new LinkQueue<Integer>();
        linkQueue.display();
        linkQueue.enqueue(1);
        linkQueue.enqueue(2);
        linkQueue.enqueue(3);
        linkQueue.enqueue(4);
        linkQueue.enqueue(5);
        linkQueue.dequeue();
        linkQueue.display();
        System.out.println(linkQueue.front());
        linkQueue.dequeue();
        linkQueue.display();
    }


}
