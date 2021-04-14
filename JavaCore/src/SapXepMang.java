import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class SapXepMang {
    public static void main(String[] args) {
        // Ví dụ 1:
//        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 9, 9, 100, 7};
//        System.out.println("Mảng gốc ban đầu là: ");
//        showArray(numbers);
//        //Sắp xếp mảng
//        bubleSort(numbers);
////        Arrays.sort(numbers, 5, 9);
//        System.out.println("Mảng sau khi sắp xếp: ");
//        showArray(numbers);
//    }
//    // Phương thức sắp xếp nổi bọt theo tứ tự tăng dần
//    private static void bubleSort(int[] numbers) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] < numbers[j - 1]) {
//                    int x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//    }
//
//    private static void showArray(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }


        //Bài tập 1: Viết chương chình nhập vào một mảng các số nguyên sau đó sắp xếp mảng này theo thứ tự tăng dần.
        // Hiển thị mảng trước sau khi sắp xếp.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số lượng phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(n, sc);
//        System.out.println("Mảng trước khi sắp xếp là: ");
//        showResult(numbers);
//        Arrays.sort(numbers);
//        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
//        showResult(numbers);
//    }
//
//    private static void showResult(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int[] getNumbers(int n, Scanner sc) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        // Bài 2: Viết chương trình nhập vào một mảng chứa điểm trung bình học kỳ của n sinh viên trong một lớp và sắp
        // xếp mảng này theo thứ tự giảm dần. Hiển thị mảng trước khi sắp xếp.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập vào số lượng sinh viên: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(n, sc);
//        System.out.println("Điểm TB của SV trước khi sắp xếp: ");
//        showResult(numbers);
//        System.out.println("Điểm TB của SV sau khi sắp xếp giảm dần là: ");
//        showResult(sapXepDiem(numbers));
//    }
//
//    // Sắp xếp điểm Sv giảm dần
//    private static int[] sapXepDiem(int[] numbers) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] > numbers[j - 1]) {
//                    int x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//        return numbers;
//    }
//
//    private static void showResult(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int[] getNumbers(int n, Scanner sc) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập điểm của SV thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        //Bài 3: Viết chương trình sắp xếp mảng nguyên n phần tử theo thứ tự tăng dần. Tìm giá trị lớn thứ hai và liệt
        // kê ra tất cả các vị trí của giá trị này trong mảng.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số lượng phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(n, sc);
//        Arrays.sort(numbers);
//        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
//        showNumber(numbers);
//        int max2 = findMax2(numbers);
//        if (max2 != numbers[numbers.length - 1]) {
//            showMax2(numbers, max2);
//        } else {
//            System.out.println("Không có giá trị lớn thứ hai trong mảng");
//        }
//    }
//
//    // phương thức tìm và trả về giá trị max2 trong mảng đã sắp xếp
//    private static int findMax2(int[] numbers) {
//        int max = numbers[numbers.length - 1];
//        //tìm max 2
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            if (numbers[i] != max) {
//                return numbers[i];
//            }
//        }
//        return max;
//    }
//
//    private static void showNumber(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static void showMax2(int[] numbers, int max2) {
//        System.out.println("Giá trị max2 = " + max2);
//        System.out.print("Chỉ số: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == max2) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//    private static int[] getNumbers(int n, Scanner sc) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


        //bài 4: Tìm số bé thứ 2 mảng giảm dần
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số lượng phần tử trong mảng: ");
//        var n = sc.nextInt();
//        var numbers = getNumbers(n, sc);
//        System.out.println("-----------------------------------");
//        System.out.println("Mảng sau khi sắp xếp giảm dần là: ");
//        showNumber(sapXepGiamDan(numbers));
////        showNumber(numbers);
//        int min2 = findMin2(numbers);
//        if (min2 != numbers[numbers.length - 1]) {
//            showMin2(numbers, min2);
//        } else {
//            System.out.println("Không có giá trị nhỏ thứ hai trong mảng");
//        }
//    }
//
//    // phương thức tìm và trả về giá trị min 2 trong mảng đã sắp xếp
//    private static int findMin2(int[] numbers) {
//        int min = numbers[numbers.length - 1];
//        //tìm min 2
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            if (numbers[i] != min) {
//                return numbers[i];
//            }
//        }
//        return min;
//    }
//
//    private static void showNumber(int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//    }
//
//    private static int[] sapXepGiamDan(int[] numbers) {
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = numbers.length - 1; j > i; j--) {
//                if (numbers[j] > numbers[j - 1]) {
//                    int x = numbers[j];
//                    numbers[j] = numbers[j - 1];
//                    numbers[j - 1] = x;
//                }
//            }
//        }
//        return numbers;
//    }
//
//    private static void showMin2(int[] numbers, int min2) {
//        System.out.println("Giá trị min 2 = " + min2);
//        System.out.print("Chỉ số: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == min2) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    private static int[] getNumbers(int n, Scanner sc) {
//        var number = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Mời nhập phần tử thứ " + (i + 1) + ": ");
//            number[i] = sc.nextInt();
//        }
//        return number;
//    }


    }
}
