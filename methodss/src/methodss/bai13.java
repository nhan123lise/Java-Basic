/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Nhập số nguyên n. Viết hàm tìm chữ số nhỏ nhất của số nguyên dương n (n
&gt; 0)
 */
public class bai13 {
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
    static int MinNum(int n){
        int min = n % 10;
        n /= 10;
        while(n != 0) {
            int tmp = n % 10;
            if(min > tmp) {
                min = tmp;
            }
            n /= 10;
        }
        return min;
    }
    public static void main(String[] args){
        int n;
        System.out.print("Enter n ");
        n = IntNum();
        int min = MinNum(n);
        System.out.print("Min Num is " + min);
    }
    
    
}
