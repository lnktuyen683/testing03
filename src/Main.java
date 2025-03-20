import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CD1
        System.out.println("BAI TAP CAP DO 1");
        System.out.println(CD1.XoaNguyenAm("Tuyen"));
        System.out.println(CD1.XoaNguyenAm("hello"));

        int[] arr1 = {1, 3, 4, 5, 0, 2};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {3};

        System.out.println(CD1.GiaTriSecondMax.TimGiaTriMaxSecond(arr1));
        System.out.println(CD1.GiaTriSecondMax.TimGiaTriMaxSecond(arr2));
        System.out.println(CD1.GiaTriSecondMax.TimGiaTriMaxSecond(arr3));

        System.out.println(CD1.TongChan.SumChan(10));
        System.out.println(CD1.TongChan.SumChan(5));

        System.out.println(CD1.DemTu.Dem("Xin chào các bạn"));
        System.out.println(CD1.DemTu.Dem("Hello World"));
        //CD2
        System.out.println("BAI TAP CAP DO 2");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double income = scanner.nextDouble();
        double tax = CD2.Tax.calculateTax(income);

        System.out.println("Số thuế phải trả: " + tax + " triệu đồng");

        scanner.nextLine();
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();


        if (CD2.PalindromeChecker.isPalindrome(input)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        scanner.close();

        System.out.println(CD2.XoaKiTu.removeDuplicates("programming"));
        System.out.println(CD2.XoaKiTu.removeDuplicates("abca"));

        //CD3
        System.out.println("BAI TAP CAP DO 3");
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = CD3.TwoSumSorted.twoSum(numbers, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

        System.out.println(CD3.longestPalindrome("babad"));
        System.out.println(CD3.longestPalindrome("cbbd"));
        System.out.println(CD3.longestPalindrome("a"));
        System.out.println(CD3.longestPalindrome("ac"));

        System.out.println(CD3.MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(CD3.MinimumWindowSubstring.minWindow("a", "a"));
        System.out.println(CD3.MinimumWindowSubstring.minWindow("a", "aa"));
    }

}
