/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Nhập ma trận VUÔNG (n x n), tính tổng các phần tử trên đường chéo chính
và đường chéo phụ
 */
public class bai48 {
    static int[][] inputArray(int n){
        int a[][] = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < n; i++){
            for ( int j = 0; j < n; j++){
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
    static int sumDiagonal(int[][] a, int n){
        int s = 0;
        int k = (n-1)/2;
        for (int i = 0; i < a.length;i++){
            s += a[i][i] + a[i][n-1-i];
        }
        if ( n % 2 == 1 ){
            s = s - a[k][k];
        }
        return s;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix ");
        int n = sc.nextInt();
        int[][] a = inputArray(n);
        System.out.println("------------");
        displayArray(a);
        System.out.print("Sum of diagonal is "+sumDiagonal(a,n));
    }    
}
