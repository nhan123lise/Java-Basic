/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
19.	Cho số nguyên dương n. Kiểm tra xem n có phải là số nguyên tố hay không
 */
public class bai19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter n ");
            n = sc.nextInt();
            if ( n < 1 ){
                System.out.print("Re-enter n ");
                n = sc.nextInt();
            }
        } while ( n < 1 );
        int s = 0;
        for ( int i = 1; i <= Math.sqrt(n); i++)
            if ( n % i == 0 ){
                s++;
            }
        if ( s == 2 || n == 1 ){
            System.out.print("n ko la so nguyen to");
        }else{
                    System.out.print("n la so nguyen to");
                    }
        }
        
    }

