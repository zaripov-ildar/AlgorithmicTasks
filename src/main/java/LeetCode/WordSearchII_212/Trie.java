package LeetCode.WordSearchII_212;

public class Trie {
    String word;
    Trie [] arr = new Trie[26];
    public void insert(String word){
        Trie curTrie = this;
        for (char c : word.toCharArray()) {
            int val = c-'a';
            if (curTrie.arr[val] == null){
                    curTrie.arr[val] = new Trie();
            }
            curTrie = curTrie.arr[val];
        }
        curTrie.word = word;
    }
}
