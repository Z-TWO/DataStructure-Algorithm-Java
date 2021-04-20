import struct.Link.LinkList;
import struct.Sq.SqList;
import org.junit.Test;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/3/30 23:15
 */
public class ListTest {
    @Test
    public void testOne() throws Exception {
        SqList sqList = new SqList(15);
        sqList.insert(1);
        sqList.insert(2);
        sqList.insert(3);
        sqList.insert(6);
        sqList.insert(10);
        sqList.insert(1);
        sqList.display();
        System.out.println(sqList.get(3));
        System.out.println(sqList.indexOf(10));
        sqList.remove(2);
        sqList.display();
    }

    @Test
    public void test() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.substring(0,10);
        stringBuffer.reverse();
    }

    @Test
    public void LinkListTest() {
        LinkList<Integer> linkList = new LinkList<>();
        for (int i = 0; i < 5; i++) {
            linkList.add(i, i);
        }
        linkList.dispaly();
        linkList.remove(1);
        linkList.dispaly();
        linkList.removeLast();
        linkList.dispaly();

    }






}
