import java.util.Scanner;

public class ChuoiString {
    public static void main(String[] args) {
//        String str1 = "";
//        String str2 = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập chuỗi 1: ");
//        str1 = sc.nextLine();
//        System.out.print("Mời bạn nhập chuỗi 2: ");
//        str2 = sc.nextLine();
//        int index = str1.indexOf(str2);
//        System.out.println("Vị trí của str2 trong str1 là: " + index);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập họ và tên có rất nhiều dấu cách thừa: ");
//        String fullName = scanner.nextLine();
//        // hiện nội dung chuỗi ra bao bởi " để dễ nhận biết
//        System.out.println("Chuỗi gốc: \"" + fullName + "\"");
//        // xóa dấu cách thừa ở đầu và cuối chuỗi bằng trim()
//        fullName = fullName.trim();
//        // thay thế các chỗ có 1 hoặc nhiều dấu cách bằng 1 dấu cách
//        fullName = fullName.replaceAll("\\s+", " ");
//        System.out.println("Kết quả: \"" + fullName + "\"");


        Scanner sc = new Scanner(System.in);
        String fullname = "";
        System.out.print("Nhập họ tên phân tách bởi 1 dấu cách: ");
        fullname = sc.nextLine();

        // Tìm vị trí dấu cách đầu tiên
        int firstIndex = fullname.indexOf(" ");

        // Tìm vị trí dấu cách cuối cùng
        int lastIndex = fullname.lastIndexOf(" ");

        //Hiển thị ra nội dung vừa nhập vào
        System.out.println(" Chuỗi vừa nhập là: " + fullname);

        //Tách họ ra trước
        String last = fullname.substring(0, firstIndex);

        // Tách tên đệm
        String middle = fullname.substring(firstIndex + 1, lastIndex);

        // Tách tên
        String name = fullname.substring(lastIndex + 1);
        System.out.println("Họ: " + last + "\n Tên đệm: " + middle + "\n Tên: " + name);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào 1 chuỗi: ");
//        String massage = sc.nextLine();
//        System.out.println("Vị trí đầu tiên là: " + massage.charAt(0));
//        int LastIndex = massage.length() - 1;
//        System.out.println("Vị trí cuối cùng là: " + LastIndex + ". Giá trị là: " + massage.charAt(LastIndex));
    }
}
