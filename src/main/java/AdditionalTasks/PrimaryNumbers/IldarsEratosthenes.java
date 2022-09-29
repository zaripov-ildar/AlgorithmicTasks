package AdditionalTasks.PrimaryNumbers;


public class IldarsEratosthenes implements Executable {

    @Override
    public void execute(int num) {
        int[] arr = new int[num+1];
        for (var x = 0; x <= num; x++) {
            arr[x] = x;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
//            System.out.print(arr[i] + ", ");
            for (var j = 2 * i; j < arr.length; j += i) {
                if (arr[j] % i == 0) {
                    arr[j] = 0;
                }
            }
        }
//        System.out.println();
    }
}
