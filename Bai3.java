package BTLTHDT;
import java.util.Scanner;
public class Bai3 {
    static Scanner sc = new Scanner(System.in); 
    static int a,b;
    public static void main(String[] args) 
    {
        Nhap();
        System.out.println("Chon tu 1-4 de lam phep toan ");
        System.out.println("1. Phep cong ");
        System.out.println("2. Phep tru ");
        System.out.println("3. Phep nhan ");
        System.out.println("4. Phep chia ");
        int Item = sc.nextInt();
        Menu(Item);
        sc.close();
    }
    static void Nhap ()
    {
        System.out.println("Nhap vao so can tinh thu 1 :");
        a = sc.nextInt();
        System.out.println("Nhap vao so can tinh thu 2 :");
        b = sc.nextInt();
    }
    static void Cong ()
    {
        int cong = a + b;
        System.out.println("Tong cua phep tinh la :"+ cong);
    }
    static void Tru ()
    {
        int tru = a - b;
        System.out.println("Hieu cua phep tinh la :"+ tru );
    }
    static void Nhan ()
    {
        int nhan = a*b;
        System.out.println("Tich cua phep toan la :"+ nhan );
    }
    static void Chia ()
    {
        if (b==0) 
        {
            System.out.println("khong the chia cho 0");
        }
        else
        {
        double chia = (double) a/b;
        System.out.println("Thuong cua phpe toan la :"+ chia);
        }
    }
    static void Menu (int Item )
    {
        switch (Item) {
            case 1:
                Cong();
                break;
            case 2:
                Tru();
                break;
            case 3:
                Nhan();
                break;
            case 4:
                Chia();
                break;
            default:
                System.out.println("Nhap sai vui long nhap lai de chon dap an dung ");
                break;
        }
    }
}
