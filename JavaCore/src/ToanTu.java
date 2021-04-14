import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
//        String firtName = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời nhập tên: ");
//        firtName = sc.nextLine();
//
//        System.out.println("Sau khi viết hoa: " +firtName.toUpperCase()); //Viết chữ hoa
//
//        System.out.println("Sau khi viết thường: " +firtName.toLowerCase()); // Viết chữ thường
//
//        System.out.println("Độ dài của chuỗi là: " +firtName.length());// Đếm độ dài chuỗi

        String message  = "I'm learning Java programming language.";
        String newMessage = message.replaceAll("a", "A"); //Hoán đổi chữ thường thành chữ in hoa và ngược lại
        System.out.println(newMessage);
    }
}
