package arithmetic.sort;

import java.util.Arrays;

/**
 * @Description 归并排序
 * @Author ZTwo
 * @Date 2021/4/17 22:17
 */
public class MegerSort {
    private MegerSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        sortDU(arr, 0, arr.length - 1, temp);
//        sortUD(arr);
    }

    //自顶向下
    private static <E extends Comparable<E>> void sortDU(E[] arr, int left, int rigth, E[] temp) {
        if (left >= rigth) return;
        int middle = left + (rigth - left) / 2;
        //左边排序
        sortDU(arr, left, middle, temp);
        //右边排序
        sortDU(arr, middle + 1, rigth, temp);
        //合并左右两边
        if (arr[middle].compareTo(arr[middle + 1]) > 0) {
            merge(arr, left, middle, rigth, temp);
        }
    }

    //自顶向上
    private static <E extends Comparable<E>> void sortUD(E[] arr) {
        E[] temp = Arrays.copyOf(arr, arr.length);
        int n = arr.length;
        //需要归并范围[i,i+size-1][i+size,size+size+i-1]
        for (int size = 1; size < n; size += size) {
            for (int i = 0; i + size < n; i += size + size) {
                if (arr[i + size - 1].compareTo(arr[i + size]) > 0) {
                    merge(arr, i, i + size - 1, Math.min(size + size + i - 1, n - 1), temp);
                }
            }
        }
    }

    private static <E extends Comparable<E>> void merge(E[] arr, int left, int mid, int right, E[] temp) {
        System.arraycopy(arr, left, temp, left, right - left + 1);
        //左下标和右下标
        int i = left, j = mid + 1;
        //开始排序
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = temp[j];
                j++;
            } else if (j > right) {
                arr[k] = temp[i];
                i++;
            } else if (temp[i].compareTo(temp[j]) < 0) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
        }
    }
}
