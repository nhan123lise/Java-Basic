/*
 * -------------------------TINH DIEN TICH--------------------------
An 1. Dien tich hinh chu nhat
An 2. Dien tich hinh tam giac
An 3. Dien tich hinh vuong
An 4. Dien tich hinh tron
An 5. Dien tich hinh thang
Chọn:
Mỗi chức năng nhập các hệ số tương ứng để thực hiện
Ví dụ: Chọn: 1
Chieu dai: 3
Chieu rong: 4
Dien tich hinh chu nhat la: 12
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai03 {
    public static void main(String[] args) {
        System.out.println("An 1. Dien tich hinh chu nhat\n" +
"An 2. Dien tich hinh tam giac\n" +
"An 3. Dien tich hinh vuong\n" +
"An 4. Dien tich hinh tron\n" +
"An 5. Dien tich hinh thang ");
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("chon so ");
        x = sc.nextInt(); 
        switch (x) {
            case 1 :
                System.out.println("nhap chieu dai");
                int dai = sc.nextInt();
                System.out.println("nhap chieu rong");
                int rong = sc.nextInt();
                System.out.println("dien tich HCN la" + dai*rong);
                break;
            case 2 :
                System.out.println("nhap canh a");
                int a = sc.nextInt();
                System.out.println("nhap canh b");
                int b = sc.nextInt();
                System.out.println("nhap canh c");
                int c = sc.nextInt();
                if((a+b)>c && (a+c)>b && (b+c)>a) {
                int s=(a+b+c)/2;
                double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("Dien tich hinh tam giac la " + area);    
                } else  
                System.out.println("khong ton tai dien tich tam giac");
                break;
            case 3 :
                System.out.println("nhap canh hinh vuong");
            int canh = sc.nextInt();
                System.out.println("Dien tich hinh vuong la" + canh*canh);
                break;
            case 4 :
                System.out.println("Nhap ban kinh hinh tron");
            int r = sc.nextInt();
                System.out.println("Dien tich hinh tron la" + r*r*3.14);
                break;
            case 5 :
                System.out.println("Nhap day lon");
            int daylon = sc.nextInt();
                System.out.println("Nhap day be");
            int daybe = sc.nextInt();
                System.out.println("Nhap chieu cao");
            int chieucao = sc.nextInt();
                System.out.println("Dien tich hinh thang la" + (daylon + daybe)*chieucao/2 );
                break;
            default :
                System.out.print("Invalid num");
        }
    }
}
