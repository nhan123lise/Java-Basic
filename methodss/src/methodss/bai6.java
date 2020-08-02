/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 Cho số nguyên dương n. Viết hàm kiểm tra xem n có phải là số nguyên tố hay
không
 */
public class bai6 {
    static int Inputnumber(){
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
    static boolean isPrime (int n){
        Scanner sc = new Scanner(System.in);
        int s = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        if ( s == 2 ){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Please enter n ");
        int a = Inputnumber();
        if ( isPrime(a)){
            System.out.print(a +" is prime num");
        } else {
            System.out.print(a+" is not prime num");
        }
    }
    
}
