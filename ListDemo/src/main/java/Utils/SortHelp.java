package Utils;

import arithmetic.sort.InsertSort;
import arithmetic.sort.MegerSort;
import arithmetic.sort.QuerySort;
import arithmetic.sort.SelectSort;

/**
 * @Description
 * @Author ZTwo
 * @Date 2021/4/17 22:55
 */
public class SortHelp {
    //校验时候排序成功
    private static <E extends Comparable<E>> boolean isSort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    //选择排序方式，计算排序时间
    public static <E extends Comparable<E>> void sortTime(String sortname, E[] arr) {
        Long startTime = System.nanoTime();
        switch (sortname) {
            case "InsertSort":
                InsertSort.sort(arr);
                break;
            case "MegerSort":
                MegerSort.sort(arr);
                break;
            case "SelectSort":
                SelectSort.sort(arr);
                break;
            case "QuerySort":
                QuerySort.sort(arr);
            default:
                break;
        }
        Long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!SortHelp.isSort(arr)) {
            System.out.println(String.format("Sortname:%s is fauile", sortname));
        } else {
            System.out.println(String.format("Sortname:%s   Time:%f s", sortname, time));
        }
    }
}
