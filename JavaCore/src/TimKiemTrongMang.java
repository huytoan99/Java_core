import java.util.Arrays;
import java.util.Scanner;

public class TimKiemTrongMang {
    public static void main(String[] args) {
        //Ví dụ:
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = {0, 5, 4, 6, 7, 10, 15, 52, 100};
//        System.out.println("Mảng gốc ban đầu");
//        showArray(numbers);
//        System.out.println("Nhập giá trị cần tìm: ");
//        var x = sc.nextInt();
//        // tìm kiếm bằng hàm có sẵn
//        var index = Arrays.binarySearch(numbers, x);
//        // tìm kiếm bằng viết phương thức
////        var index = linearSearch(numbers, x);
//        var result = index < 0 ? "Không tồn tại x" : "Tìm thấy x ở vị trí " + index;
//        System.out.println(result);
//    }
//
//    private static int linearSearch(int[] numbers, int x) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    private static void showArray(int[] numbers) {
//        System.out.println("Các phần tử trong mảng là: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }


        // Bài 1: Viết chương trình nhập vào 1 mảng nguyên và một giá trị x. Tìm xem x có xuất hiện trong mảng không ?

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(sc, n);
//        showArray(numbers);
//        System.out.println("Nhập giá trị cần tìm: ");
//        var x = sc.nextInt();
//        if (kiemtra(numbers, x)) {
//            System.out.println(x + " xuất hiện trong mảng");
//        } else {
//            System.out.println(x + " không xuất hiện trong mảng.");
//        }
//
//    }
//
//    private static boolean kiemtra(int[] number, int x) {
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] == x) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private static void showArray(int[] numbers) {
//        System.out.println("Các phần tử trong mảng là: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int[] getNumbers(Scanner sc, int x) {
//        var number = new int[x];
//        for (int i = 0; i < x; i++) {
//            System.out.print("Mời nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        // Bài 2: Viết chương trình nhập vào 1 mảng nguyên và một giá trị x. Đếm số lần x xuất hiện trong mảng
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var number = getNumber(sc, n);
//        showArray(number);
//        System.out.println("Nhập x: ");
//        var x = sc.nextInt();
//        // Tìm và kết luận
//        System.out.println("Giá trị " + x + " xuất hiện " + countX(number, x) + " lần.");
//    }
//
//    private static void showArray(int[] number) {
//        System.out.println("Mảng vừa nhập là: ");
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int countX(int[] numbers, int x) {
//        int count = 0; // ban đầu count = 0
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == x) {
//                count++; // tăng biến đếm lên 01 đơn vị
//            }
//        }
//        return count;
//    }
//
//    private static int[] getNumber(Scanner sc, int n) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập vào phần tử vị trí thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        // Bài 3: Viết chương trình nhập vào một mảng các số nguyên và một giá trị x. Nhập thêm hai giá trị a < b. Tìm xem
        // x có xuất hiện trong đoạn chỉ số [a,b] của mảng hay không ? Nếu có thì có bao nhiêu lần
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var number = getNumbers(sc, n);
//        showArray(number);
//        //Nhập x
//        System.out.println("Nhập x: ");
//        var x = sc.nextInt();
//        //Nhập a < b
//        System.out.println("Nhập hai số nguyên a < b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("Giá trị " + x + " xuất hiện " + countX(number, x, a, b) + " lần trong đoạn chỉ số [" + a + ", " + b +"]");
//    }
//
//    private static void showArray(int[] number) {
//        System.out.println("Mảng vừa nhập là: ");
//        for (int i = 0; i < number.length; i++) {
//            System.out.print(number[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int countX(int[] numbers, int x, int a, int b) {
//        int count = 0; // ban đầu count = 0
//        for (int i = a; i <= b; i++) {
//            // để tránh xảy ra ngoại lệ ta phải đảm bảo chỉ số i
//            // nằm trong đoạn [0, length-1]
//            if (i >= 0 && i < numbers.length - 1 && numbers[i] == x) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private static int[] getNumbers(Scanner sc, int n) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập vào phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }

        // Bài 4: Nhập vào danh sách tên sinh viên trong một lớp. Tìm xem với mỗi tên, có bao nhiêu sinh viên trùng tên nhau
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số lượng sinh viên trong lớp: ");
        var n = sc.nextInt();
        var sinhVien = getSinhVien(sc, n);
        coutName(sinhVien);
    }

    private static void coutName(String[] sinhVien) {
        System.out.printf("%-15s%-10s\n", "Tên", "Xuất hiện");
        for (int i = 0; i < sinhVien.length; i++) {
            var isExist = false;
            for (int j = 0; j < 1; j++) {
                    //Nếu tên sinh viên đã xuất hiện rồi
                if (sinhVien[j].toLowerCase().compareTo(sinhVien[i].toLowerCase()) == 0) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) { // nếu tên chưa xuất hiện thì mới xét
                var count = numOfExist(sinhVien, sinhVien[i]);
                System.out.printf("%-15s%-10d\n", sinhVien[i], count);
            }

        }
    }
    private static int numOfExist(String[] students, String key) {
        var count = 0; // mặc định gán biến count bằng 0
        for (var s : students) {
            // nếu tên sv s trùng với tên cần tìm
            if (key.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                count++; // tăng biến đếm lên
            }
        }
        return count;
    }


    private static String[] getSinhVien(Scanner sc, int n) {
        var sinhVien = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Mời nhập vào tên sinh viên thứ " + (i + 1) + ": ");
            sinhVien[i] = sc.next();
        }
        return sinhVien;
    }
}
