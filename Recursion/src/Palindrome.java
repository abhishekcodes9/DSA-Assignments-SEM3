public class Palindrome{
    static boolean palindrome(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return palindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";

        System.out.println(
                palindrome(s, 0, s.length() - 1)
        );
    }
}
