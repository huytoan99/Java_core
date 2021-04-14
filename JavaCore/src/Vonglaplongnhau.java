import java.util.Scanner;

public class Vonglaplongnhau {
    public static void main(String[] args) {
        //ví dụ 1:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào kích thước m và n: ");
//        var m = sc.nextInt();
//        var n = sc.nextInt();
//        if (m > 0 && n > 0) {
//            for(int i = 1; i <= m; i++) {
//                for(int j = 1; j <= n; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println(" * ");
//            }
//
//        } else {
//            System.out.println("Bạn phải nhập m và n lớn hơn 0");
//        }

        // Vẽ hình chữ nhật
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào kích thước m và n: ");
//        var m = sc.nextInt();
//        var n = sc.nextInt();
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (i == 1 || i == m || j == 1 || j == n) {
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Bạn phải nhập m và n lớn hơn 0");
//        }

        //Vẽ tam giác

        //Ví dụ 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào chiều cao tam giác: ");
//        var h = sc.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h ; i++) {
//                for( int j = 1; j <= i; j++ ) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Bạn phải nhập chiều cao khác 0.");
//        }

        // Bài tập 3: Vẽ tam giác góc vuông trên bên phải
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào chiều cao tam giác: ");
//        var h = sc.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if( j < i)
//                    {
//                        System.out.print("   ");
//                    } else {
//                        System.out.print(" * ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Bạn phải nhập chiều cao khác 0.");
//        }

        // Bài 2: Tam giác vuông góc trên trái
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào chiều cao tam giác: ");
//        var h = sc.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h - i + 1; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Bạn phải nhập chiều cao khác 0.");
//        }

        // Bài 5: Vẽ tam giác cân
//        var sc = new Scanner(System.in);
//        System.out.println("Nhập chiều cao tam giác: ");
//        var h = sc.nextInt();
//        // vẽ tam giác cân đặc bằng các dấu *
//        // nguyên lý: vẽ dấu * đối xứng qua cột h i, j bắt đầu từ 1
//        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 đến h+i-1
//        // các vị trí còn lại vẽ khoảng trắng
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j < 2 * h; j++) {
//                if (j < h - i + 1 || j > h + i - 1) {
//                    System.out.print("   ");
//                } else {
//                    System.out.print(" * ");
//                }
//            }
//            System.out.println();
//        }

        // Bài 7: Vẽ tam giác đối xứng
        var sc = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = sc.nextInt();
        // vẽ tam giác cân đặc bằng các chữ số theo nguyên lý:
        // lấy đối xứng qua cột h, j, i bắt đầu từ 1
        // trên hàng thứ i vẽ số tại các vị trí từ h-i+1 đến h+i-1
        // giá trị in ra trên cột j là i-|h-j|. Các vị trí còn lại
        // vẽ khoảng trắng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                // nếu i là hàng cuối hoặc các hàng khác tại cột j thỏa mãn
                if (j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print(" " + (i - Math.abs(h - j)) + " "); // vẽ số
                } else {
                    System.out.print("   "); // vẽ khoảng trắng
                }
            }
            System.out.println();
        }
    }
}
