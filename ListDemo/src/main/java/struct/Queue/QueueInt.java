package struct.Queue;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 14:12
 */
public interface QueueInt<E> {
    int getSize();

    boolean empty();

    void enqueue(E element);

    E dequeue();

    E front();
}
