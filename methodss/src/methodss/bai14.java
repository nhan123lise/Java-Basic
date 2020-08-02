/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm kiểm tra số nguyên dương n có toàn chữ số lẻ
hay không
 */
public class bai14 {
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
    static boolean IsOdd(int n){
        int s;
        while ( n != 0 ){
            s = n % 10;
            if ( s % 2 == 0 ){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int n = IntNum();
        if ( IsOdd(n)){
            System.out.print("All digits of "+n+" are odd ");
        }else{
            System.out.print("All digits of "+n+" are not odd");
        }
    }
    
}
