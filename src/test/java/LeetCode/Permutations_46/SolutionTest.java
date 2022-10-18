package LeetCode.Permutations_46;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void test(){
        List<List<Integer>> res = solution.permute(new int[]{1,2,3});
        for (List<Integer> re : res) {
            System.out.println(re);
        }
    }

}