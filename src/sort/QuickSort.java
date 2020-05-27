package sort;

/*

    原本的快速排序：
        每次取数组最后一个位置的元素，小于该元素放在前，大于该元素放在后，以此递归
    时间复杂度：O(N*logN)
        最差情况：O(N^2) 数组本来有序
    空间复杂度：O(N*logN)
    稳定性：不稳定

    改进后的快速排序：
        partition过程将数组分为3部分，小于的在左，相同的在中间，大于的在右，反回中间相同部分的起始和结束位置的数组，
        该过程可以减少有相同元素情况下的快速排序，但最差情况仍是O(N^2)。
        将每次选择最后一个元素当作中间数的过程中，该元素从数组中随机选择一个数与最后一个元素交换作为中间数，
        最终的 长期期望 是O(N*logN)

 */

public class QuickSort {

    public static void quickSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            SortUtil.swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    private static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                SortUtil.swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                SortUtil.swap(arr, --more, L);
            } else {
                L++;
            }
        }
        SortUtil.swap(arr, more, R);
        return new int[]{less + 1, more};
    }

}
