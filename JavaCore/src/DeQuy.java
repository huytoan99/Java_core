import java.util.Scanner;

public class DeQuy {
    public static void main(String[] args) {
        // VD 1: Tính tổng S = 1 + 2 + ... + n. Với n nguyên dương nhập từ bàn phím
//        var n = 10;
//        System.out.println(add(n));
//    }
//
//    public static int add(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + add(n - 1);
//        }
//    }





        //VD 2: Tính n!. Với n >= 0 nhập từ bàn phím.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào n: ");
//        var n = sc.nextInt();
//        System.out.println("Kết quả của " + n + " giai thừa là: " + fact(n));
//    }
//
//    public static long fact(int n) {
//        if (n < 2) {
//            return 1;
//        } else {
//            return n * fact(n - 1);
//        }
//   }
        // Hoặc dùng kiểu này:
//        public static long fact(int n) {
//            long giai_thua = 1;
//            if (n == 0 || n == 1) {
//                return giai_thua;
//            } else {
//                for (int i = 2; i <= n; i++) {
//                    giai_thua *= i;
//                }
//                return giai_thua;
//            }
//        }





        //Ví dụ 3: Tìm số Fibonaci thứ n nằm trong khoảng từ 0 -> n -> 90.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào n: ");
//        var n = sc.nextInt();
//        System.out.println("Kết quả là: " + fibo(n));
    }
        // Phương pháp sử dụng đệ quy
//    public static long fibo(int n) {
//        if (n < 2) {
//            return n;
//        } else {
//            return fibo(n - 1) + fibo(n - 2);
//        }
//    }
    // Không dùng đệ quy
//    public static long fibo(int n) {
//        int f0 = 0;
//        int f1 = 1;
//        int fn = 1;
//        if (n < 0) {
//            return -1;
//        } else if (n == 0 || n == 1) {
//            return n;
//        } else {
//            for (int i = 2; i < n; i++) {
//                f0 = f1;
//                f1 = fn;
//                fn = f1 + f0;
//            }
//        }
//        return fn;
//    }
}
