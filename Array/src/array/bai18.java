/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai15.InputArray;
import java.util.Scanner;
import java.util.Arrays;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Hãy xóa tất cả số lớn nhất trong mảng các số thực

 */
public class bai18 {
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
    public static int[] DelMax(int[] a){
        int count = 0;
        int maxp = a[0];
        for ( int i = 1; i < a.length;i++){
            if ( maxp < a[i]){
                maxp = a[i];
            }
        }
        for ( int i = 1; i < a.length;i++){
            if ( a[i] == maxp ){
                count++;
            }
        }
        int index = 0;
        int[] b = new int[a.length - count];
        for ( int i = 0; i < a.length;i++){
            if( a[i] != maxp ){
                b[index] = a[i];
                index++;
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
        int[] DelMax = DelMax(Array);
        System.out.print("New Array ");
        DisplayArray(DelMax);
                
    }
}
