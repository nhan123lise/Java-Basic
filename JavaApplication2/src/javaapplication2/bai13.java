/*Viết chương trình phải phương trình bậc 2: ax 2 + bx + c = 0
Đầu vào: nhập 3 số a, b, c (a, b, c là số bất kỳ)
Đầu ra: nghiệm của phương trình
Hướng dẫn:
Nếu a # 0 thì trở thành phương trình bậc 2 (chuẩn)
Ngược lại, thì trở thành phương trình bậc nhất
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author mac
 */
import java.util.Scanner;
 
public class bai13 {
 
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a=input.nextDouble();
        System.out.println("Nhap he so b: ");
        b=input.nextDouble();
        System.out.println("Nhap he so c: ");
        c=input.nextDouble();
        GiaiPTBac2(a,b,c);
    }
     public  static void GiaiPTBac2(double a, double b, double c){
         if(a==0){
             if(b==0)
                System.out.println("Phương trình vô nghiệm!");
             else
                 System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
         }
        double delta=b*b-4*a*c;
        double X1;
        double X2;
        if (delta > 0) {
            X1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            X2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "X1 = " + X1 + " và X2 = " + X2);
        } 
        else if (delta == 0) {
            X1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "X1 = X2 = " + X1);
        } 
        else {
            System.out.println("Phương trình vô nghiệm!");
        }
 
     }
}