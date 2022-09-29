package AdditionalTasks.QuickSort;

public class QuickSort {
    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start < end) {
            int p = getPartition(array, start, end);
            sort(array, start, p);
            sort(array, p + 1, end);
        }


    }

    private static int getPartition(int[] array, int start, int end) {
        int pivot = array[(start + end) / 2];
        int left = start;
        int right = end;
        while (true) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left >= right) {
                return right;
            }
            swap(array, left++, right--);
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
