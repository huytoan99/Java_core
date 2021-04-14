import java.util.Scanner;

public class SwitchNew {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        var question = "Logo quả táo cắn dở là của hãng công nghệ nào ?";
//        var ans = "A. Apple \n B.Samsung \n C.Huawei\n D.Sony \n";
//        System.out.println(question);
//        System.out.println(ans);
//        System.out.println("Câu trả lời của bạn là: ");
//        char n = sc.nextLine().charAt(0);
//
//        String result = switch (n) {
//            case 'a', 'A' -> "Chính xác !";
//            case 'b','B', 'c', 'C', 'd', 'D' -> "Sai mất rồi.";
//            default -> "Vui lòng chọn đáp án a b c d.";
//
//        };
//        System.out.println(result);


        //Bài 1: Viết chương trình phân loại các mùa trong năm bằng switch expression
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập tháng: ");
//        var number = sc.nextInt();
//        var season = switch (number) {
//            case 0 -> "Kết thúc chương trình";
//            case 1, 2, 3 -> "";
//            case 4, 5, 6 -> "Mùa hạ";
//            case 7, 8, 9 -> "Mùa thu";
//            case 10, 11, 12 -> "Mùa đông";
//            default -> "Không có lựa chọn này";
//        };
//        System.out.println("Tháng " + number + " là " + season);




        // Bài 2: Viết chương trình phân loại các con giáp từ 1 -> 12.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số: ");
//        var zodiac = sc.nextInt();
//        var season = switch (zodiac) {
//            case 0 -> "Kết thúc chương trình";
//            case 1 -> "Tí";
//            case 2 -> "Sửu";
//            case 3 -> "Dần";
//            case 4 -> "Mão";
//            case 5 -> "Thìn";
//            case 6 -> "Tị";
//            case 7 -> "Ngọ";
//            case 8 -> "Mùi";
//            case 9 -> "Thân";
//            case 10 -> "Dậu";
//            case 11 -> "Tuất";
//            case 12 -> "Hợi";
//            default -> "Không có lựa chọn này";
//        };
//        System.out.println("Số:" + zodiac + " tương ứng với: " + season);





        //Bài 3: Cung hoàng đạo
//        var input = new Scanner(System.in);
//        System.out.println("Nhập ngày sinh tháng sinh cách nhau bởi 1 dấu cách: ");
//        var day = input.nextInt();
//        var month = input.nextInt();
//        var zodiac = ""; // biến lưu tên con giáp
//        // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
//        zodiac = switch (month) {
//            case 1 -> (day < 20) ? "Ma Kết" : (day <= 31) ? "Bảo Bình" : "Ngày không hợp lệ";
//            case 2 -> (day < 19) ? "Bảo Bình" : (day <= 29) ? "Song Ngư" : "Ngày không hợp lệ";
//            case 3 -> (day < 21) ? "Song Ngư" : (day <= 31) ? "Bạch Dương" : "Ngày không hợp lệ";
//            case 4 -> (day < 21) ? "Bạch Dương" : (day <= 30) ? "Kim Ngưu" : "Ngày không hợp lệ";
//            case 5 -> (day < 21) ? "Kim Ngưu" : (day <= 31) ? "Song Tử" : "Ngày không hợp lệ";
//            case 6 -> (day < 22) ? "Song Tử" : (day <= 30) ? "Cự Giải" : "Ngày không hợp lệ";
//            case 7 -> (day < 23) ? "Cự Giải" : (day <= 31) ? "Sư Tử" : "Ngày không hợp lệ";
//            case 8 -> (day < 23) ? "Sư Tử" : (day <= 31) ? "Xử Nữ" : "Ngày không hợp lệ";
//            case 9 -> (day < 23) ? "Xử Nữ" : (day <= 30) ? "Thiên Bình" : "Ngày không hợp lệ";
//            case 10 -> (day < 24) ? "Thiên Bình" : (day <= 31) ? "Bọ Cạp" : "Ngày không hợp lệ";
//            case 11 -> (day < 23) ? "Bọ Cạp" : (day <= 30) ? "Nhân Mã" : "Ngày không hợp lệ";
//            case 12 -> (day < 22) ? "Nhân Mã" : (day <= 31) ? "Ma Kết" : "Ngày không hợp lệ";
//            default -> "Tháng không hợp lệ. Vui lòng kiểm tra lại.";
//        };
//        System.out.println("Cung hoàng đạo của bạn là: " + zodiac);



        //Bài 4: Đổi thứ trong tuần viết chữ tiếng việt sang tiếng anh.
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào thứ ở trong tuần: ");
        var n = sc.nextLine();
        n = n.trim();
        n = n.toLowerCase();
        String result = switch (n) {
            case "thứ hai" -> result = "Monday";
            case "thứ ba" -> result = "Tuesday";
            case "thứ tư" -> result = "Wednesday";
            case "thứ năm" -> result = "Thursday";
            case "thứ sáu" -> result = "Friday";
            case "thứ bảy" -> result = "Saturday";
            case "chủ nhật" -> result = "Sunday";
            default -> "Không có thứ này, nhập lại";
        };
        System.out.println("Viết sang tiếng anh là: " + result);
    }
}
