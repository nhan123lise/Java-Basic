/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Liệt kê tất cả các số chính phương nhỏ hơn n(Sử dụng hàm kiểm tra số
chính phương)
 */
public class bai19 {
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
    static boolean IsSquare(int n){
        for ( int i = 0; i <= (n/2); i++){
            if ( n == i*i || n == 1 ){
                return true;
            }
        }    
        return false;
    }
        
    public static void main(String[] args){
        System.out.print("Enter n ");
        int n = IntNum();
        System.out.print("Square nums are ");
        for ( int i = 1; i <= n; i ++){
            if ( IsSquare(i) ){
                System.out.print(i +"   ");
            }
        }
    }
}
