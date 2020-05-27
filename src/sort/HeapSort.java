package sort;

/*

    堆排序：
        根据大根堆或小根堆一起从根部弹出交换至数组最后.
    时间复杂度：O(N*logN)
    空间复杂度：O(1)
    稳定性：不稳定

 */

public class HeapSort {

    public static void heapSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        SortUtil.swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            SortUtil.swap(arr, 0, --size);
        }
    }

    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            SortUtil.swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            SortUtil.swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }


}
