class Task10 {
    public static boolean isCircularPalindrome(String s) {
        String doubled = s + s;

        for (int i = 0; i < s.length(); i++) {
            String sub = doubled.substring(i, i + s.length());
            if (isPalindrome(sub))
                return true;
        }
        return false;
    }

    private static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        return true;
    }
}