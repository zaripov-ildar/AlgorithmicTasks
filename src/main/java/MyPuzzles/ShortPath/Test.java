package MyPuzzles.ShortPath;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome("1234567654321"));
        System.out.println(isPalindrome("123456754321"));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = text.length() - 1;
        int left = 0;
        while (left <= right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
