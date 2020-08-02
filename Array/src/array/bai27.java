/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0).
Kiểm tra mảng có đối xứng hay không!
Ví dụ:
int [] a = { 1, 2, 3 ,3 2,1} → mảng đối xứng
int [] b = { 1, 2, 3, 3,1} → Mảng không đối xứng
 */
public class bai27 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++ ){
            System.out.print("[" + i + "]");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static boolean IsSymmetric(int a[], int n){
        for( int i = 0; i < n/2; i++ ){
            if ( a[i] != a[n-1-i] ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n ");
        int n;
        n = sc.nextInt();
        int[] b = inputArray(n);
        //boolean rs = IsSymmetric(b,n);
        if ( IsSymmetric(b,n) ){
            System.out.print("is symmetric");
        } else {
            System.out.print("is not symmetric");
        }
        
    }
    
}
