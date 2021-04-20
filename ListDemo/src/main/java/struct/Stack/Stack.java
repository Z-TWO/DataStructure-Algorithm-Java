package struct.Stack;

import struct.Array.Array;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 13:53
 */
public class Stack<E> implements StackInt<E> {
    Array<E> array;

    //无参构造函数，自动创建容量为capacity=10
    public Stack() {
        array = new Array<E>();
    }

    public Stack(int capacity) {
        array = new Array<E>(capacity);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean Empty() {
        return array.empty();
    }

    @Override
    public void push(E element) {
        array.add(element);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.getLast();
    }

    //打印stack
    public void display() {
        array.display();
    }
}
