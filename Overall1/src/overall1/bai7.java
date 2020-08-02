/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 7.	Viết chương trình in menu và thực hiện chức năng. Lặp đi lặp lại cho đến khi chọn 0 để dừng
	-------------------------TINH DIEN TICH--------------------------
	An 1. Dien tich hinh chu nhat
	An 2. Dien tich hinh tam giac
	An 3. Dien tich hinh vuong
	An 4. Dien tich hinh tron
	An 5. Dien tich hinh thang
	An 0. Thoat
	Chọn:

 */
public class bai7 {
    public static void main(String[] args){
        int choose;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("--------TINH DIEN TICH--------");
            System.out.println("An 1. Dien tich hinh chu nhat");
            System.out.println("An 2. Dien tich hinh tam giac");
            System.out.println("An 3. Dien tich hinh vuong");
            System.out.println("An 4. Dien tich hinh tron");
            System.out.println("An 5. Dien tich hinh thang");
            System.out.println("An 0. Thoat");
            System.out.print("Chon: ");
            
            choose = sc.nextInt();
            
            switch(choose){
                case 1:
                    int w, h;
                    System.out.print("Chieu dai: ");
                    w = sc.nextInt();
                    System.out.print("Chieu rong: ");
                    h = sc.nextInt();
                    System.out.println("Dien tich: " + (w * h));
                    break;
                case 2:
                    System.out.println("Dien tich hinh tam giac");
                    int a,b,c;
                    System.out.println("Nhap canh a");
                    a = sc.nextInt();
                    System.out.println("Nhap canh b");
                    b = sc.nextInt();
                    System.out.println("Nhap canh c");
                    c = sc.nextInt();
                    if((a+b)>c && (a+c)>b && (b+c)>a){
                    float s=(a+b+c)/2;
                    double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                    System.out.println("Dien tich hinh tam giac la " + area);    
                    }else  
                    System.out.println("khong ton tai dien tich tam giac");
                    break;
                case 3:
                    System.out.print("Nhap canh hinh vuong");
                    a = sc.nextInt();
                    System.out.print("Dien tich hinh vuong la" + a*a);
                    break;
                case 4:
                    System.out.print("Nhap canh hinh tron");
                    a = sc.nextInt();
                    System.out.print("Dien tich hinh tron la" + (float)a*3.14);
                    break;
                case 5:
                    System.out.print("Nhap day lon");
                    a = sc.nextInt();
                    System.out.print("Nhap day be");
                    b = sc.nextInt();
                    System.out.print("Nhap chieu cao");
                    c = sc.nextInt();
                    System.out.print("Dien tich hinh thang la" + (float)(a+b)*c/2);
                case 0:
                    System.out.println("Tam biet!!");
                    break;
                default:
                    System.out.println("Sai chuc nang");
                    break;
            }
        }while(choose != 0);
       
       
    }
}
    

