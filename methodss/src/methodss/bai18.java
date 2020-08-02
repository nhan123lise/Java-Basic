/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
Liệt kê tất cả các số nguyên tố nhỏ hơn n (Sử dụng hàm kiểm tra số nguyên
tố)
 */
public class bai18 {
    static int IntNum(){
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
    static boolean IsPrime(int n){
        int s = 0;
        for ( int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
            if ( s == 2 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int n = IntNum();
        for ( int i = 1; i <= n; i ++){
            if ( IsPrime(i) && i != 1 ){
                System.out.print("   " +i);
            }
        }
    }
    
}
