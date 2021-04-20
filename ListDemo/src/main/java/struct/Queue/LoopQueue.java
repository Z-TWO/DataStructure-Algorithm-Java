package struct.Queue;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/12 20:21
 */
public class LoopQueue<E> implements QueueInt<E> {

    private E[] array;
    private int size;
    private int tail;
    private int front;

    //有参构造函数
    public LoopQueue(int capacity) {
        array = (E[]) new Object[capacity + 1];
        this.size = 0;
        this.tail = 0;
        this.front = 0;
    }

    //无参构造函数,默认容量为10
    public LoopQueue() {
        this(10);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return array.length - 1;
    }

    @Override
    public boolean empty() {
        return front == tail;
    }

    @Override
    public void enqueue(E element) {
        if ((tail + 1) % array.length == front) {
            resize(getCapacity() * 2);
        }
        array[tail] = element;
        tail = tail + 1 % getCapacity();
        size++;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            throw new IllegalArgumentException();
        }
        E element = array[front];
        front = front + 1 % getCapacity();
        size--;
        if (getCapacity() / 2 != 0 && size == getCapacity() / 4) {
            resize(getCapacity() / 2);
        }
        return element;
    }

    @Override
    public E front() {
        if (empty()) {
            throw new IllegalArgumentException();
        }
        return array[front];
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = array[i + front % getCapacity()];
        }
        array = newData;
        front = 0;
        tail = size;
    }

    //打印队列
    public void display() {
        System.out.println("LoopQueue: size: " + size + " , capacity: " + getCapacity());
        System.out.print("[");
        for (int i = front; i != tail; i = i + 1 % getCapacity()) {
            System.out.print(array[i]);
            if (i != tail - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}
