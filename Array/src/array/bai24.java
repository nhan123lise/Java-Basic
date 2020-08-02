/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Dịch phải xoay vòng k phần tử trong mảng
 */
public class bai24 {
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
    static int[] ArrangeArray(int[] a, int n){
        int[] b = new int[n];
        int index = 1;
        for ( int i = 1; i < a.length ; i++){
                b[index++] = a[i-1];
        }
        b[0] = a[n-1];
        return b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array ");
        System.out.println();
        int[] Array = InputArray(n);
        int[] newArray = ArrangeArray(Array,n);
        System.out.print("New Array ");
        DisplayArray(newArray);
    }
}
