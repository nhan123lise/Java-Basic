/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Xóa tất cả các số âm trong mảng

 */
public class bai19 {
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
    public static int[] DelNeg(int[] a){
        int index = 0;
        for ( int i = 0; i < a.length;i++){
            if( a[i] >= 0 ){
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
        int[] DelMax = DelNeg(Array);
        System.out.print("New Array ");
        DisplayArray(DelMax);
                
    }
    
}
