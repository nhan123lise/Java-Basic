/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai3.inputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). Liệt kê
các phần tử là số nguyên tố
 */
public class bai4 {
    static int[] InputArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"] :");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void DisplayArray(int a[]){
        for ( int i = 0; i < a.length; i++){
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
    static void PrintPrime(int a[], int n){
        for ( int i = 0; i < n; i++){
            if(IsPrime(a[i])){
                System.out.print(a[i]);
            }
            System.out.print("  ");
        }
    }
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n;
        System.out.print("Nhập n = ");
        n = ip.nextInt();
        while(n <= 0){
            System.out.print("Nhập lại n > 0: ");
            n = ip.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng: ");      
        int[]intArray = InputArray(n);
        System.out.print("Các phần tử của mảng là: ");
        DisplayArray(intArray);
        System.out.print("Prime nums are ");
        PrintPrime(intArray, n);
        
    }
    
}
