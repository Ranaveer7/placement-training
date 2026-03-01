class Task2 {

    private int[] buildLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else
                    lps[i++] = 0;
            }
        }
        return lps;
    }

    public boolean repeatedSubstringPattern(String s) {
        int[] lps = buildLPS(s);
        int n = s.length();
        int len = lps[n - 1];
        return (len > 0 && n % (n - len) == 0);
    }
}