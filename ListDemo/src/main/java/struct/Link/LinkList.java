package struct.Link;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/13 18:17
 */
public class LinkList<E> {
    private class Node<E> {
        public E data;
        public Node next;

        private Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
            this(null);
        }

        public Node(E e) {
            this(e, null);
        }
    }

    public Node head;
    public int size;

    public LinkList() {
        head = new Node();
        size = 0;
    }

    //获取链表长度
    public int getSize() {
        return size;
    }

    //判断链表是否为空
    public boolean empty() {
        return size == 0;
    }

    //清空链表
    public void clear() {
        head = new Node();
    }

    //添加节点
    public void add(int index,E data) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        size++;
    }

    //头插入
    public void addFirst(E data) {
        this.add(0, data);
    }

    //尾插入
    public void addLast(E data) {
        this.add(size, data);
    }

    //删除节点
    public E remove(int index) {
        if (index <= 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        Node removeNode = p.next;
        p.next = p.next.next;
        size--;
        return (E) removeNode.data;
    }

    //删除第一个节点
    public E removeFirst() {
       return this.remove(0);
    }

    //删除最后一个节点
    public E removeLast() {
        return this.remove(size - 1);
    }

    //获取元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return (E) curr.data;
    }

    //获取第一个节点
    public E getFirst() {
        return this.get(0);
    }

    //获取最后一个元素
    public E getLast() {
        return this.get(size - 1);
    }

    //更新节点数值
    public void set(int index, E data) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.data = data;
    }

    //判断是否存在该元素
    public boolean contain(E data) {
        Node curr = head.next;
        while (curr != null) {
            if (curr.data.equals(data)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    //打印链表
    public void dispaly() {
        System.out.println("LinkList: size:" + size);
        Node curr = head.next;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
}
