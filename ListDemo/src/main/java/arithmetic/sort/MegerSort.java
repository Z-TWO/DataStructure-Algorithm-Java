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
        int midle = (left + rigth) / 2;
        //左边排序
        sort(arr, left, midle);
        //右边排序
        sort(arr, midle + 1, rigth);
        //合并左右两边
        mergic(arr, left, midle, rigth);
    }

    private static <E extends Comparable<E>> void mergic(E[] arr, int left, int mid, int right) {
        //复制arr
        E[] temp = Arrays.copyOfRange(arr, left, right + 1);
        //左下标和右下标
        int i = left, j = mid + 1;
        //开始排序
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = temp[j - left];
            } else if (j > right) {
                arr[k] = temp[i - left];
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
