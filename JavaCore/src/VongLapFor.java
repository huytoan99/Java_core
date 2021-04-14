import java.util.Scanner;

public class VongLapFor {
    public static void main(String[] args) {
        //Ví dụ đếm ký tự chữ cái trong chuỗi.
//        String str = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi: ");
//        str = sc.nextLine();
//        // Viết thường toàn bộ chuỗi String
//        str = str.toLowerCase();
//        var count = 0; // Đếm số ký tự là chữ cái
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("Chuỗi \"" + str + "\"");
//        System.out.println("Số chữ cái là: " + count);


        // Bài 1: Tính tổng S = 1 + 1/2 + 1/3 +...+1/n. N nhập từ bàn phím
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên n: ");
//        var n = sc.nextInt();
//        if (n > 0) {
//            var sum = 0.0;
//            for (int i = 1; i <= n; i++) {
//               sum = sum + 1.0/ i;
//            }
//            System.out.println("S = " + sum);
//        } else {
//            System.out.println("Bạn phải nhập n lớn hơn 0.");
//        }


        // Bài 2: Nhập vào số nguyên dương n rồi tính tổng S = 1 + 2 + 3 + ... + n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên n: ");
//        var n = sc.nextInt();
//        if (n > 0) {
//            var sum = 0;
//            for (int i = 1; i <= n; i++) {
//                sum = sum + i;
//            }
//            System.out.println("S = " + sum);
//        } else {
//            System.out.println("Bạn phải nhập số lớn hơn 0.");
//        }

        // Bài 3: Nhập vào chuỗi ký tự, in ra chữ cái đầu của mỗi từ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi ký tự: ");
//        var str = sc.nextLine();
//        str = str.trim();
//        str = str.replace("\\s+", " ");
//        System.out.println("Chuỗi sau khi chuẩn hóa: " + str);
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0) { // in ra chữ cái đầu từ đầu tiên
//                System.out.println(str.charAt(i));
//            }
//            if (str.charAt(i) == ' ') { // in ra chữ cái đầu tiếp theo
//                System.out.println(str.charAt(i + 1));
//            }
//        }



        // Bài 4: Đếm xem có bao nhiêu ký tự
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi ký tự: ");
//        str = str.trim();
//        str = str.replace("\\s+", " "); //thay thế đoạn có nhiều dấu cách bằng 1 khoảng trắng
//        var str = sc.nextLine();
//        var result = 0;
//        for (int i = 0; i < str.length(); i++) {
//            result = i - 1;
//        }
//        System.out.println("Tổng số ký tự trong chuỗi là: " + result);




        // Đếm xem có bao nhiêu từ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi ký tự: ");
//        var str = sc.nextLine();
//        str = str.trim();
//        str = str.replace("\\s+", " "); //thay thế đoạn có nhiều dấu cách bằng 1 khoảng trắng
//        var result = 0;
//        if (!str.isEmpty()) // Nếu chuỗi vừa nhập không rỗng
//        {
//            result = 1; // thì có ít nhất 1 từ.
//        } else {
//            System.out.println("bạn chưa nhập gì vào");
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                result++;
//            }
//        }
//        System.out.println("Tổng số từ là: " + result);


        //Bài 5: Nhập vào chuỗi ký tự và in ra màn hình theo thứ tự ngược lại
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào chuỗi: ");
//        var str = sc.nextLine();
//        str = str.trim();
//        str = str.replace("\\s+", " ");
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.println(str.charAt(i));
//        }



        // Bài 6: Kiểm tra số nguyên tố
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào n: ");
//        var n = sc.nextInt();
//        boolean isPrime = true; // giả sử rằng n là số n.tố
//        if (n < 2) {
//            isPrime = false; // n không phải là số nguyên tố.
//        } else {
//            int bound = (int) Math.sqrt(n);
//            for (int i = 2; i <= bound; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println(n + " là số nguyên tố.");
//        } else {
//            System.out.println(n + " không là số nguyên tố.");
//        }


        //Bài 7: Nhập vào 2 số nguyên a,b. Viết chương trình liệt kê các số nguyên tố trong đoạn a,b
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số nguyên a < b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        System.out.println("Các số nguyên tố trong đoạn [a, b]: ");
//        for (int i = a; i <= b; i++) {
//            boolean isPrime = true;
//            if (i < 2) {
//                isPrime = false;
//            } else {
//                for (int j = 2; j <= Math.sqrt(i); j++) {
//                    if (i % j == 0) {
//                        isPrime = false;
//                    }
//                }
//            }
//            System.out.print(isPrime ? i + ", " : ""); // in ra print để không xuống dòng
//        }


        // Bài 8: Nhập vào số nguyên dương. Kiểm tra n có phải số đẹp hay không ? Số đẹp là số đọc từ trái sang phải
        // hay từ phải sang trái đều cho 1 giá trị.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào số nguyên dương n: ");
//        var n = sc.nextInt();
//        //Tạo ra 1 biến để lưu giá trị khi đảo
//        var revert = 0;
//        //Tiến hành lấy giá trị đảo của n
//        for (int i = n; i > 0; i /= 10) { // đảo = đảo * 10 + phần đơn vị của i
//            revert = revert * 10 + i % 10; // sau đó i phải loại bỏ phần đơn vị bằng cách chia nguyên cho 10
//        }
//        // khi có giá trị đảo, kiểm tra xem chúng có khớp nhau không
//        System.out.println(n == revert ? "n là số đẹp" : "n không phải số đẹp");


        // Bài 9: Nhập vào hai số 0 <= a < b <= 90. In ra các số Fibo từ Fa đến Fb.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời nhập vào hai số a, b: ");
//        var a = sc.nextInt();
//        var b = sc.nextInt();
//        // tiến hành tìm số fibo thứ i:
//        for (int i = a; i <= b; i++) {
//            // nhớ fresh f0, f1, fn nếu không sẽ sai kq
//            long f0 = 0;
//            long f1 = 1;
//            long fn = (i < 2) ? i : 0;
//            for (int j = 2; j <= i; j++) {
//                fn = f0 + f1;
//                f0 = f1;
//                f1 = fn;
//            }
//            System.out.println("F" + i + " = " + fn);
//        }
    }
}
