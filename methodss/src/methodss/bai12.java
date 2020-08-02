/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm tìm chữ số lớn nhất của số nguyên dương n (n
&gt; 0)
 */
public class bai12 {
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
    static int BiggestDigit(int n){
        int max;
        max = n % 10;
        while ( n != 0){
            if ( n % 10 > max ){
                max = n % 10;
            }
            n /= 10;
        }
        return max;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int n = InputNum();
        int s = BiggestDigit(n);
        System.out.print("Biggest digit of "+n+" is "+s);
    }
    
}
