/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai32.inputArray;
import java.util.Scanner;

/**
 Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). Đếm số lượng số nguyên tố
trong ma trận
 */
public class bai34 {
    static int[][] inputArray(int n, int m){
        int a[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < n; i++){
            for ( int j = 0; j < m; j++){
                System.out.printf("[%d][%d] = ",i,j );
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return a;
    }
    static void displayArray(int[][] a){
        for ( int i = 0; i < a.length; i++){//lay hang
            for ( int j = 0; j < a[0].length; j++){//lay cot
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
    static boolean IsPrime(int n){
        int s = 0;
        for ( int i = 1; i <= Math.sqrt(n); i++){
            if ( n % i == 0 ){
                s++;
            }
        }
        if ( s == 2 || n == 1 ){
            return false;
        }
        return true;
    }
    static int countPrime(int[][] a){
        int count = 0;
        for ( int i = 0; i < a.length;i++){
            for(int j = 0; j < a[0].length;j++){
                if(IsPrime(a[i][j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows ");
        int n = sc.nextInt();
        System.out.print("Enter column ");
        int m = sc.nextInt();
        int[][] a = inputArray(n,m);
        System.out.println("------------");
        displayArray(a);
        System.out.print("Number of prime digits are " + countPrime(a));
    }
    
}
