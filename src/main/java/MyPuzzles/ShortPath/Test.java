package MyPuzzles.ShortPath;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome("123456754321"));
    }

    public static boolean isPalindrome(String text) {
        int right = text.length() - 1;
        int left = 0;
        while (left <= right) {
            while (left < right && isNotSymbol(text.charAt(left))) {
                left++;
            }
            while (left < right && isNotSymbol(text.charAt(right))) {
                right--;
            }
            if (!equals(text.charAt(left), text.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isNotSymbol(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }

    private static boolean equals(char a, char b) {
        return toLowerCase(a) == toLowerCase(b);
    }

    private static char toLowerCase(char c) {
        int diff = 'a' - 'A';
        if (c >= 'A' && c <= 'Z') return (char) (c + diff);
        return c;
    }
}
