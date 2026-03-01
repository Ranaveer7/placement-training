class Task5 {
    public static int marsExploration(String s) {
        int count = 0;
        String pattern = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3))
                count++;
        }
        return count;
    }
}