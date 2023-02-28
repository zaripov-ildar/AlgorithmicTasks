package Yandex.Task_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
//                Arguments.of(5, 1, 2, new String[]{"1 1 5", "1 2 3", "2 2 1", "3 1 2", "4 1 3"},
//                        "1 1\n" +
//                                "1 6\n" +
//                                "1 9\n" +
//                                "1 11\n" +
//                                "1 12\n"),
                Arguments.of(5, 2, 2, new String[]{"1 1 5", "1 2 3", "2 2 1", "3 1 2", "4 1 3"},
                        "1 1\n" +
                                "2 1\n" +
                                "2 4\n" +
                                "1 6\n" +
                                "2 6\n"),
                Arguments.of(5, 2, 2, new String[]{"1 1 1", "1 2 5", "2 2 1", "5 1 3", "6 1 3"},
                        "1 1\n" +
                                "2 1\n" +
                                "1 2\n" +
                                "1 5\n" +
                                "2 6\n")
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int taskAmount, int executorAmount, int queueAmount, String[] data, String expected) {
        assertEquals(expected, solution.forTest(taskAmount, executorAmount, queueAmount, data));
    }

    @Test
    void qBoxTest() {
        Solution.QBox qBox = new Solution.QBox(3);
        qBox.put(new Solution.Task(1, 5));
        qBox.put(new Solution.Task(1, 5));
        qBox.put(new Solution.Task(3, 5));
        qBox.put(new Solution.Task(3, 5));
        qBox.put(new Solution.Task(2, 5));
        qBox.put(new Solution.Task(2, 5));
        qBox.put(new Solution.Task(3, 5));

        assertTrue(qBox.hasNext());
        assertEquals(1, qBox.getTask().q);
        assertEquals(1, qBox.queues.get(0).size());

        assertEquals(1, qBox.queues.get(2).timeWithoutWork);
        assertEquals(1, qBox.queues.get(1).timeWithoutWork);
        assertEquals(0, qBox.queues.get(0).timeWithoutWork);

        assertTrue(qBox.hasNext());
        assertEquals(2, qBox.getTask().q);
        assertEquals(1, qBox.queues.get(1).size());

        assertEquals(3, qBox.getTask().q);

    }

}