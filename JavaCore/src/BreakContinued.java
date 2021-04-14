import java.util.Scanner;

public class BreakContinued {
    public static void main(String[] args) {
        // Ví dụ 1: Tìm giá trị đầu tiên trong giá trị [a,b] chia hết cho k != 0.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào 2 số nguyên a < b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("Nhập vào số nguyên k, k khác 0: ");
//        var k = sc.nextInt();
//        if (k != 0) {
//            for (int i = a; i <= b; i++) {
//                if (i % k == 0) {
//                    System.out.println("Giá trị thỏa mãn: " + i);
//                    break;
//                }
//            }
//        } else {
//            System.out.println("Vui lòng nhập k khác 0.");
//        }

        // Ví dụ 2: Liệt kê ra các giá trị trong đoạn [a,b] chia hết cho k != 0
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào 2 số nguyên a < b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("Nhập vào số nguyên k, k khác 0: ");
//        var k = sc.nextInt();
//        if (k != 0) {
//            System.out.println("Các giá trị chia hết cho K: ");
//            for (int i = a; i <= b; i++) {
//                if (i % k != 0) {
//                    continue;
//                }
//                System.out.print(i + " ");
//            }
//        } else {
//            System.out.println("Nhập k khác 0.");
//        }

        //Bài tập 1: Nhập vào 1 số nguyên dương. Tìm ước số nguyên tố nhỏ nhất của n
//        var input = new Scanner(System.in);
//        System.out.println("Nhập số nguyên dương n: ");
//        // tìm ước số nguyên tố nhỏ nhất của n
//        var n = input.nextInt();
//
//        //for (int i = 2; i <= n; i++) { // Ước nguyên tố nhỏ nhất thì dùng dòng này
//        for (int i = n; i >= 2; i--) { // tìm ước nguyên tố lớn nhất thì dùng dòng này
//
//            boolean isPrime = true; // mặc định ban đầu giả sử i ng.tố
//            var bound = (int) Math.sqrt(i); // lấy phần nguyên căn i
//            // tiến hành kiểm chứng i có ng.tố hay không
//            for (int j = 2; j <= bound; j++) {
//                if (i % j == 0) {
//                    isPrime = false; // đánh dấu k phải số ng.tố
//                    break; // thoát lặp for với j
//                }
//            }
//            if (isPrime && n % i == 0) { // nếu i ng.tố và n chia hết cho i
//                System.out.println("Giá trị thỏa mãn: " + i);
//                break; // kết thúc vòng lặp tìm ước ng.tố nhỏ nhất
//            }
//        }

        // Bài 6: Viết chương trình đọc vào các giá trị từ bàn phím. Việc đọc sẽ dừng khi đọc được số nguyên tố đầu tiên
        //Hiện giá trị nguyên tố ra màn hình.
        Scanner sc = new Scanner(System.in);
        var n = 0;
        for (; ; ) {
            System.out.println("Mời nhập giá trị: ");
            n = sc.nextInt();
            boolean isPrime = true; // Giả sử ban đầu i là nguyên tố
            var bound = (int) Math.sqrt(n); // Lây phần nguyên căn của n
            if (n < 2) {
                isPrime = false;
            }
            //Tiến hành kiểm tra n có phải nguyên tố không
            for (int j = 2; j <= bound; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Giá trị thỏa mãn: " + n);
                break;
            }
        }

    }
}
