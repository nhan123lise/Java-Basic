/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). Hãy liệt
kê các số âm trong mảng.
 */
public class bai9 {
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
    static boolean IsNegative(int n)
    {
        if ( n < 0 )
        {
            return true;
        }
        return false;
    }
    static void PrintNegative(int a[], int n)
    {
        for ( int i = 0; i < n; i++)
        {
            if ( IsNegative(a[i]))
            {
                System.out.print(a[i]);
            }
            System.out.print("  ");
        }
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
        System.out.print("Negative num are ");
        PrintNegative(intArray, n);
    }
    
}
