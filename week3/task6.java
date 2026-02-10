class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int h = heights[i];
                    heights[i] = heights[j];
                    heights[j] = h;

                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }
}
