package LeetCode.ThreeSumClosest_16;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    static Stream<Arguments> testArguments(){
        return Stream.of(
                Arguments.of(new int[] {2,3,8,9,10}, 16, 15),
                Arguments.of(new int[] {0,3,97,102,200}, 300, 300),
                Arguments.of(new int[] {-1,2,1,-4}, 1, 2),
                Arguments.of(new int[] {-1,2,1,-4}, -5, -4),
                Arguments.of(new int[] {0,0,0}, 1, 0),
                Arguments.of(new int[] {1,1,1,0}, 100, 3),
                Arguments.of(new int[] {4,0,5,-5,3,3,0,-4,-5}, -2, -2),
                Arguments.of(new int[] {558,316,-411,160,801,568,-124,-589,32,897,-33,-767,-528,-180,916,
                        813,351,642,-373,-919,666,973,-165,831,-67,-934,-659,-18,273,201,728,988,-926,409,-573,575,
                        -502,745,724,989,-464,903,975,980,824,-197,-261,-761,966,799,-379,96,9,-680,-15,476,220,-647,
                        365,518,-479,-443,337,-364,968,-617,862,-281,-936,-526,196,829,-191,643,-473,557,-870,553,
                        -506,774,784,-344,-452,510,219,-785,-1,711,-759,-830,10,612,-450,-784,53,976,-314,-908,463,
                        -408,-846,261,689,-856,-687,-949,-163,-621,-233,847,-682,-805,-711,286,40,-831,-12,952,-878,
                        -226,739,11,-342,74,-933,-770,-840,265,702,572,-453,-295,704,-249,-835,191,404,984,-820,321,
                        632,-689,285,-877,-643,-451,-625,84,889,620,-658,861,-397,-952,695,-386,31,827,-539,-350,588,
                        846,-142,314,909,937,625,-230,-553,403,-763,413,904,-994,272,-426,104,-715,-159,-270,716,819,
                        806,891,-47,-100,440,-339,918,-577,508,-554,-478,120,-943,25,-600,-626,336,-567,473,531,195,
                        -259,-267,-883,450,170,733,491,602} ,-8224, -2895),


                Arguments.of(new int[] {13,252,-87,-431,-148,387,-290,572,-311,-721,222,673,538,919,483,
                        -128,-518,7,-36,-840,233,-184,-541,522,-162,127,-935,-397,761,903,-217,543,906,-503,-826,-342,
                        599,-726,960,-235,436,-91,-511,-793,-658,-143,-524,-609,-728,-734,273,-19,-10,630,-294,-453,
                        149,-581,-405,984,154,-968,623,-631,384,-825,308,779,-7,617,221,394,151,-282,472,332,-5,-509,
                        611,-116,113,672,-497,-182,307,-592,925,766,-62,237,-8,789,318,-314,-792,-632,-781,375,939,
                        -304,-149,544,-742,663,484,802,616,501,-269,-458,-763,-950,-390,-816,683,-219,381,478,-129,602,
                        -931,128,502,508,-565,-243,-695,-943,-987,-692,346,-13,-225,-740,-441,-112,658,855,-531,542,
                        839,795,-664,404,-844,-164,-709,167,953,-941,-848,211,-75,792,-208,569,-647,-714,-76,-603,-852,
                        -665,-897,-627,123,-177,-35,-519,-241,-711,-74,420,-2,-101,715,708,256,-307,466,-602,-636,990,
                        857,70,590,-4,610,-151,196,-981,385,-689,-617,827,360,-959,-289,620,933,-522,597,-667,-882,524,
                        181,-854,275,-600,453,-942,134}, -2805, -2805)
                );
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void test(int [] nums, int target, int expected){
        assertEquals(expected, solution.threeSumClosest(nums, target));
    }
}