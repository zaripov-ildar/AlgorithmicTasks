package AdditionalTasks.QuickSort;

import java.util.Arrays;

public class SortRunner {
    public static void main(String[] args) {
        int[] array = {2,6,1,9,16,1,0};
        QuickSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
