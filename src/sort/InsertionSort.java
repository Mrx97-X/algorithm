package sort;

/*

    插入排序：
        从第2个元素开始，逐个与前面元素进行比较，如果比前一个元素小，就交换。
    时间复杂度：O(N^2)
    空间复杂度：O(1)
    稳定性：稳定

 */

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                SortUtil.swap(arr, j, j + 1);
            }
        }
    }

}
