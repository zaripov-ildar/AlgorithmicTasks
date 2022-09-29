package LeetCode.SatisfiabilityOfEqualityEquations_990;

class Solution {
    int[] links = new int[26];

    {
        for (int i = 0; i < links.length; i++) {
            links[i] = i;
        }
    }

    public boolean equationsPossible(String[] equations) {
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                links[getFirstLink(equation.charAt(3) - 'a')] = links[getFirstLink(equation.charAt(0) - 'a')];
            }
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!' &&
                    links[getFirstLink(equation.charAt(3) - 'a')] == links[getFirstLink(equation.charAt(0) - 'a')]) {
                return false;
            }
        }
        return true;
    }

    private int getFirstLink(int index) {
        if (links[index] == index) {
            return index;
        }
        return getFirstLink(links[index]);
    }
}
