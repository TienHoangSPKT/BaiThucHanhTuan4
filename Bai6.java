package BTLTHDT;
import java.util.Scanner;

public class Bai6 {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat : ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai : ");
        int b = sc.nextInt();

        System.out.println("Uoc chung lon nhat : " + ucln(a, b));
        System.out.println("Boi chung nho nhat : " + bcnn(a, b));
        sc.close();
    }
}
