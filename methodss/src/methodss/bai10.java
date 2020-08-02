/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm đếm số lượng chữ số lẻ của số nguyên dương
n (n &gt; 0)
 */
public class bai10 {
    static int InputNum(){
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
    static int CountOdd(int n){
        int s = 0;
        while ( n != 0 ){
            int k = n % 10;
            if ( k % 2 != 0 ){
                s++;
            }
            n /= 10;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int n = InputNum();
        int s = CountOdd(n);
        System.out.print("Total odd digits of "+n+" is "+s);
    }
    
}
