package struct.Link;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/3/30 22:48
 */
public interface IList {
    public void clear();

    public boolean isEmpty();

    public int length();

    public Object get(int i) throws Exception;

    public void insert(int i,Object o) throws Exception;

    public void insert(Object o) throws Exception;

    public void remove(int i) throws Exception;

    public int indexOf(Object o);

    public void display();
}
