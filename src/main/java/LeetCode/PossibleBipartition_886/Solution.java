package LeetCode.PossibleBipartition_886;


import java.util.*;

class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if (dislikes.length == 0) {
            return true;
        }
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();
        //since using i to represent people i in dislikes[][] instead of i-1
        int[] color = new int[N + 1];
        Queue<Integer> q = new LinkedList<>();


        for (int i = 1; i <= N; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for (int[] dislike: dislikes) {
            adjList.get(dislike[0]).add(dislike[1]);
            adjList.get(dislike[1]).add(dislike[0]);
        }

        //since using i to represent people i in dislikes[][] instead of i-1
        for (int index = 1; index <= N; index++) {
            if (color[index] == 0) {
                q.add(index);
                color[index] = 1;

                while (!q.isEmpty()) {
                    int size = q.size();
                    for (int i = 0; i < size; i++) {
                        int person = q.poll();
                        int nextColor = color[person] == 1 ? 2 : 1;
                        List<Integer> dislikePeople = adjList.get(person);
                        for (int dislikePerson : dislikePeople) {
                            if (color[dislikePerson] == color[person]) {
                                return false;
                            }
                            if (color[dislikePerson] == 0) {
                                color[dislikePerson] = nextColor;
                                q.add(dislikePerson);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
