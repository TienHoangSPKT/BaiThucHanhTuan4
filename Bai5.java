package THlthdt;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so bat ki");
    int n = sc.nextInt();
    
    boolean nguyento = true;
     if (n<2){
        nguyento = false;
     } else {
        for (int i=2; i<= Math.sqrt(n); i++){
            if (n % i == 0 ){
                nguyento = false;
                break;
            }
        }
     }
     if (nguyento){
        System.out.println(n + " la so nguyen to");
     } else {
        System.out.println(n + " khong phai la so nguyen to");
     }
     sc.close();
    } 
}
