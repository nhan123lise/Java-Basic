/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 31.	Nhập số nguyên n. Hãy kiểm tra số nguyên dương n có toàn chữ số chẵn hay không
 */
public class bai31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int c = 0;
        while ( n != 0){
            int m = n % 10;
            n /= 10;
            if ( m % 2 != 0 ){
                c++;
                System.out.print("N is not solely even");
                break;
            }
        }
        if ( c == 0 ){
                System.out.print("N is solely even");
            }
        }
    
}
