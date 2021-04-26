package arithmetic.sort;

import java.util.Arrays;

/**
 * @Description 归并排序
 * @Author ZTwo
 * @Date 2021/4/17 22:17
 */
public class MegerSort {
    private MegerSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] arr, int left, int rigth) {
        if(left>=rigth) return;
        int middle = (left + rigth) / 2;
        //左边排序
        sort(arr, left, middle);
        //右边排序
        sort(arr, middle + 1, rigth);
        //合并左右两边
        if (arr[middle].compareTo(arr[middle + 1]) > 0) {
            merge(arr, left, middle, rigth);
        }
    }

    private static <E extends Comparable<E>> void merge(E[] arr, int left, int mid, int right) {
        //复制arr
        E[] temp = Arrays.copyOfRange(arr, left, right + 1);
        //左下标和右下标
        int i = left, j = mid + 1;
        //开始排序
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = temp[j - left];
                j++;
            } else if (j > right) {
                arr[k] = temp[i - left];
                i++;
            } else if (temp[i-left].compareTo(temp[j-left]) < 0) {
                arr[k] = temp[i - left];
                i++;
            } else {
                arr[k] = temp[j - left];
                j++;
            }
        }
    }
}
