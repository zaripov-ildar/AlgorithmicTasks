package AdditionalTasks.PrimaryNumbers;

import java.util.ArrayList;
import java.util.List;

public class OlgasEratosthenes implements Executable {
    @Override
    public void execute(int num){
        int [] arr = new int[num];
        for (var x = 1; x <= num; x++) {
            arr[x-1] = x;
        }
//        System.out.println(Arrays.toString(arr));

        for (int j = 2; j <= arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % j == 0 && j < arr[i]) {
                    arr[i] = 0;
                }
            }
        }

//        System.out.println(Arrays.toString(arr));

        List<Integer> era = new ArrayList<>();
        for (int j : arr) {
            if (j > 0) {
                era.add(j);
            }
        }
//        System.out.println(era);
    }

}
