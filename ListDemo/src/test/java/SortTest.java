import Utils.ArrayGenerator;
import Utils.SortHelp;
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
        Integer[] arr1 = ArrayGenerator.generateRandomArray(100000);
        SortHelp.sortTime("InsertSort", arr1);
        Integer[] arr2 = ArrayGenerator.generateRandomArray(100000);
        SortHelp.sortTime("SelectSort", arr2);
        Integer[] arr3 = ArrayGenerator.generateRandomArray(100000);
        SortHelp.sortTime("MegerSort", arr3);
    }
}