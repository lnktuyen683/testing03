public class CD1 {
    public static String XoaNguyenAm(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result += c;
            }
        }

        return result;
    }

    public class GiaTriSecondMax {
        public static int TimGiaTriMaxSecond(int[] arr) {
            if (arr.length < 2) return Integer.MIN_VALUE;

            int first = arr[0], second = Integer.MIN_VALUE;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i] != first) {
                    second = arr[i];
                }
            }
            return second;
        }
    }

    public class TongChan {
        public static int SumChan(int n) {
            int sum = 0;
            for (int i = 0; i <= n; i += 2) {
                sum += i;
            }
            return sum;
        }
    }
    public class DemTu {
        public static int Dem(String sentence) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if ((i == 0 || Character.isWhitespace(sentence.charAt(i - 1))) && !Character.isWhitespace(sentence.charAt(i))) {
                    count++;
                }
            }
            return count;
        }
    }
}

