/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai9.InputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0).
Đếm số lượng số chẵn trong mảng
 */
public class bai10 {
    static int[] InputArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"]");
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
    static int CountEven(int a[], int n){
        int count = 0;
        for ( int i = 0; i < n; i++){
            if( a[i] % 2 == 0 ){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array");
        System.out.println();
        int[] intArray = InputArray(n);
        System.out.print("Number of Array ");
        DisplayArray(intArray);
        int b = CountEven(intArray,n);
        System.out.print("Nums of Even are " +b);
    }
}
