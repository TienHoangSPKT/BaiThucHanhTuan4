import java.util.Scanner;

public class Bai7
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Nhap so phan tu cua mang: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu " +i +"=");
            arr[i]= sc.nextInt();
        }
        int S=0; 
        for(int i=0;i<n;i++)
        {
            S=S+arr[i];
        }
        System.out.println("Tong cua cac phan tu = "+S);
        sc.close();
    }
}