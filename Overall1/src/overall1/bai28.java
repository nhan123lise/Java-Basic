/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
28.	Nhập số nguyên n. Tìm chữ số nho nhất của số nguyên dương n (n > 0)
 */
public class bai28 {
     public static void main(String[] args) {
        int n;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("n = ");
        n = sc.nextInt();
        
        int min = n % 10;
        n /= 10;
        
        while(n != 0) {
            int tmp = n % 10;
            if(min > tmp) {
                min= tmp;
            }
            n /= 10;
        }
        
        System.out.println("Min = " + min);
    }
    
    
}
