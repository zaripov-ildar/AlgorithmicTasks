package LeetCode.CloneGraph_133;

import org.junit.jupiter.api.Test;

import LeetCode.HandsomeMethods;
import LeetCode.Node;

import static org.junit.jupiter.api.Assertions.*;
import static LeetCode.HandsomeMethods.*;

class SolutionTest {

    Solution solution = new Solution();

//    private static Stream<Arguments> testArguments(){
//        return Stream.of(
//                Arguments.of(),
//                Arguments.of(),
//                Arguments.of()
//                );
//    }

//    @ParameterizedTest
//    @MethodSource("testArguments")
    @Test
    void test() {
	int[][] arr = new int[][] { { 2, 4 }, { 1, 3 }, { 2, 4 }, { 1, 3 } };
	Node node = createNode(arr);
	assertTrue(HandsomeMethods.equals(node, solution.cloneGraph(node)));
    }
}