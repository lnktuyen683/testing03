import java.util.LinkedHashSet;

public class CD2 {
    public class Tax {
        public static double calculateTax(double income) {
            double tax = 0;

            if (income > 80) {
                tax += (income - 80) * 0.35;
                income = 80;
            }
            if (income > 52) {
                tax += (income - 52) * 0.30;
                income = 52;
            }
            if (income > 32) {
                tax += (income - 32) * 0.25;
                income = 32;
            }
            if (income > 18) {
                tax += (income - 18) * 0.20;
                income = 18;
            }
            if (income > 10) {
                tax += (income - 10) * 0.15;
                income = 10;
            }
            if (income > 5) {
                tax += (income - 5) * 0.10;
                income = 5;
            }
            if (income > 0) {
                tax += income * 0.05;
            }

            return tax;
        }
    }

    public class PalindromeChecker {
        public static boolean isPalindrome(String str) {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

    public class XoaKiTu {
        public static String removeDuplicates(String input) {
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            StringBuilder result = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (!set.contains(c)) {
                    set.add(c);
                    result.append(c);
                }
            }

            return result.toString();
        }
    }
}
