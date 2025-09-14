package THlthdt;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten:");
    String ten = sc.nextLine();
    System.out.print("Tuoi:");
    String tuoi = sc.nextLine();
    System.out.print("Chieu cao:");
    String chcao = sc.nextLine();
    System.out.print("Ban co thich lap trinh khong:");
    String thich = sc.nextLine();

    System.out.println("Ho ten: " + ten);
    System.out.println("Tuoi: " + tuoi);
    System.out.println("Chieu cao: " + chcao);
    System.out.println("Co thich lap trinh khong? " + thich);

    sc.close();
    }
}
