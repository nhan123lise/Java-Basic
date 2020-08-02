/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm tính tổng các chữ số của số nguyên dương n (n &gt; 0)
 */
public class bao9 {
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
    static int SumNum(int n){
        int s = 0;
        while ( n != 0 ){
            int m = n % 10;
            n /= 10; 
            s += m;
        }
        return s;
    }
    public static void main(String[] args){
        int n;
        System.out.print("input n ");
        n = IntNum();
        int s = SumNum(n);
        System.out.print("Sum of num " + s );
        
    }
    
}
