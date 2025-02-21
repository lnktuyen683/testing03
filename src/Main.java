public class Main {
    public static void main(String[] args) {
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
    }
}