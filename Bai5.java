import java.util.Scanner;

public class Bai5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        int soA = sc.nextInt();

        if(soA<2)
            System.out.printf("%d khong phai la so nguyen to",soA);
        else
        {
            for(int i=2;i<=Math.sqrt(soA);i++)
            {
                if(soA%i==0)
                {
                    System.out.printf("%d khong phai la so nguyen to",soA);
                    return;
                }
            }
            System.out.printf("%d la so nguyen to",soA);        
        }
    }
}