/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai21.InputArray;
import java.util.Arrays;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0).
Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
 */
public class bai20 {
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
    static boolean isInArray(int[] a, int x){
        for ( int i = 0; i < a.length; i++){
            if ( a[i] == x ){
                return true;
            }
        }
        return false;
    }
    static boolean isContainBefore(int[] a, int x, int before){
        for ( int i = 0; i <= before ;i++){
            if ( a[i] == x){
                return true;
            }
        }
        return false;
    }
    static int[] removeDuplication(int[]a){
        int num = 0;
        for ( int i = 0; i < a.length;i++){
            if ( !isContainBefore(a, a[i], i-1)){
                num++;
            }
        }
        
        int index = 0;
        int[] b = new int[num];
        for( int i = 0; i < a.length; i++){
            if(!isInArray(b,a[i])){
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
        int[] b = removeDuplication(Array);
        System.out.print("New Array ");
        DisplayArray(b);
                
    }
    
}
