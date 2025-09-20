package THlthdt;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("nhap so bat ki");
    double so = sc.nextDouble();

    if (so>0){
        System.out.println("so ban nhap la so duong");
    } else if (so<0){
        System.out.println("so ban nhap la so am");
    }else{
        System.out.println("so ban nhap la so 0");
    }
    sc.close();
    }
}
