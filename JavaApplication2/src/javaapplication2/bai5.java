/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;



/**
 * //Viết chương trình nhập vào một số nguyên là năm (ví dụ năm nay 2018). Kiểm tra
số vừa nhập có phải là năm nhuận hay không?
Biết rằng năm nhuận là:
● Năm chia hết cho 4 nhưng không chia hết cho 100.
● Hoặc năm chia hết cho 400.//
 *
 * @author mac
 */
public class bai5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("nhap nam");
        Integer a;
        a = sc.nextInt(); 
        if ( (a % 4 == 0) && (a % 100 != 0) )
        { System.out.println(a +"nam nhuan");}
        else if ( (a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0) )
               {System.out.println(a +"la nam nhuan");}
                else { System.out.println(a +"khong la nam nhuan");}
           
            }
       
   }
    
    

