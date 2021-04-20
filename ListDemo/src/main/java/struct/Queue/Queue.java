package struct.Queue;

import struct.Array.Array;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 14:13
 */
public class Queue<E> implements QueueInt<E>{

    public Array<E> array;

    //无参构造函数,默认容量10
    public Queue() {
        array = new Array<E>();
    }

    //有参构造函数，指定容量
    public Queue(int capacity) {
        array = new Array<E>(capacity);
    }


    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean empty() {
        return array.empty();
    }

    @Override
    public void enqueue(E element) {
        array.add(element);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E front() {
        return array.getFirst();
    }

    //打印队列
    public void display() {
        array.display();
    }
}
