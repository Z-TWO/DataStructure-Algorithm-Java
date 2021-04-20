import struct.Stack.LinkStack;
import org.junit.Test;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/13 19:54
 */
public class StackTest {
    @Test
    public void LinkStackTest() {
        LinkStack<Integer> linkStack = new LinkStack<Integer>();
        linkStack.push(1);
        linkStack.push(2);
        linkStack.push(3);
        linkStack.push(4);
        linkStack.push(5);
        linkStack.display();
        linkStack.pop();
        linkStack.display();
        System.out.println(linkStack.peek());
    }
}
