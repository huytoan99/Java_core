import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập hai số nguyên a,b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("Nhập lựa chọn của bạn: ");
//        System.out.println("1. Cộng hai số");
//        System.out.println("2. Trừ hai số");
//        System.out.println("3. Nhân hai số");
//        System.out.println("4. Chia hai số");
//        System.out.println("0. Thoát chương trình");
//        var choice = sc.nextInt();
//        switch (choice) {
//            case 0:
//                System.out.println("Kết thúc chương trình");
//                break;
//            case 1:
//                var sum = a + b;
//                System.out.println(a + "+" + b + "=" + sum);
//                break;
//            case 2:
//                var dif = a - b;
//                System.out.println(a + "-" + b + "=" + dif);
//                break;
//            case 3:
//                var nhan = a * b;
//                System.out.println(a + "*" + b + "=" + nhan);
//                break;
//            case 4:
//                if (b != 0) {
//                    var chia = (double) a / b;
//                    System.out.println(a + "/" + b + "=" + chia);
//                } else {
//                    System.out.println("Mẫu = 0. Không chia được");
//                }
//                break;
//
//            default:
//                System.out.println("Chức năng không tồn tại, nhập lựa chọn từ 0 -> 4");
//                break;
//        }

        // Bài 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập tháng: ");
//        var month = sc.nextInt();
//        switch (month) {
//            case 0:
//                System.out.println("Thoát chương trình");
//                break;
//            case 1:
//                System.out.println("Mùa xuân");
//                break;
//            case 2:
//                System.out.println("Mùa xuân");
//                break;
//            case 3:
//                System.out.println("Mùa xuân");
//                break;
//            case 4:
//                System.out.println("Mùa hạ");
//                break;
//            case 5:
//                System.out.println("Mùa hạ");
//                break;
//            case 6:
//                System.out.println("Mùa hạ");
//                break;
//            case 7:
//                System.out.println("Mùa thu");
//                break;
//            case 8:
//                System.out.println("Mùa thu");
//                break;
//            case 9:
//                System.out.println("Mùa thu");
//                break;
//            case 10:
//                System.out.println("Mùa đông");
//                break;
//            case 11:
//                System.out.println("Mùa đông");
//                break;
//            case 12:
//                System.out.println("Mùa đông");
//                break;
//            default:
//                System.out.println("Lựa chọn bạn vừa nhập không hợp lệ. Vui lòng chọn từ 0 -> 12.");
//                break;

        //Bài 3: Tìm cung hoàng đạo
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn nhập ngày sinh và tháng sinh: ");
//        var day = sc.nextInt();
//        var month = sc.nextInt();
//        var congiap = "";
//        switch (month) {
//            case 1:
//                if (day < 20) { // Ngày 1 -> 19/1
//                    congiap = "Ma Kết";
//                } else if (day <= 31) //Ngày 20 ->31/1
//                {
//                    congiap = "Bảo Bình";
//                } else {
//                    System.out.println("Ngày không hợp lệ.");
//                }
//                break;
//            case 2:
//                if (day < 19) { // Ngày 1 - 18/2
//                    congiap = "Bảo Bình";
//                } else if (day <= 29) { // Ngày 19 - 29/2
//                    congiap = "Song Ngư";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 3:
//                if (day < 21) { // Ngày 1 - 20/3
//                    congiap = "Song Ngư";
//                } else if (day <= 31) { // Ngày 21 - 31/3
//                    congiap = "Bạch Dương";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 4:
//                if (day < 21) { // 1 - 20/4
//                    congiap = "Bạch Dương";
//                } else if (day <= 30) { // 21 - 30/4
//                    congiap = "Kim Ngưu";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 5:
//                if (day < 21) { // 1 - 20/5
//                    congiap = "Kim Ngưu";
//                } else if (day <= 31) { // 21 - 31/5
//                    congiap = "Song Tử";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 6:
//                if (day < 22) { // 1 - 21/6
//                    congiap = "Song Tử";
//                } else if (day <= 30) { // 22 - 30/6
//                    congiap = "Cự Giải";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 7:
//                if (day < 23) { // 1 - 22/7
//                    congiap = "Cự Giải";
//                } else if (day <= 31) { // 23 - 31/7
//                    congiap = "Sư Tử";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 8:
//                if (day < 23) { // 1 - 22/8
//                    congiap = "Sư Tử";
//                } else if (day <= 31) { // 23 - 31/8
//                    congiap = "Xử Nữ";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 9:
//                if (day < 23) { // 1 - 22/9
//                    congiap = "Xử Nữ";
//                } else if (day <= 30) { // 23 - 30/9
//                    congiap = "Thiên Bình";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 10:
//                if (day < 24) { // 1 - 23/10
//                    congiap = "Thiên Bình";
//                } else if (day <= 31) { // 24 - 31/10
//                    congiap = "Bọ Cạp";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 11:
//                if (day < 23) { // 1 - 22/11
//                    congiap = "Bọ Cạp";
//                } else if (day <= 30) { // 23 - 30/11
//                    congiap = "Nhân Mã";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            case 12:
//                if (day < 22) { // 1 - 21/12
//                    congiap = "Nhân Mã";
//                } else if (day <= 31) { // 22 - 31/12
//                    congiap = "Ma Kết";
//                } else {
//                    System.out.println("Ngày không hợp lệ");
//                }
//                break;
//            default:
//                System.out.println("Tháng không hợp lệ. Vui lòng kiểm tra lại.");
//                break;
//        }
//        if (!congiap.isEmpty()) {
//            System.out.println("Cung hoàng đạo nhà bạn là: " + congiap);
//        }

        //Bài 4: Nhập thứ trong tuần chuyển đổi sang tiếng anh: Monday, Tuesday...
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thứ trong tuần: ");
        var day = sc.nextLine();
        var result = "";
        // Kiếm tra và đánh giá
        day = day.toLowerCase();
        day = day.trim(); // Loại bỏ dấu cách ở đầu và cuối
        switch (day){
            case "thứ hai":
                result = "Monday";
                break;
            case "thứ ba":
                result = "Tuesday";
                break;
            case "thứ tư":
                result = "Wednesday";
                break;
            case "thứ năm":
                result = "Thursday";
                break;
            case "thứ sáu":
                result = "Friday";
                break;
            case "thứ bảy":
                result = "Saturday";
                break;
            case "chủ nhật":
                result = "Sunday";
                break;
            default:
                System.out.println("Không có ngày này");
        }
        System.out.println("Kết quả chuyển đổi: ");
        System.out.println(day + " -> " + result);
    }
}

