import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Ví dụ 1: Kiểm tra n có phải là số đẹp hay không ?
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào số nguyên dương n: ");
//        var n = sc.nextInt();
//        var m = n; // Tạo biến trung gian
//        var revert = 0; // lưu giá trị đảo của n
//        // Kiểm tra
//        while (m > 0) {
//            revert = revert * 10 + m % 10;
//            m /= 10;
//        }
//        if (n == revert) {
//            System.out.println("n là số đẹp");
//        } else {
//            System.out.println("n không là số đẹp");
//        }
//    }

        // ví dụ 2:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hai số thực a và b: ");
        var a = sc.nextDouble();
        var b = sc.nextDouble();
        var choice = 0;
        do {
            System.out.println("Chọn chức năng: ");
            System.out.println("1: Cộng hai số");
            System.out.println("2: Trừ hai số");
            System.out.println("3: Nhân hai số");
            System.out.println("4: Chia hai số");
            System.out.println("0: Thoát chương trình");
            System.out.print("Mời nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Tạm biệt");
                    break;
                case 1:
                    var sum = a + b;
                    System.out.println("KQ = " + sum);
                    break;
                case 2:
                    var sum1 = a - b;
                    System.out.println("KQ = " + sum1);
                    break;
                case 3:
                    var sum2 = a * b;
                    System.out.println("KQ = " + sum2);
                    break;
                case 4:
                    var sum3 = a / b;
                    System.out.println("KQ = " + sum3);
                    break;
                default:
                    System.out.println("Sai chức năng, vui lòng chọn từ 0 tới 4.");
                    break;
            }
            System.out.println("------------------------------------------------------");
        } while (choice != 0);
    }
}



        //Bài 1: Nhập vào số nguyên dương n. Tìm tất cả  các ước tự nhiên của n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương: ");
//        var n = sc.nextInt();
//        System.out.println("Các ước tự nhiên của số vừa nhập là: ");
//        int i = 1;
//        while (i <= n) {
//            if (n % i == 0) {
//                System.out.println(i + " ");
//            }
//            i++;
//        }



        // Bài 2: Nhập vào hai số nguyên dương a và b. Tìm ước chung lớn nhất và bội chung nhỏ nhất của a và b
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào hai số a và b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        var cm = a * b;
//        // có nhiều cách tìm ước chung lớn nhất, sau đây trình bày cách đơn giản
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        // lúc này ta đã có ước chung max là a hoặc b vì a = b
//        var lcm = cm / a; // BCNN
//        System.out.println("UCLN = " + a + "\nBCNN = " + lcm);



        // Bài 3: Nhập vào 1 số nguyên dương n. Tính tổng các chữ số của n bằng vòng lặp while
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương: ");
//        var n = sc.nextInt();
//        var sum = 0;
//        while (n > 0) {
//            sum += n % 10;  // lấy phần đơn vị của n
//            n /= 10;    // loại bỏ phần đơn vị đã lấy của n
//        }
//        System.out.println("SUM = " + sum);



        // Bài 4: Nhập vào một thông điệp và hiển thị các ký tự trong thông điệp từ cuối lên đầu.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập thông điệp: ");
//        var str = sc.nextLine();
//        int i = str.length() - 1;
//        System.out.println("Chuỗi kết quả: ");
//        while (i >= 0) {
//            System.out.println(str.charAt(i));
//            i--;
//        }



        // Bài 5: Viết chương trình cho phép tính tổng tất cả các giá trị vừa nhập từ bàn phím.
        // Việc nhập vào sẽ dừng khi người nhập vào số 0. Hiện tổng cuối lên màn hình
//        var input = new Scanner(System.in);
//        var sum = 0; // kiểu int
//        var n = -1;
//        while (n != 0) {
//            System.out.println("Nhập 0 để thoát, nhập giá trị khác để cộng tổng: ");
//            n = input.nextInt();
//            sum += n;
//        }
//        System.out.println("Tổng các số đã nhập: " + sum);
//



        //Bài 6: Viết chương trình giải phương trình bậc 2. Yêu cầu nhập hệ số a khác 0, nếu nhập a = 0 thì yêu cầu nhập lại
//        Scanner sc = new Scanner(System.in);
//        double a = 0;
//        double b, c;
//        while (a == 0) {
//            System.out.println("Mời nhập hệ số a, a khác không: ");
//            a = sc.nextDouble();
//        }
//        System.out.println("Mời nhập hệ số b: ");
//        b = sc.nextDouble();
//        System.out.println("Mời nhập hệ số : ");
//        c = sc.nextDouble();
//        var delta = b * b - 4 * a * c;
//        if (delta < 0) {
//            System.out.println("Phương trình vô nghiệm");
//        } else if (delta == 0) {
//            System.out.println("Phương trình có nghiệm kép x = " + (-b / (2 * a)));
//        } else {
//            var x1 = (-b - Math.sqrt(delta)) / (2 * a);
//            var x2 = (-b + Math.sqrt(delta)) / (2 * a);
//            System.out.println("Nghiệm x1 =" + x1);
//            System.out.println("Nghiệm x2 =" + x2);
//        }




        // Bài 7: Nhập vào số nguyên dương, tính tổng s= 1 + 1/4 + 1/9 + ... + 1/n2 sử dụng vòng lặp while
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương n: ");
//        var n = sc.nextInt();
//        var sum = 0.0;
//        var i = 1;
//        while (i <= n) {
//            sum += 1.0 / (i * i);
//            i++;
//        }
//        System.out.println("S = " + sum);




        // Bài 8: Nhập vào số nguyên dương n. Tìm chữ số đầu tiên của n sử dụng vòng lặp while
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương: ");
//        var n = sc.nextInt();
//        while (n > 10) { // tìm chữ số đầu tiên của n: chia lấy nguyên chừng nào n > 10 là ra
//            n = n / 10;
//        }
//        System.out.println("Số đầu tiên là: " + n);

        // Bài 9: Nhập vào số nguyên dương n. Tìm tổng chữ số đầu tiên và cuối cùng của n bằng vòng lặp while
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương: ");
//        var n = sc.nextInt();
//        var sum = n % 10;
//        while (n > 10) {
//            n /= 10;
//        }
//        sum += n;
//        System.out.println("KQ = " + sum);

        // Bài 10; Nhập vào số nguyên dương n, đếm xem n có bao nhiêu chữ số. Sử dụng vòng lặp while
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập số nguyên dương n: ");
//        var n = sc.nextInt();
//        var sum = 0;
//        while (n > 0) {
//            n /= 10;
//            sum++;
//        }
//        System.out.println("Tổng chữ số của n là: " + sum);

        //Bài 11: Nhập vào số nguyên là tháng của năm trong đoạn [0-12]. Viết chương trình sử dụng cấu trúc switch kết hợp
        //do - while để phân loại và hiển thị các mùa trong năm.
//        Scanner sc = new Scanner(System.in);
//        var number = 0;
//        do {
//            System.out.println("--------------------------");
//            System.out.println("Mời nhập lựa chọn: ");
//            number = sc.nextInt();
//            var season = "";
//            switch (number) {
//                case 0:
//                    System.out.println("Kết thúc chương trình");
//                    break;
//                case 1:
//                case 2:
//                case 3:
//                    System.out.println("Mùa xuân");
//                    break;
//                case 4:
//                case 5:
//                case 6:
//                    System.out.println("Mùa hạ");
//                    break;
//                case 7:
//                case 8:
//                case 9:
//                    System.out.println("Mùa thu");
//                    break;
//                case 10:
//                case 11:
//                case 12:
//                    System.out.println("Mùa đông");
//                    break;
//                default:
//                    System.out.println("không có lựa chọn này");
//            }
//        } while (number != 0);

        // Bài 12: Con giáp tương tự bài trên
//        var sc = new Scanner(System.in);
//        var number = 0;
//        do {
//            System.out.println("========================================");
//            System.out.println("Nhập giá trị số từ 1-12 để xem con giáp: ");
//            number = sc.nextInt();
//            var zodiac = ""; // biến lưu tên con giáp
//            // tiến hành đánh giá với switch
//            switch (number) {
//                case 0:
//                    System.out.println("Kết thúc chương trình");
//                    break;
//                case 1:
//                    zodiac = "Tý";
//                    break;
//                case 2:
//                    zodiac = "Sửu";
//                    break;
//                case 3:
//                    zodiac = "Dần";
//                    break;
//                case 4:
//                    zodiac = "Mão";
//                    break;
//                case 5:
//                    zodiac = "Thìn";
//                    break;
//                case 6:
//                    zodiac = "Tỵ";
//                    break;
//                case 7:
//                    zodiac = "Ngọ";
//                    break;
//                case 8:
//                    zodiac = "Mùi";
//                    break;
//                case 9:
//                    zodiac = "Thân";
//                    break;
//                case 10:
//                    zodiac = "Dậu";
//                    break;
//                case 11:
//                    zodiac = "Tuất";
//                    break;
//                case 12:
//                    zodiac = "Hợi";
//                    break;
//                default:
//                    System.out.println("Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]");
//            }
//            if (!zodiac.isEmpty()) {
//                System.out.println("STT " + number + " là con giáp: " + zodiac);
//            }
//        } while (number != 0);

        // Bài 13: Chuyển đổi thứ bằng tiếng việt sang tiếng anh
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào thứ trong tuần: ");
//        var str = sc.nextLine();
//        var result = "";
//        str = str.trim();
//        str = str.toLowerCase();
//        switch (str) {
//            case "thứ hai":
//                result = "Monday";
//                break;
//            case "Thứ ba":
//                result = "Tuesday";
//                break;
//            case "Thứ tư":
//                result = "Wednesday";
//                break;
//            case "Thứ năm":
//                result = "Thursday";
//                break;
//            case "Thứ sáu":
//                result = "Friday";
//                break;
//            case "Thứ bảy":
//                result = "Saturday";
//                break;
//            case "Chủ nhật":
//                result = "Sunday";
//                break;
//            default:
//                System.out.println("Không có kết quả này.");
//        }
//        System.out.println("Kết quả chuyển đổi: ");
//        System.out.println(str + " -> " + result);
//
//    }
//}
