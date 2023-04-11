package LeetCode.Permutations_46;

import org.junit.jupiter.api.Test;

import LeetCode.HandsomeMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static LeetCode.HandsomeMethods.*;

class SolutionTest {

    @Test
    void test() {

        for (int i = 0; i < 10; i++) {
            int[] arr = getRandomIntArray(3);
            List<Integer> list = new ArrayList<>(IntStream.of(arr)
                    .boxed()
                    .toList());
            Solution solution = new Solution();
            List<List<Integer>> permutations = solution.permute(arr);
            permutations.remove(list);
            for (List<Integer> p : permutations) {
                assertNotEquals(list, p);
                assertTrue(HandsomeMethods.equals(p, list));
            }
        }
    }

}