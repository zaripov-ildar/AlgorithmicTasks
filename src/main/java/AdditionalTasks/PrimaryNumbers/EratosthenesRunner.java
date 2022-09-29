package AdditionalTasks.PrimaryNumbers;

import java.util.List;

public class EratosthenesRunner {
    public static void main(String[] args) {
        List<Executable> solutions = List.of(
                new OlgasEratosthenes(),
        new IldarsEratosthenes()
        );

        solutions.forEach(s->{
            long start = System.currentTimeMillis();
            s.execute(100_000);
            long totalTime = System.currentTimeMillis() - start;
            System.out.println(s.getClass().getSimpleName() + " algorithm took " + totalTime + " milliseconds");

        });
    }
}
