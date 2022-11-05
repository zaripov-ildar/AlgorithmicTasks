package LeetCode.ImplementTriePrefixTree_208;

class Trie {
    private final Trie[] arr;
    private boolean endOfWord;

    public Trie() {
        arr = new Trie[26];
    }

    public void insert(String word) {
        insert(word, 0);
    }

    private void insert(String word, int index) {
        if (index == word.length()) {
            endOfWord = true;
            return;
        }
        int val = word.charAt(index) - 'a';

        if (arr[val] == null) {
            arr[val] = new Trie();
        }
        arr[val].insert(word, index + 1);
    }

    public boolean search(String word) {
        return search(word, 0);
    }

    private boolean search(String word, int i) {
        if (word.length() == i) {
            return endOfWord;
        }

        Trie nextTrie = arr[word.charAt(i) - 'a'];
        if (nextTrie == null) {
            return false;
        }
        return nextTrie.search(word, i + 1);
    }

    public boolean startsWith(String prefix) {
        return startsWith(prefix, 0);
    }

    private boolean startsWith(String prefix, int i) {
        if (i == prefix.length()) {
            return true;
        }
        Trie nextTrie = arr[prefix.charAt(i) - 'a'];
        if (nextTrie == null) {
            return false;
        }

        return nextTrie.startsWith(prefix, i + 1);
    }
}

