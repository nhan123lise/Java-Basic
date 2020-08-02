/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 25.	Nhập số nguyên n. Hãy tính tổng các chữ số chẵn của số nguyên dương n (n > 0)
 */
public class bai25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int k = 0;
        while ( n != 0 ){
            int m = n % 10;
            n /= 10;
            if ( m % 2 == 0 ){
                k += m;
            }else{
                continue;
            }
        }
        System.out.print("Sum of even digits" + k);
                
    }
}
    

