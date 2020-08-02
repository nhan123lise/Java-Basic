/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Q3 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void displayArray(int[] a){
        for ( int i = 0; i < a.length; i++ ){
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }
    static boolean IsPrime(int n){
        int s = 0;
        for ( int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        return !(s == 2 || n <= 1);
    }
    static int sumPrime(int[] a){
        int sum = 0;
        for ( int i = 0; i < a.length; i++){
            if ( IsPrime(a[i])){
                sum += a[i];
            }
        }
        return sum;
    }
    static boolean IsSymmetric(int a[], int n){
        for( int i = 0; i <= n/2; i++ ){
            if ( a[i] != a[n-1-i] ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n = sc.nextInt();
        while(n < 5){
            System.out.print("Re-enter n >=5: ");
            n = sc.nextInt();
        }
        System.out.println("Enter the elements of array: ");      
        int[]Array = inputArray(n);
        System.out.print("Elements of array are: ");
        displayArray(Array);
        System.out.print("Sum of prime elements: " + sumPrime(Array));
        System.out.println();
        if ( IsSymmetric(Array,n)){
            System.out.print("Array is symmeytric");
        }else
            System.out.print("Array is not symmetric");
    }
    
}
