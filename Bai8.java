package BTLTHDT;

import java.util.Scanner;

public class Bai8 {
    static Scanner sc = new Scanner(System.in);
    static int M[];
    static int N;
    public static void main(String[] args) {
        System.out.println("Nhap vao so phan tu cua mang ");
        N = sc.nextInt();
        M = new int[N];
        nhap();
        xuat();
        timkiem();
    }
    static void nhap()
    {
        for (int i=0;i<N;i++)
        {
            System.out.println("M["+ i +"] = "); 
            M[i]=sc.nextInt();
        }

    }
    static void xuat()
    {
        System.out.println("Mang sau khi nhap la ");
        for(int i=0;i<N;i++)
        {
            System.out.println("M[" + i +"] = " + M[i]);
        }
    }
    static void timkiem()
    {
        int solan = 0;
        int phantu = M[0];
        for (int i = 0; i < N; i++) 
        {
            int dem = 0;
            for (int j = 0; j < N; j++) 
                if (M[i] == M[j]) 
                    dem++;
            if (dem > solan)
            {
            solan=dem;
            phantu=M[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat trong mang la :" + phantu);
        System.out.println("So lan xuat hien la :" + solan);
    }
}