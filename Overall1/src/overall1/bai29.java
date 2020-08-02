/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 29.	Nhập số nguyên n. Tìm chữ số lon nhất của số nguyên dương n (n > 0)
 */
public class bai29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int max = n % 10;
        n /= 10;
        while ( n != 0 ){
        if ( n % 10 > max ){
            max = n % 10;
        }
        n /= 10;
        }
        System.out.print("Biggest digit" + max );
    }
             
    }
    

