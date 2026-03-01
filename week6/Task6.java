import java.util.*;

class Task6 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
            return result;

        int[] count = new int[26];

        for (char c : p.toCharArray())
            count[c - 'a']++;

        int left = 0, right = 0, needed = p.length();

        while (right < s.length()) {
            if (count[s.charAt(right) - 'a']-- > 0)
                needed--;

            right++;

            if (needed == 0)
                result.add(left);

            if (right - left == p.length()) {
                if (count[s.charAt(left) - 'a']++ >= 0)
                    needed++;
                left++;
            }
        }
        return result;
    }
}