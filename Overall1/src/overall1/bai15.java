/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 15.	Tính tích tất cả các “ước số lẻ” của số nguyên dương n (n > 0)
 */
public class bai15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n");
        int n = sc.nextInt();
        int s = 1;
        for (int i=1; i<= n; i++)
            if ( n % i == 0 && i % 2 != 0 ){
                s *= i;
            }
            System.out.print("Tich uoc le la"+s);
    }
    
}
