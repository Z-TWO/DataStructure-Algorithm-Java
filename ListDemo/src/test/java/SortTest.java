import Utils.ArrayGenerator;
import Utils.SortHelp;
import arithmetic.sort.InsertSort;
import arithmetic.sort.MegerSort;
import org.junit.Test;
import struct.Array.Array;

import java.util.Arrays;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/17 22:41
 */
public class SortTest {
    @Test
    public void MegerSorrTest() {
        Integer[] arr = ArrayGenerator.generateRandomArray(20);
        System.out.println(Arrays.toString(arr));
        InsertSort.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
