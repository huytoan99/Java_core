import java.sql.SQLOutput;
import java.util.Scanner;

public class HamMath {
    public static void main(String[] args) {
//        System.out.println(Math.E);
//        System.out.println(Math.PI);
//
////        var r = 5.213;
////        var area =  r * r * Math.PI;
////        System.out.println(area);
////        System.out.println(Math.abs(-200));
//
//        int x = 100;
//        System.out.println(Math.sqrt(x));

        //Bài 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập n: ");
//        int n = sc.nextInt();
//        System.out.println("Giá trị tuyệt đối của n là: |n| = " + Math.abs(n));

        //Bài 2:
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Nhập n: ");
//            int n = sc.nextInt();
//            System.out.println("Căn bậc 2 của n là:" + Math.sqrt(n));
//            System.out.println("Căn bậc 3 của n là:" + Math.cbrt(n));

        //Bài 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào 1 góc hệ degree: ");
//        double n = sc.nextDouble();
//        double sinX = Math.sin(Math.toRadians(n));
//        double cosX = Math.cos(Math.toRadians(n));
//        double tanX = Math.tan(Math.toRadians(n));
//
//        System.out.println("sin(" + n + ") = " + sinX);
//        System.out.println("cos(" + n + ") = " + cosX);
//        System.out.println("tan(" + n + ") = " + tanX);

        //Bài 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập a: ");
//        int a = sc.nextInt();
//        System.out.print("Mời nhập b: ");
//        int b = sc.nextInt();
//        System.out.println("Giá trị lớn nhất là: " + Math.max(a,b));
//        System.out.println("Giá trị nhỏ nhất là: " + Math.min(a,b));

        //Bài 5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập a: ");
//        float a = sc.nextFloat();
//        System.out.print("Mời nhập b: ");
//        float b = sc.nextFloat();
//        float result = a / b;
//        System.out.println("Kết quả a / b = " + Math.round(result));

        //Bài 6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập a: ");
//        int a = sc.nextInt();
//        System.out.print("Mời nhập b: ");
//        int b = sc.nextInt();
//        System.out.println("Kết quả a ^ b là: " + Math.pow(a, b));
//        System.out.println("Kết quả b ^ a là: " + Math.pow(b, a));

        //Bài 7
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập n: ");
//        int n = sc.nextInt();
//        var randNumber = Math.random() * Math.pow(10, n); // sinh số ngẫu nhiên
//        var tmp = (int)randNumber; // ép kiểu sang int
//        var result = tmp % n; // lấy dư để đảm bảo kết quả trong [0, n)
//        System.out.println(result);

        //Bài 8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập bán kính hình tròn: ");
//        double a = sc.nextDouble();
//        //Chu vi hình tròn
//        double chuvi = 2 * Math.PI * a;
//        //Diện tích hình tròn
//        double dientich = a * a * Math.PI;
//        System.out.println("Chu vi hình tròn là: " + chuvi);
//        System.out.println("Diện tích hình tròn là: " + dientich);

        // Bài 9
//        var a = 60;
//        var b = 80;
//        var c = 60;
//
//        var p = 0.5 * (a + b + c);
//
//        var area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//        System.out.println("Diện tích tam giác là: " + area);

        //Bài 10:
        var c = 100; // cạnh huyền
        var alpha = 35; // góc alpha
        // tìm cạnh đối góc alpha
        var a = c * Math.sin(Math.toRadians(alpha));
        // tìm cạnh kề góc alpha
        var b = c * Math.cos(Math.toRadians(alpha));
        // tính chu vi, diện tích của tam giác:
        var perimeter = a + b + c;
        var area = 0.5 * a * b;
        // hiện kết quả
        System.out.println("Chu vi tam giác = " + perimeter);
        System.out.println("Diện tích tam giác = " + area);
    }
}
