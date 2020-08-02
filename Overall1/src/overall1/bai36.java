/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 36.	Viết chương trình nhập giá trị x sau tính giá trị của hàm số
f(x) = 2x^2 + 5x + 9 	nếu x >= 5
f(x) = -2x^2 + 4x – 9 	nếu x < 5

 */
public class bai36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x");
        Float x = sc.nextFloat();
        Float fx;
        while ( x >= 5){
            fx = 2*x*x + 5*x + 9;
            System.out.print("fx = " + fx);
            break;
        }
        while ( x < 5 ){
            fx = -2*x*x + 4*x - 9;
            System.out.print("fx = " + fx);
            break;
        }
        
        
    }
    
}
