import Utils.ArrayGenerator;
import Utils.SortHelp;
import arithmetic.sort.InsertSort;
import arithmetic.sort.MegerSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/17 22:41
 */
public class SortTest {
    @Test
    public void MegerSorrTest() {
        Integer[] arr3 = ArrayGenerator.generateRandomArray(20);
        System.out.println(Arrays.toString(arr3));
        MegerSort.sort(arr3);
        System.out.println(Arrays.toString(arr3));

    }
}
