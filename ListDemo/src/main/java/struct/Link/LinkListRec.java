package struct.Link;

/**
 * @Description 使用递归实现链表增删改查功能
 * @Author ZTwo
 * @Date 2021/4/15 21:08
 */
public class LinkListRec<E> {
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

    private int size;
    private Node head;

    public LinkListRec() {
        head = new Node();
        size = 0;
    }

    //输出链表长度
    public int getSize() {
        return size;
    }

    //判断是否为空
    public boolean empty() {
        return size == 0;
    }

    //添加节点
    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        add(head, index, element);
        size++;

    }

    private Node add(Node node, int index, E element) {
        if (index == 0) {
            return new Node(element, node);
        }
        node.next = add(node.next, index, element);
        return node;
    }

    //删除节点
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        remove(head, index);
        size--;
    }

    private Node remove(Node node, int index) {
        if (index == 0) {
            return node.next;
        }
        node.next = remove(node, index - 1);
        return node;
    }

    //修改节点
    public void set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }
        set(head, index, element);
    }

    private Node set(Node node, int index, E element) {
        if (index == 0) {
            node.data = element;
        }
        node.next = set(node.next, index - 1, element);
        return node;
    }

    //判断是否存在
    public boolean contain(E element) {
        if (contain(head, element) != null) {
            return true;
        } else {
            return false;
        }
    }

    private Node contain(Node node, E element) {
        if (node.next == null) {
            return null;
        }
        if (node.data.equals(element)) {
            return node;
        }
        node = node.next;
        return node;
    }

    //打印链表
    public void display() {
        display(head);
    }

    private Node display(Node node) {
        if (node.next == null) {
            return null;
        }
        System.out.println(node.data + ",");
        node = node.next;
        return node;
    }
}
