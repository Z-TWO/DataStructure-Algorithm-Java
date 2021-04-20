package struct.Queue;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 14:25
 */
public class QueueArray<E> implements QueueInt<E> {
    private E[] array;
    private int size;
    private int front;
    private int tail;

    //无参构造函数,默认容量10,自动扩容了
    public QueueArray() {
        array = (E[]) new Object[10];
        size = 0;
        front = 0;
        tail = 0;
    }

    public QueueArray(int capacity) {
        array = (E[]) new Object[capacity];
        size = front = tail = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean empty() {
        return front==tail;
    }

    @Override
    public void enqueue(E element) {
        //判断是否已经满
        if (tail + 1 == front) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[tail] = element;
        tail = tail + 1 % array.length;
        size++;
    }

    @Override
    public E dequeue() {
        int index = front;
        front = front + 1 % array.length;
        size--;
        return array[index];
    }

    @Override
    public E front() {
        return array[front];
    }

    //打印队列
    public void display() {
        System.out.println("struct.Queue:size: " + size + " , capacity: " + array.length);
        System.out.print("[");
        if (front < tail) {
            for (int i = front; i < tail; i++) {
                System.out.print(array[i]);
                if (i != tail - 1) {
                    System.out.print(",");
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
            for (int i = 0; i < tail; i++) {
                System.out.print(array[i]);
                if (i != tail - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println("]");
    }
}
