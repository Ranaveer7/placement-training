class Task1 {
    public static int stringSimilarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int left = 0, right = 0;
        int sum = n;

        for (int i = 1; i < n; i++) {
            if (i <= right)
                z[i] = Math.min(right - i + 1, z[i - left]);

            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
                z[i]++;

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
            sum += z[i];
        }
        return sum;
    }
}