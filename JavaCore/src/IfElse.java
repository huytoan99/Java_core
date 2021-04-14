import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập điểm TB: ");
//        var avgGrade = sc.nextFloat();
//        var level = "";
//        var amount = 0;
//        if (avgGrade >= 3.6f) {
//            System.out.println("Xin chúc mừng bạn đã đc học bổng xuất sắc");
//            level = "Xuất sắc";
//            amount = 10_000_000;
//        } else if (avgGrade >= 3.2f) {
//            System.out.println("Chúc mừng bạn đạt được học bổng giỏi.");
//            level = "Giỏi";
//            amount = 8_500_000;
//        } else if (avgGrade >= 3.0f) {
//            System.out.println("Chúc mừng bạn đạt được học bổng khá.");
//            level = "khá";
//            amount = 7_900_000;
//        } else {
//            System.out.println("Rất tiếc bạn không đạt đc học bổng.");
//        }
//        System.out.println("Loại học bổng: " + level);
//        System.out.println("Số tiền: " + amount);

        // Bài 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập n: ");
//
//        var n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println(n + " là số chẵn");
//        } else {
//            System.out.println(n + " là số lẻ");
//        }

        // Bài 2:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập a: ");
//        var a = sc.nextInt();
//        System.out.println("Nhập b: ");
//        var b = sc.nextInt();
//        if (a > b) {
//            System.out.println("kết quả là: " + a + ">" + b);
//        } else if (a < b) {
//            System.out.println("Kết quả là: " + a + "<" + b);
//        } else if (a == b) {
//            System.out.println("Kết quả là: " + a + "=" + b);
//        }


        //Bài 3:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào chuỗi họ tên: ");
//        var fullName = sc.nextLine();
//        //Kiểm tra chuỗi nhập vào có hợp lệ hay không ?
//        if (fullName.matches("^[a-zA-Z\\s]+$")) {
//            System.out.println("Hợp lệ");
//        } else {
//            System.out.println("Không hợp lệ!!");
//        }

        //Bài 4:
//        Scanner sc = new Scanner(System.in);
//        String str1;
//        String str2;
//        System.out.println("Nhập chuỗi Str1: ");
//        str1 = sc.nextLine();
//        System.out.println("Nhập chuỗi Str2: ");
//        str2 = sc.nextLine();
//        var result = str1.compareTo(str2);
//        //So sánh và kết luận
//        if (result < 0) {
//            System.out.println("str1 đứng trước str2");
//        } else if (result == 0) {
//            System.out.println("Hai chuỗi tương đương");
//        } else {
//            System.out.println("str1 đứng sau str2");
//        }


        //Bài 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập cạnh a: ");
//        var a = sc.nextInt();
//        System.out.println("Nhập cạnh b: ");
//        var b = sc.nextInt();
//        System.out.println("Nhập cạnh c: ");
//        var c = sc.nextInt();
//        if (a <= 0 || b <= 0 || c <= 0) {
//            System.out.println("không là tam giác");
//        } else if ((a + b > c) && (b + c > a) && (c + a > b)) {
//            System.out.println("Có là tam giác");
//        } else {
//            System.out.println("Không là tam giác");
//        }

        //Bài 6
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        var massage = sc.nextLine();
//        if (massage.startsWith(" ")) // Kiểm tra chuỗi vừa nhập có bắt đầu bằng khoảng trắng hay không ?
//        {
//            System.out.println("Có khoảng trắng");
//        } else {
//            System.out.println("Không có khoảng trắng");
//        }

        //Bài 7
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào chuỗi họ tên: ");
//        var fullName = sc.nextLine();
//        //Kiểm tra chuỗi nhập vào chữ cái đầu của họ tên có viết hoa không ?
//        if (fullName.matches("^[A-Z].*")) {
//            System.out.println("Hợp lệ");
//        } else {
//            System.out.println("Không hợp lệ!!");
//        }

        // Bài 8
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào chuỗi ký tự: ");
//        var str = sc.nextLine();
//        //Kiểm tra có trùng ký tự đầu và cuối hay không ?
//        if (str.charAt(0) == str.charAt(str.length() - 1)) {
//            System.out.println("Có trùng ký tự đầu và cuối");
//        } else {
//            System.out.println("Không trùng!");
//        }

        //Bài 9: kiểm tra có là Hình thang không
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự: ");
        double a, b, h;
        a = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        //Kiểm tra
        if (a > 0 && b > 0 && h > 0) {
            double area = (a + b) * h / 2;
            System.out.println(area);
        } else {
            System.out.println("Invalid input");
        }
    }
}
