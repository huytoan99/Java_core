import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        //Ví dụ 1: Vẽ hình chữ nhật đặc bằng dấu * sau đó lưu vào mảng 2 chiều. Hiện kết quả lên màn hình
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào số hàng và số cột của hình chữ nhật: ");
//        var height = sc.nextInt();
//        var width = sc.nextInt();
//        if (height > 0 && width > 0) {
//            String[][] hinhChuNhat = new String[height][width];
//            fillStar(hinhChuNhat);
//            Result(hinhChuNhat);
//        } else {
//            System.out.println("Số hàng và cột phải nguyên dương.");
//        }
//    }
//    // Phương thức vẽ hình chữ nhật
//    private static void Result(String[][] hinhChuNhat) {
//        for (int i = 0; i < hinhChuNhat.length; i++) {
//            for (int j = 0; j < hinhChuNhat[i].length; j++) {
//                System.out.print(hinhChuNhat[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    //Phương thức điền dấu * vào hình chữ nhật.
//    private static void fillStar(String[][] hinhChuNhat) {
//        for (int i = 0; i < hinhChuNhat.length; i++) {
//            for (int j = 0; j < hinhChuNhat[i].length; j++) {
//                hinhChuNhat[i][j] = " ♥ ";
//            }
//        }
//    }


        //Ví dụ 2: Tạo mảng zigzag lưu trữ tam giác số vuông góc trái dưới dạng:
        //0
        //1 2
        //2 3 4
        //3 4 5 6
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chiều cao của tam giác: ");
//        int h = sc.nextInt();
//        //Cấp phát số hàng của mảng zigzag
//        var tamGiac = new int[h][];
//        for (int i = 0; i < h; i++) {
//            tamGiac[i] = new int[i + 1];
//        }
//        fillTG(tamGiac);
//        Result(tamGiac);
//    }
//
//    private static void Result(int[][] tamGiac) {
//        for (int i = 0; i < tamGiac.length; i++) {
//            for (int j = 0; j < tamGiac[i].length; j++) {
//                System.out.printf("%3d", + tamGiac[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    // Phương thức vẽ tam giác vuông góc trái dưới bằng số
//    private static void fillTG(int[][] tamGiac) {
//        for (int i = 0; i < tamGiac.length; i++) {
//            for (int j = 0; j < tamGiac[i].length; j++) {
//                tamGiac[i][j] = i + j;
//            }
//        }
//    }


        //Bài 3: Vẽ hình tam giác vuông góc trái trên chiều cao h nhập từ bàn phím. Lưu vào mảng và hiển thị Kq ra màn hình
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào chiều cao của tam giác: ");
        var h = sc.nextInt();
        // Mảng lưu kết quả
        var tamGiac = new String[h][h];
        // vẽ hình tam giác.
        Vetamgiac(tamGiac);
        //Hiển thị ra màn hình
        Hienthi(tamGiac);

    }

    private static void Hienthi(String[][] tamGiac) {
        System.out.println("Hình cần vẽ");
        for (int i = 0; i < tamGiac.length; i++) {
            for (int j = 0; j < tamGiac.length - i; j++) {
                System.out.print(tamGiac[i][j]);
            }
            System.out.println();
        }
    }

    private static void Vetamgiac(String[][] tamGiac) {
        var h = tamGiac.length;
        for (int i = 1; i <= h ; i++) {
            for (int j = 1; j <= h - 1 + 1; j++) {
                tamGiac[i-1][j-1] = " * ";
            }
        }
    }


}
