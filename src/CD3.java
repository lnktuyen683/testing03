import java.util.HashMap;

public class CD3 {
    public class TwoSumSorted {
        public static int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;

            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{-1, -1};
        }

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public class MinimumWindowSubstring {
        public static String minWindow(String s, String t) {
            if (s.length() < t.length()) return "";

            HashMap<Character, Integer> mapT = new HashMap<>();
            for (char c : t.toCharArray()) {
                mapT.put(c, mapT.getOrDefault(c, 0) + 1);
            }

            int left = 0, right = 0, minLen = Integer.MAX_VALUE;
            int start = 0, count = 0;
            HashMap<Character, Integer> mapS = new HashMap<>();

            while (right < s.length()) {
                char c = s.charAt(right);
                mapS.put(c, mapS.getOrDefault(c, 0) + 1);

                if (mapT.containsKey(c) && mapS.get(c) <= mapT.get(c)) {
                    count++;
                }

                while (count == t.length()) { // Khi cửa sổ đã hợp lệ
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        start = left;
                    }

                    char leftChar = s.charAt(left);
                    mapS.put(leftChar, mapS.get(leftChar) - 1);

                    if (mapT.containsKey(leftChar) && mapS.get(leftChar) < mapT.get(leftChar)) {
                        count--;
                    }

                    left++;
                }

                right++;
            }
            return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
        }
    }
}

