/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm đếm số lượng chữ số của số nguyên dương n (n &gt; 0)
 */
public class bai8 {
    static int inputNum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while ( n <= 0 ){
            if ( n <= 0 ){
                System.out.print("Please in put n again. n = ");
                n = sc.nextInt();
            }
        }
        return n;
    }
    static int count(int n){
        int s = 0;
        while ( n != 0 ){
            n /= 10;
            s++;
        }
        return s;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        int a = inputNum();
        int s = count(a);
        System.out.print("Total digits of " + a + " is " + s);
    }
    
}
