/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author macViết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số nguyên tố trong mảng

 */
public class bai21 {
    static int[] InputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"]");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void DisplayArray(int[] a){
        for ( int i = 0; i < a.length ; i++){
            System.out.print("  " + a[i]);
        }
        System.out.println();
    }
    static boolean IsPrime(int n){
        int s = 0;
        for ( int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        if ( s == 2 || n == 1 ){
            return false;
        }
        return true;
    }
    public static int[] DelPrime(int[] a){
        int index = 0;
        for ( int i = 0; i < a.length;i++){
            if( !IsPrime(a[i]) ){
                a[index++] = a[i];
            }
        }
        return Arrays.copyOf(a, index);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array ");
        System.out.println();
        int[] Array = InputArray(n);
        int[] DelMax = DelPrime(Array);
        System.out.print("New Array ");
        DisplayArray(DelMax);
                
    }
    
}
