/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 27.	Nhập số nguyên n. Hãy tìm số đảo ngược của số nguyên dương n (n > 0)
 */
public class bai27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        int s = 0;
        while (n <0){
            System.out.print("Re-enter n");
            n = sc.nextInt();
        }
        while ( n != 0){
            int a = n % 10;
            s = s*10 + a;
            n /= 10;
        }
        System.out.print("Reverse of n " + s);
    }
    
}
