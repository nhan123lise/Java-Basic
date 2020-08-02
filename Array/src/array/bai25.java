/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Tạo mảng b chỉ chứa giá trị lẻ từ mảng a

 */
public class bai25 {
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
    static int[] NewArray(int[] a){
        int count = 0;
        for( int i = 0; i < a.length;i++){
            if ( a[i] % 2 == 1){
                count++;
            }
        }
        int[] b = new int[count];
        int index = 0;
        for (int i = 0; i < a.length;i++){
            if ( a[i] % 2 == 1 ){
                b[index++]=a[i];
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
        int[] newArray = NewArray(Array);
        System.out.print("New Array ");
        DisplayArray(newArray);
    }
    
    
}
