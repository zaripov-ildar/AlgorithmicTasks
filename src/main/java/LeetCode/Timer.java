package LeetCode;

import java.util.Arrays;

public class Timer {
    int WARM = 10_000_000;
    int EXECUTIONS = 10_000_000;


    public void compareFunctions(int executions, Runnable... methods) {
        EXECUTIONS = executions;
        warmUpJvm(()->{int a = 8*8;});
        Arrays.stream(methods).forEach(this::execute);
    }

    public void compareFunctions(Runnable... methods) {
        compareFunctions(EXECUTIONS, methods);
    }

    private void warmUpJvm(Runnable... methods) {
        System.out.println("Warming...");
        for (int i = 0; i < WARM; i++) {
            Arrays.stream(methods).forEach(Runnable::run);
        }
    }

    private void execute(Runnable method) {
        long time = System.nanoTime();
        for (int i = 0; i < EXECUTIONS; i++) {
            method.run();
        }
        time = System.nanoTime() - time;
        System.out.printf("Elapsed %,9.3f ms\n", time/1_000_000.0);
    }
}

