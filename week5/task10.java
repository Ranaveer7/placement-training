public static List<Integer> search(String pat, String txt) {
    List<Integer> result = new ArrayList<>();

    int m = pat.length();
    int n = txt.length();

    for (int i = 0; i <= n - m; i++) {
        int j;
        for (j = 0; j < m; j++) {
            if (txt.charAt(i + j) != pat.charAt(j))
                break;
        }
        if (j == m) {
            result.add(i); // 0-based index
        }
    }

    return result;
}