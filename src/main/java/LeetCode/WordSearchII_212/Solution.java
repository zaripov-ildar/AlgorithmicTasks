package LeetCode.WordSearchII_212;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private int m, n;
    private List<String> res;
    char[][] board;

    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        m = board.length;
        n = board[0].length;
        Trie trie = new Trie();
        res = new ArrayList<>();
        for (String word : words) {
            trie.insert(word);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                backTrack(trie, i, j);
            }
        }
        return res;
    }

    private void backTrack(Trie trie, int i, int j) {
        char c = board[i][j];
        if (c == '*' || trie.arr[c-'a'] == null) {
            return;
        }
        trie = trie.arr[c-'a'];
        if (trie.word != null) {
            res.add(trie.word);
            trie.word = null;
        }
        board[i][j] = '*';
//        up
        if (i < m - 1) {
            backTrack(trie, i + 1, j);
        }
//        down
        if (i > 0) {
            backTrack(trie, i - 1, j);
        }
//        left
        if (j > 0) {
            backTrack(trie, i, j - 1);
        }
//        right
        if (j < n - 1) {
            backTrack(trie, i, j + 1);
        }
        board[i][j] = c;
    }
}
