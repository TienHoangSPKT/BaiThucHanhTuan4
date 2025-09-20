import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int soA = sc.nextInt();

        System.out.print("Nhap so b: ");
        int soB = sc.nextInt();

        System.out.print("Nhap so c: ");
        int soC = sc.nextInt();

        if(soA<soB&&soA<soC)
            System.out.printf("So %d la so nho nhat",soA);
        else
            if(soB<soA&&soB<soC)
                System.out.printf("So %d la so nho nhat",soB);
            else
                if(soC<soA&&soC<soB)
                    System.out.printf("So %d la so nho nhat",soC);

        sc.close();
    } 
}