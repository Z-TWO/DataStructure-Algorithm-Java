package struct.Stack;

import struct.Link.LinkList;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/13 19:48
 */
public class LinkStack<E> implements StackInt<E> {

    private LinkList<E> list;

    public LinkStack() {
        list = new LinkList<>();
    }

    @Override
    public int getSize() {
        return list.size;
    }

    @Override
    public boolean Empty() {
        return list.empty();
    }

    @Override
    public void push(E element) {
        list.addLast(element);
    }

    @Override
    public E pop() {
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }

    //打印链表栈
    public void display() {
        list.dispaly();
    }
}
