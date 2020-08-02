/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 8.	Nhập 2 số a và b. Tạo menu chọn phép tính và in ra kết quả
	------PHEP TINH---------
	An 1. a x b
	An 2. a / b
	An 3. a + b
	An 4. a - b
	An 5. a % b
	An 0. Thoat
	Chọn:

 */
public class bai8 {
    public static void main(String[] args){
        int choose;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Nhap so a");
        int a = sc.nextInt();
        System.out.println("Nhap so b");
        int b = sc.nextInt();
        System.out.println("------PHEP TINH---------\n" +
"	An 1. a x b\n" +
"	An 2. a / b\n" +
"	An 3. a + b\n" +
"	An 4. a - b\n" +
"	An 5. a % b\n" +
"	An 0. Thoat\n" +
"	Chọn:");
         choose = sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("ket qua la" +a*b);
                break;
            case 2:
                System.out.println("ket qua la" + a/b);
                break;
            case 3 :
                System.out.println("Ket qua la" + a+b);
                break;
            case 4 :
                System.out.println("ket qua la" + (a-b));
                break;
            case 5 :
                System.out.println("ket qua la" + (a%b));
                break;
            case 0:
                System.out.println("thoat");
                break;
            default:
                System.out.println("xin moi nhap lai");
        }
        }while(choose != 0);
    }
}

        
        
        
    
    
    

