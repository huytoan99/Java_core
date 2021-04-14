import java.util.Scanner;

public class BaiTapPhuongThuc {
    public static void main(String[] args) {
//        // Bài 1: Viết thông điệp nhập vào rồi hiển thị ngược lại bằng viết phương thức ngoài main
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập thông điệp: ");
//        var str = sc.nextLine();
//        str = str.trim();
//        status(str);
//    }
//
//    public static void status(String str) {
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.println(str.charAt(i));
//        }
//
//    }


        //Bài 2: Viết phương thức kiểm tra giá trị số nguyên n có phải số thuận nghịch hay không ?
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên n: ");
//        var n = sc.nextInt();
//        boolean isRev = result(n); //gọi p.thức và gán giá trị nhận đc cho isRev
//        if (isRev) {
//            System.out.println(" là số thuận nghịch");
//        } else {
//            System.out.println("Không là số thuận ngịch");
//        }
//    }
//
//    private static boolean result(int n) {
//        int m = n; // lưu n ra biến khác để tránh mất dữ liệu
//        int rev = 0;
//        while (m > 0) {
//            rev = rev * 10 + m % 10;
//            m /= 10;
//        }
//        return n == rev; // nếu n=rev thì return true ngược lại return false
//    }

        //Bài 3: Viết phương thức tìm giá trị nhỏ nhất trong ba số thực.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        var c = sc.nextInt();
//        var minValue = min(a, b, c);
//        System.out.println("Số lớn nhất trong 3 số(" + a + ", " + b + ", " + c + ") = " + minValue);
//    }
//
//    private static double min(double a, double b, double c) {
//        double min = a;
//        if (min > b) {
//            min = b;
//        } if (min > c) {
//            min = c;
//        }
//        return min;
//    }

        //Bài 4: Tìm giá trị lớn nhất trong ba số
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào 3 số, mỗi số cách nhau bằng 1 dấu cách: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        var c = sc.nextInt();
//        var maxValue = max(a, b, c);
//        System.out.println("Giá trị lớn nhất trong 3 số " + ( + a + "," + b + "," + c) + " là: " + maxValue);
//    }
//
//    private static double max(double a, double b, double c) {
//        double max = a;
//        if (max < b) {
//            max = b;
//        } if (max < c) {
//            max = c;
//        }
//        return max;
//    }


        //Bài 5: Viết chương trình tìm trung bình cộng của ba số
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào 3 số: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        var c = sc.nextInt();
//        var sumValue = sum(a, b, c);
//        System.out.println("Trung bình cộng của " + (+a + "+" + b + "+" + c) + " là: " + sumValue);
//    }
//
//    private static Integer sum(int a, int b, int c) {
//        var sum = (a + b + c) / 3;
//        return sum;
//    }


        //Bài 6: Viết phương thức hiển ra số đầu tiên của 1 số nhập vào
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số n: ");
//        var n = sc.nextInt();
//        index(n);
//    }
//
//    private static void index(int n) {
//        while (n > 10) {
//            n = n / 10;
//        }
//        System.out.println("Chữ số đầu tiên là: " + n);
//    }


        //Bài 7: Viết phương thức tính tổng các các chữ số của 1 số nguyên dương
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương: ");
//        var n = sc.nextInt();
//        Sum(n);
//    }
//
//    private static void Sum(int n) {
//        var sum = 0;
//        while (n > 0) {
//            sum = sum + n % 10;
//            n = n / 10;
//        }
//        System.out.println("S= " + sum);
//    }


        //Bài 8: Viết phương thức tìm UCLN của hai số nguyên dương
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào 2 số nguyên dương: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("UCLN(" + a + ", " + b + ") = " + UCLN(a, b));
//    }
//
//    private static int UCLN(int a, int b) {
//        while ( a != b) {
//            if ( a > b) {
//                a = a - b;
//            } else {
//                b -= a;
//            }
//        }
//        return a;
//    }


        //Bài 9: Viết phương thức đếm số từ của một câu nhập vào từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào câu: ");
//        var str = sc.nextLine();
//        str = str.replaceAll("\\s+", " "); // thay thế 1 hoặc nhiều dấu cách giữa bằng 1 dấu cách
//        str = str.trim();
//        System.out.println("Tổng số từ của câu là: " + coutWord(str));
//    }
//
//    private static int coutWord(String str) {
//        var count = 0;
//        if (!str.isEmpty()) { // nếu string k rỗng thì chắc chắn có 1 từ
//            count++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {  // nếu gặp dấu cách thì có thêm từ, tăng biến count lên 1.
//                count++;
//            }
//        }
//        return count;
//    }


        //Bài 10: Viết phương thức đếm ký tự các số nguyên âm trong 1 câu tiếng anh nhập vào từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào câu tiếng anh: ");
//        var str = sc.nextLine();
//        var count = countVowl(str.toLowerCase());
//        System.out.println("Số nguyên âm trong câu: " + count);
//    }
//
//    private static int countVowl(String str) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
//                    || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//                    count++;
//            }
//        }
//        return 0;
//    }


        //Bài 11: Nhập vào 2 số nguyên dương a < b. Viết phương thức liệt kê các số chính phương trong khoảng [a->b]
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào 2 số nguyên dương: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        Number(a, b);
//    }
//
//    public static int Number(int a, int b) {
//        var low = (int) Math.ceil(Math.sqrt(a));
//        var hight = (int) Math.floor(Math.sqrt(b));
//        System.out.println("Các số chính phương trong đoạn [a, b] là: ");
//        for (int i = low; i <= hight; i++) {
//            System.out.print((i * i) + " ");
//        }
//        return 0;
//    }


        //Bài 12: Viết chương trình liệt kê các chữ số có 6 chữ số thỏa mãn:
        // - Là số nguyên tố
        // - Tổng các chữ số là số nguyên tố
        // - Từng chữ số trong đó cũng là số nguyên tố.
        int count = 0;
        for (int i = 10000; i <= 999999; i++) {
                if (isPrime(i) && isDigitPrime(i) && isSumNumberPrime(i)) {
                    System.out.print(i + " "); // in i ra
                    count++;
                    if (count % 10 == 0) { // nếu đếm thấy đạt 10 phần tử
                        count = 0; // reset biến đếm
                        System.out.println(); // in xuống dòng
                    }
                }
            }
        }

    public static boolean isDigitPrime(int n) {
        while (n > 0) { // kiểm tra từng chữ số
            if (!isPrime(n % 10)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // phương thức kiểm tra tổng chữ số có phải là số nguyên tố hay không ?
    public static boolean isSumNumberPrime(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return isPrime(sum);
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
