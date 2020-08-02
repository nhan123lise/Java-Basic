/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai6.InputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). Tìm giá
trị lớn nhất trong mảng.
 */
public class bai7 {
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
    static int MaxNum(int[] a, int n){
        int max = a[0];
        for ( int i = 1; i < n; i++){
            if ( a[i] > max ){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.print("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Input your Array ");
        System.out.println();
        int[] intArray = InputArray(n);
        System.out.print("Numbers of Array ");
        DisplayArray(intArray);
        int max = MaxNum(intArray, n);
        System.out.print("Max value in Array is " + max);
        
    }
    
}
