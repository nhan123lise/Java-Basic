/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai2.inputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). Liệt kê
các vị trí mà giá trị tại đó là giá trị âm trong mảng 1 chiều.
 */
public class bai3 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void displayArray(int a[]){
        for ( int i = 0; i < a.length; i++){
            System.out.print("  " + a[i]);
        }
        System.out.println();
    }
    static void DisplayNegative(int a[], int n){
        for ( int i = 0; i < n; i++){
            if ( a[i] < 0 ){
                System.out.print(i + "  ");
            }
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
        int[]intArray = inputArray(n);
        System.out.print("Các phần tử của mảng là: ");
        displayArray(intArray);
        System.out.print("Order that have negative num are ");
        DisplayNegative(intArray,n);
    }
}
