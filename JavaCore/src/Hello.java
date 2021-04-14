import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        final int MAX = 500;
        final double PI;
        PI = 3.141592;
        final String MONDAY = "MONDAY"; // Khai báo hằng số
        int age = 0;
        String fullName;
        long ballance;

        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng thừa

        System.out.print("Mời bạn nhập tên: ");
        fullName = sc.nextLine();

        System.out.println("Mời bạn nhập số dư: ");
        ballance = sc.nextLong();

        System.out.println("Hello " + fullName);
        System.out.println("Bạn " +age +"tuổi");
        System.out.println("Số dư của bạn là: "+ballance+ "VNĐ");

    }
}
