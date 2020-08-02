/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai16.InputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Thêm 1 phần tử x vào mảng tại vị trí k

 */
public class bai17 {
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
    static int[] InsertArray(int[] a, int k, int v){
        int b[] = new int[a.length + 1];
        for ( int i = 0; i < b.length; i++){
            if ( i == k ){
                b[i] = v;
            }
            if ( i < k ){
                b[i] = a[i];
            }
            if ( i > k){
                b[i] = a[i-1];
            }
        }
        return b;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array ");
        System.out.println();
        int[] Array = InputArray(n);
        System.out.print("Enter order ");
        int k = sc.nextInt();
        while ( k < 0 || k > n+1){
            System.out.print("Re-enter k ");
            k = sc.nextInt();
        }
        System.out.print("Enter value ");
        int v = sc.nextInt();
        int[] New = InsertArray(Array, k, v);
        System.out.print("New Array ");
        DisplayArray(New);
        
    }
    
}
