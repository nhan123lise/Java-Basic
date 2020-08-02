/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;
import static methodss.bai10.InputNum;

/**
 Nhập số nguyên n. Viết hàm tìm số đảo ngược của số nguyên dương n (n &gt;
0)
 */
public class bai11 {
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
    static int Reverse(int n){
        int k = 0;
        int s = 0;
        while ( n != 0 ){
            k = n % 10;
            s = s*10 + k;
            n /= 10;
        }
        return s;
    }
     public static void main(String[] args){
        System.out.print("Enter n ");
        int n = InputNum();
        int s = Reverse(n);
        System.out.print("Reverse number of " +n+" is "+s);
    }
}
