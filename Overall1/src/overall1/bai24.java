/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 24.	Nhập số nguyên n. Hãy đếm số lượng chữ số lẻ của số nguyên dương n (n > 0)
 */
public class bai24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        int count = 0;
        int k = 0;
        while ( n != 0 ){
            k = n % 10;
            if ( k % 2 != 0 ){
                count++;
            }
            n /= 10;
        }
        System.out.print("Odd digits " + count);
    }
    
}
