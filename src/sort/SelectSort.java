package sort;

/*

    选择排序
    时间复杂度：O(N^2)
    空间复杂度：O(1)
    稳定性：不稳定

 */

public class SelectSort {

    public static void selectSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            SortUtil.swap(arr, i, minIndex);
        }

    }


}
