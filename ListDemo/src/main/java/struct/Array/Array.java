package struct.Array;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/11 19:29
 */
public class Array <E>{
    private E[] data;
    private int size;

    //无参构造函数，默认数组的容量为10
    public Array() {
        data = (E[]) new Object[10];
        size = 0;
    }

    //有参构造函数，传入容量数值
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组容量
    public int getCapacity() {
        return data.length;
    }

    //判断是否为空
    public boolean empty() {
        return size == 0;
    }

    //添加元素，默认在末尾添加
    public void add(E element) {
        if (size == data.length) {
            resize(data.length*2);
        }
        data[size++] = element;
    }

    //添加元素，指定位置添加
    public void add(int index, E element) {
        if (size == data.length) {
            resize(data.length * 2);
        }
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    //添加元素，添加再第一位
    public void addFirst(E element) {
        add(0, element);
    }

    //删除元素，删除指点位的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E removeElement = data[index];
        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        if (data.length / 2 != 0 && size == data.length / 4) {
            resize(data.length / 2);
        }
        return removeElement;
    }

    //删除元素，删除第一个元素
    public E removeFirst() {
        return remove(0);
    }

    //删除元素,删除最后一个原酸
    public E removeLast() {
        return remove(size - 1);
    }

    //删除元素，删除数组中第一个出现该元素
    public E removeElement(E element) {
        int index = find(element);
        if (index != -1) {
            return remove(index);
        }
        return null;
    }

    //获取指点元素的下边，如有多个去第一个的下标
    public int find(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //判断数组中是否存在该指定元素
    public boolean contain(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //获取最后一个元素
    public E getFirst() {
        return data[0];
    }

    //获取最后一个元素
    public E getLast() {
        return data[size - 1];
    }

    //扩容
    public void resize(int newCapacity) {
        E[] newDate = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newDate[i] = data[i];
        }
        data = newDate;
    }

    //打印整个数组
    public void display() {
        System.out.println("struct.Array:size: "+size+" , capacity: "+data.length);
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);
            if (i != size-1) {
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }
}
