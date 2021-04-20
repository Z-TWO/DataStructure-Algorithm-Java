package struct.Stack;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 13:50
 */
public interface StackInt<E> {
    int getSize();

    boolean Empty();

    void push(E element);

    E pop();

    E peek();
}
