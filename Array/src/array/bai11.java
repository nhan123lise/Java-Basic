/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0).
Đếm số lượng giá trị tận cùng bằng 5 trong mảng
 */
public class bai11 {
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
        for ( int i = 0; i < a.length; i++){
            System.out.print("  " + a[i]);
        }
        System.out.println();
    }
    static boolean Is5(int n){
        int b = n % 10;
        if ( b == 5 ){
            return true;
        }
        return false;
    }
    static void Print5(int n, int[] a){
        for ( int i = 0; i < n; i++){
            if (Is5(a[i])){
                System.out.print(a[i]);
            }
            System.out.print("  ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array ");
        System.out.println();
        int[] Array = InputArray(n);
        System.out.print("Nums of Array ");
        DisplayArray(Array);
        System.out.print("Nums that have final digist is 5 are ");
        Print5(n, Array);
    }
    
    
}
