import java.util.Scanner;

public class Bai9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so phan tu can nhap vao mang: ");
        int spt = sc.nextInt();
        int a[]= new int[spt];

        for(int i=0;i<spt;i++)
        {
            System.out.printf("nhap phan tu thu %d: ",i);
            a[i] = sc.nextInt();
        }

        System.out.print("cac phan tu da nhap vao mang la: ");
        for(int i=0;i<spt;i++)
        {
            System.out.printf("%d ",a[i]);
        }
    }
}