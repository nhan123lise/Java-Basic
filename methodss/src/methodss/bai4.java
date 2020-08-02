/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Viết hàm đếm số lượng “ước số” của số nguyên dương n (n &gt; 0)
 */
public class bai4 {
    static int inputIntNumber(){
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            n = sc.nextInt();
            if ( n <= 0 ){
                System.out.print("Please in put n again. n = ");
            }
        } while( n <= 0 );
        return n;
    }
    
    static int countDivisor(int n){
        int s = 0;
        for ( int i = 1; i <= n; i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        return s;
    }
    public static void main(String[] args){
        int n;
        System.out.print("n = ");
        n = inputIntNumber();
        int s = countDivisor(n);
        System.out.print("Sum = " + s);
    }
    
    
}
