/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai26.InputArray;
import java.util.Arrays;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n > 0). Đếm các số phần tử xuất hiện hơn 1 lần trong mảng số nguyên  cho trước.

 */
public class bai28 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++ ){
            System.out.print("[" + i + "]");
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
    static int[] ArrangeArray(int[] a){
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
    static int[] NewA(int[] a){
        int b=0;
        a[b]=a[0];
        for(int i=0;i<a.length;i++){
            if (a[b]!=a[i]){
                b++;
                a[b]=a[i];
            }
        }
        return Arrays.copyOf(a,b+1);
    }
    static int CountA(int[] a){
        ArrangeArray(a);
        int[] CopyA = a.clone();
        int[] b = NewA(a);
        int j = 0;
        int[] count = new int[b.length];
        for ( int i = 0; i < CopyA.length;i++){
            if( CopyA[i] == b[j] ){
                count[j]++;
            } else {
                j++;
                count[j]++;
            }    
        }
       
        int c = 0;
        for ( int i = 0; i < b.length;i++){
            if ( count[i] >= 2){
                c++;
            }
        }
        return c;
    }
     static boolean isContainBefore(int[] a, int x, int before){
        for ( int i = 0; i <= before ;i++){
            if ( a[i] == x){
                return true;
            }
        }
        return false;
    }
    static int countNumAppearMoreThanOnce(int[] a){
        int count = 0;
        for ( int i = 0; i < a.length;i++){
            if(countAppearing(a,a[i])>1 && isContainBefore(a, a[i], i-1)){
                count++;
            }    
        }
        return count;
    }
    static int countAppearing(int []a, int x){
        int count = 0;
        for ( int i = 0; i < a.length; i++){
            if ( a[i] == x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        System.out.print("Input your array ");
        System.out.println();
        int[] Array = InputArray(n);
        System.out.print("Number of nums appear more than one time " + CountA(Array) );
    }
        
}
