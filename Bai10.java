package THlthdt;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ds = new ArrayList<>();

        System.out.print("Nhap so luong phan tu ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            ds.add(sc.nextInt());
        }

        System.out.println("\nDanh sach ban dau " + ds);

        System.out.print("\nNhap gia tri can them ");
        int valueAdd = sc.nextInt();
        System.out.print("Nhap vi tri can them (0 -> " + ds.size() + "): ");
        int posAdd = sc.nextInt();

        if (posAdd >= 0 && posAdd <= ds.size()) {
            ds.add(posAdd, valueAdd);
            System.out.println("Danh sach sau khi them " + ds);
        } else {
            System.out.println("vi tri khong hop le ");
        }

        System.out.print("\nNhap vi tri can xoa (0 -> " + (ds.size() - 1) + "): ");
        int posRemove = sc.nextInt();

        if (posRemove >= 0 && posRemove < ds.size()) {
            int removedValue = ds.remove(posRemove);
            System.out.println("Da xoa phan tu " + removedValue);
            System.out.println("Danh sach sau khi xoa " + ds);
        } else {
            System.out.println("Vi tri khong hop le");
        }

        sc.close();
    }
}