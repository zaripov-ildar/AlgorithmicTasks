package LeetCode.FindMedianfromDataStream_295;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    MedianFinder finder;

    private static Stream<Arguments> testArguments() {
        return Stream.of(
                Arguments.of(new String[]{"MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"},
                        new int[][]{{}, {1}, {2}, {}, {3}, {}},
                        new Double[]{null, null, null, 1.5, null, 2.0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testMethod(String[] cmd, int[][] args, Double[] exp) {
        for (int i = 0; i < cmd.length; i++) {
            switch (cmd[i]) {
                case "MedianFinder" -> finder = new MedianFinder();
                case "addNum" -> {
                    for (int j = 0; j < args[i].length; j++) {
                        finder.addNum(args[i][j]);
                    }
                }
                case "findMedian" -> assertEquals(exp[i], finder.findMedian());
            }
        }
    }
}