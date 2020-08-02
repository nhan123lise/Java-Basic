/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
Nhập ma trận vuông (n x n). Sắp xếp chéo phụ giảm dần
 */
public class bai50 {
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
    static void ArrangeA(int[][] a,int n){
        int tmp;
        for ( int i = 0; i < a.length;i++){
            for ( int j = i + 1; j < a.length;j++){
                if ( a[i][n-1-i] < a[j][n-1-j] ){
                    tmp = a[i][n-1-i];
                    a[i][n-1-i] = a[j][n-1-j];
                    a[j][n-1-j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix ");
        int n = sc.nextInt();
        int[][] a = inputArray(n);
        System.out.println("------------");
        displayArray(a);
        ArrangeA(a,n);
        System.out.println("------------");
        displayArray(a);
    }    

    
}
