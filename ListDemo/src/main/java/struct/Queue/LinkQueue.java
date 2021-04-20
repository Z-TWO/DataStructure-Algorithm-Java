package struct.Queue;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/14 19:43
 */
public class LinkQueue<E> implements QueueInt<E> {
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
    private Node head, tail;
    private int size;

    public LinkQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public void enqueue(E element) {
        if (tail == null) {
            tail = new Node(element);
            head = tail;
        }else{
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (empty()) {
            throw new IllegalArgumentException();
        }
        Node outNode = head;
        head = head.next;
        outNode.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return (E) outNode.data;
    }

    @Override
    public E front() {
        if (empty()) {
            throw new IllegalArgumentException();
        }
        return (E) head.data;
    }

    public void display() {
        System.out.println("LinkQueue: size: " + size);
        if(empty()) return;
        Node node = head;
        System.out.print("head:");
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println(":tail");
    }
}
