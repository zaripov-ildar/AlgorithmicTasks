package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Timer {
    int WARM = 50_000;
    int EXECUTIONS = 250_000;

    // public void compareFunctions(int executions, Runnable... methods) {
    // EXECUTIONS = executions;
    // warmUpJvm(methods);
    // Arrays.stream(methods).forEach(this::execute);
    // }

    public void compareFunctions(int executions, Runnable... methods) {
        EXECUTIONS = executions;
        warmUpJvm(methods);

        List<Thread> threads = new LinkedList<>();

        for (int i = 0; i < methods.length; i++) {
            Runnable r = methods[i];
            String name = "Method #" + (i + 1);
            Thread t = new Thread(() -> execute(r, name));
            t.setDaemon(true);
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void compareFunctions(Runnable... methods) {
        compareFunctions(EXECUTIONS, methods);
    }

    // public void compareFunctions(Runnable... methods) {
    // compareFunctions(EXECUTIONS, methods);
    // }

    private void warmUpJvm(Runnable... methods) {
        System.out.println("Warming...");
        for (int i = 0; i < WARM; i++) {
            Arrays.stream(methods).forEach(Runnable::run);
        }
        System.out.println("Warming is finished");
    }

    private void execute(Runnable method, String name) {
        long time = System.nanoTime();
        for (int i = 0; i < EXECUTIONS; i++) {
            method.run();
        }
        time = System.nanoTime() - time;
        System.out.printf("%s: Elapsed %,9.3f ms\n", name, time / 1_000_000.0);
    }
}
