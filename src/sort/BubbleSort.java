package sort;

/*

    冒泡排序：
        从头开始两两比较，每一轮找出当前最大值放置数组最后
    时间复杂度：O(N^2)
    空间复杂度：O(1)
    稳定性：稳定

 */

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    SortUtil.swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        SortUtil.testArrays();
    }

}
