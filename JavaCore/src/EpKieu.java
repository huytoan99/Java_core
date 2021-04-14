import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class EpKieu {
    public static void main(String[] args) {
//        float x = (float)3.141592;
//        int y = (int) x;
//        System.out.println(y);

        int a = 10;
        int b = 3;
        double x = (double)a / b;
        DecimalFormat D = new DecimalFormat("##.####");
        System.out.println(D.format(x));
        System.out.println(Math.floor(x)); // Làm tròn về nhỏ hơn
        System.out.println(Math.ceil(x)); // Làm tròn về lớn hơn
        System.out.println(Math.round(x)); // Tự động làm tròn
//      System.out.printf("%1.2f", x);
    }
}
