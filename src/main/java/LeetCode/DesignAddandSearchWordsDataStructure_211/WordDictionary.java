package LeetCode.DesignAddandSearchWordsDataStructure_211;


class WordDictionary {
    boolean isEndOfWord;
    private final WordDictionary[] branches;

    public WordDictionary() {
        branches = new WordDictionary[26];
    }

    public void addWord(String word) {
        WordDictionary curr = this;
        for (int i = 0; i < word.length(); i++) {
            int index = getIndex(word, i);
            if (curr.branches[index] == null)
                curr.branches[index] = new WordDictionary();
            curr = curr.branches[index];
        }
        curr.isEndOfWord = true;
    }

    private int getIndex(String word, int i) {
        return word.charAt(i) - 'a';
    }

    public boolean search(String word) {
        WordDictionary curr = this;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '.') {
                for (WordDictionary c : curr.branches) {
                    if (c != null && c.search(word.substring(i + 1))) {
                        return true;
                    }
                }
                return false;
            }
            int index = getIndex(word, i);
            if (curr.branches[index] == null) return false;
            curr = curr.branches[index];
        }
        return curr != null && curr.isEndOfWord;
    }
}
