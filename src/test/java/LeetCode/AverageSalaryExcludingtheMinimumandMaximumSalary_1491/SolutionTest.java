package LeetCode.AverageSalaryExcludingtheMinimumandMaximumSalary_1491;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new int[]{4000, 3000, 1000, 2000}, 2500d),
                Arguments.of(new int[]{1000, 2000, 3000}, 2000d),
                Arguments.of(new int[]{48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000}, 41111.11111d)
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int[] salary, double expected) {
        double result = solution.average(salary);
        assertTrue(Math.abs(result - expected) <= 0.00001);
    }
}