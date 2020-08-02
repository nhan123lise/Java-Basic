/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 16.	Đếm số lượng “ước số chẵn” của số nguyên dương n (n > 0)
 */
public class bai16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n");
        int n = sc.nextInt();
        int s = 0;
        for ( int i = 1; i <= n; i++)
            if ( n % i == 0 && i % 2 == 0){
                s++;
            }
        System.out.print("So luong uoc chan la" + s);
        
    }
    
}
