package AdditionalTasks.ArmstrongNumbers;

public class Runner {
    private static final Solution solution = new Solution();
    public static void main(String[] args) {
        warmup();
        long start = System.currentTimeMillis();
        System.out.println(solution.calculate(Integer.MAX_VALUE));
        System.out.println(System.currentTimeMillis()-start);
    }

    private static void warmup(){
        for (int i = 0; i < 100; i++) {
            solution.calculate(10_000);
        }
        System.out.println("warmup finished");
    }

}
