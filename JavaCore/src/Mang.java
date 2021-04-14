import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
//        int[] numbers;
//        String[] friends =  new String[] {"Hoàng", "Tiến", "Sỹ"};
//        System.out.println(friends.length);
//        String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
//        // Vòng lặp foreach
//        for (var item : brands) {
//            System.out.println(item);
//        }


        //Ví dụ: Nhập n người bạn, lưu vào mảng và tìm người bạn. Tìm tên dài nhất hiển thị ra màn hình
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng người bạn: ");
//        var n = sc.nextInt();
//        if (n < 0) {
//            System.out.println("Không thực hiện được");
//        } else {
//            var friends = getFriends(n, sc);
//
//            showResult(friends);
//        }
//
//    }
//    // Hiển thị người có tên dài nhất
//    private static void showResult(String[] friends) {
//        System.out.println("Tên người dài nhất là: ");
//        int maxlength = findMaxLength(friends);
//        for (var friend : friends) {
//            if (friend.length() == maxlength) {
//                System.out.println(friend + " ");
//            }
//        }
//    }
//    // Phương thức tìm độ dài tên dài nhất
//    private static int findMaxLength(String[] friends) {
//        int max = 0;
//        for (int i = 0; i < friends.length; i++) {
//            if (friends[i].length() > max) {
//                max = friends[i].length();
//            }
//        }
//        return max;
//    }
//    // Phương thức nhập vào n người bạn
//    private static String[] getFriends(int n, Scanner sc) {
//        var friends = new String[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập tên người bạn thứ " + (i + 1) + ": ");
//            friends[i] = sc.next();
//        }
//        return friends;
//    }


        //Ví dụ 2: Nhập mảng nguyên n > 0 nhập từ bàn phím. Liệt kê các số nguyên tố trong mảng này
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        if (n > 0) {
//            var numbers = getNumber(n, sc);
//            showResult(numbers);
//        } else {
//            System.out.println("Bạn phải nhập số phần tử trong mảng lớn hơn 0");
//        }
//    }
//
//    private static void showResult(int[] numbers) {
//        System.out.println("Các số nguyên tố ở trong mảng là: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (soNT(numbers[i])) {
//                System.out.println(numbers[i] + " ");
//            }
//        }
//    }
//
//    private static int[] getNumber(int n, Scanner sc) {
//        var numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Mời bạn nhập phần tử trong mảng thứ: " + (i + 1));
//            numbers[i] = sc.nextInt();
//        }
//        return numbers;
//    }
//
//    public static boolean soNT(int n) {
//        if (n < 2) {
//            return false;
//        } else {
//            for (int i = 2; i < Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


        // Bài 1: Nhập vào mảng số nguyên n phần tử và tính tổng tất cả các số nguyên tố trong mảng đó.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        if (n > 0) {
//            var number = getNumber(n, sc);
//            showResult(number);
//            var sum = SumNT(number);
//            System.out.println("Tổng các phần tử trong mảng là: " + sum);
//        } else {
//            System.out.println("Bạn phải nhập n lớn hơn 0");
//        }
//    }
//
//    private static long SumNT(int[] number) {
//        long s = 0; // có thể tổng sẽ lớn nên ta dùng kiểu long
//        for (int i = 0; i < number.length; i++) {
//            s += number[i]; // cộng giá trị phần tử thứ i vào tổng
//        }
//        return s;
//    }
//
//
//    private static void showResult(int[] number) {
//        System.out.println("Các số nguyên tố trong mảng là: ");
//        for (int i = 0; i < number.length; i++) {
//            if (soNT(number[i])) {
//                System.out.println(number[i]);
//            }
//        }
//    }
//
//    private static int[] getNumber(int n, Scanner sc) {
//        var numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập vào phần tử thứ " + (i + 1) + ": ");
//            numbers[i] = sc.nextInt();
//        }
//        return numbers;
//    }
//
//    public static boolean soNT(int n) {
//        if (n < 2) {
//            return false;
//        } else {
//            for (int i = 2; i < Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


        //Bài 2: Nhập số nguyên dương n, tìm n số nguyên tố đầu tiên rồi lưu vào mảng. Sau đó hiển thị ra màn hình
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số lượng số nguyên tố: ");
//        var n = sc.nextInt();
//        if (n > 0) {
//            var primeNumbers = firtNumber(n);
//            showResult(primeNumbers);
//        } else {
//            System.out.println("Bạn phải nhập số lớn hơn 0");
//        }
//    }
//    //Phương thức hiển thị kết quả
//    private static void showResult(int[] primes) {
//        System.out.println("Đây là " + primes.length + " số nguyên tố đầu tiên");
//        for (int i = 0; i < primes.length; i++) {
//            System.out.print(primes[i] + " ");
//        }
//    }
//    // phương thức tìm n số ng.tố đầu tiên
//    private static int[] firtNumber(int n) {
//        var primes = new int[n];
//        var count = 0; // Biến đếm của số NT
//        int i = 2;
//        while (count < n) {
//            if (soNT(i)) { // Nếu n là số NT
//                primes[count] = i; // Lưu lại n
//                count++; // Tăng biến đếm lên 1
//            }
//            i++;  // Tăng i lên
//        }
//        return primes;
//    }
//    // phương thức kiểm tra n có phải số nt
//    public static boolean soNT(int n) {
//        if (n < 2) {
//            return false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }


        //Bài 3: Nhập vào một mảng nguyên n phần tử và kiểm tra mảng đó có đối xứng hay không ?
        // Mảng đối xứng a là mảng thỏa mãn a[i] = a[length-1-i];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(n, sc);
//        var Result = isRevert(numbers) ? "Đối xứng" : "Không đối xứng";
//        System.out.println(Result);
//    }
//
//    private static boolean isRevert(int[] numbers) {
//        for (int i = 0; i < numbers.length / 2; i++) {
//            if (numbers[i] != numbers[numbers.length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static int[] getNumbers(int n, Scanner sc) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        //Bài 4: Nhập vào danh sách những người bạn. Tìm xem tên ai ngắn nhất
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số người bạn cách nhau bằng dấu cách: ");
//        var str = sc.nextLine();
//        var friends = str.split("\\s+");
//        showResult(friends);
//    }
//
//    private static void showResult(String[] friends) {
//        var minLength = findmin(friends);
//        System.out.println("Người có tên ngắn nhất là: ");
//        for (var friend : friends) {
//            if (friend.length() == minLength) {
//                System.out.println(friend);
//            }
//        }
//    }
//
//    private static int findmin(String[] friend) {
//        int min = friend[0].length();
//        for (int i = 0; i < friend.length; i++) {
//            if (friend[i].length() < min) {
//                min = friend[i].length();
//            }
//        }
//        return min;
//    }


        //Bài 5: Nhập vào một chuỗi ký tự "I love you". Tách các từ trong chuỗi ra in theo thứ tự ngược lại
        // you love i
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi ký tự: ");
//        var str = sc.nextLine();
//        // tách tại vị trí có 1 hoặc nhiều khoảng trắng
//        String[] words = str.split("\\s+");
//        for (int i = words.length -1; i >= 0; i--) {
//            System.out.println(words[i]);
//        }
//    }


        //Bài 6: Nhập vào danh sách đầu điểm trung bình của n sinh viên ở hệ 4. Viết chương trình phân loại sinh viên
        // theo các tiêu chí: Trượt, yếu, trung bình, khá, giỏi, xuất sắc.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số lượng sinh viên: ");
//        var n = sc.nextInt();
//        if (n < 0) {
//            System.out.println("Bạn phải nhập số lượng sv lớn hơn 0.");
//        } else {
//            var diemTB = getDiemTB(n, sc);
//            showResult(diemTB);
//        }
//    }
//
//    private static void showResult(double[] diemTB) {
//        System.out.println("---------------------------------");
//        System.out.println("Kết quả phân loại sinh viên là: ");
//        for (int i = 0; i < diemTB.length; i++) {
//            System.out.println("Điểm của sinh viên thứ " + i + ": " + diemTB[i] + " -> " + xeploai(diemTB[i]));
//        }
//    }
//
//    private static double[] getDiemTB(int n, Scanner sc) {
//        var diemTB = new double[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
//            diemTB[i] = sc.nextDouble();
//        }
//        System.out.println("---------------------------------");
//        System.out.println("Điểm của sinh viên vừa nhập vào là: ");
//        for (var diem : diemTB) {
//            System.out.println(diem);
//        }
//        return diemTB;
//    }
//
//    private static String xeploai(double xl) {
//        if (xl < 2.0) {
//            return "Trượt";
//        } else if (xl < 2.5) {
//            return "Yếu";
//        } else if (xl < 3.0) {
//            return "Trung Bình";
//        } else if (xl < 3.2) {
//            return "Khá";
//        } else if (xl < 3.6) {
//            return "Giỏi";
//        } else {
//            return "Xuất sắc";
//        }
//    }


        // Bài 7: Nhập vào các phần tử của một mảng số thực hiện tính điểm trung bình của 1 lớp sinh viên ở điểm hệ 10.
        // Tính điểm trung bình của cả lớp. lưu ý chương trình không nhận các giá trị < 0 và > 10.
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số lượng sinh viên của 1 lớp: ");
        var n = sc.nextInt();
        if (n < 0) {
            System.out.println("Bạn phải nhập số lớn hơn 0");
        } else {
            var diemcalop = getDiem(n, sc);
            var diemTb = avr(diemcalop);
            System.out.println("-----------------------------");
            System.out.printf("Điểm trung bình cả lớp là: %2.2f", diemTb);
        }
    }

    private static double avr(double[] diemcalop) {
        double sum = 0;
        for (var diem : diemcalop) {
            sum += diem;
        }
        return sum / diemcalop.length;
    }

    private static double[] getDiem(int n, Scanner sc) {
        var diemcalop = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------------------");
            System.out.print("Mời nhập điểm SV thứ " + (i + 1) + ": ");
            diemcalop[i] = sc.nextDouble();
            if (diemcalop[i] < 0 || diemcalop[i] > 10) {
                System.out.println("Nhập điểm từ 0 -> 10 ☺");
                i--;
            }
        }
        return diemcalop;
    }
}



