/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class test {
    static boolean IsPrime(int n){
        int s = 0;
        for ( int i = 1; i < Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        if ( s == 2 ){
            return false;
        }
        return true;
    }
    static boolean IsIncreasing(int k){
        int after = k % 10;
        k /= 10;
        while ( k != 0 ){
            if ( k % 10 > after ){
                return false;
            }
            k /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        boolean rs = true;
        while ( n != 0){
            int c = n % 10;
            n /= 10;
            if ( !IsPrime(c) ){
                rs = false;
            } 
        }
        if ( rs && IsIncreasing(a) && n > 9){
            System.out.print("n is friend up num");
        } else {
            System.out.print("n is not friend up num");
        }
        
    }
    
}
