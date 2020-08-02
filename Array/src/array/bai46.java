/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). Sắp xếp các phần tử trên 1 cột
giảm dần từ trên xuống dưới
 */
public class bai46 {
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
    static void ArrangeArray(int[][] a, int n){
        int temp = a[0][n];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i][n] > a[j][n]) {
                    temp = a[j][n];
                    a[j][n] = a[i][n];
                    a[i][n] = temp;
                }
            }
        }
    }
    static void NewA(int[][] a){
        for (int i = 0; i < a.length;i++){
            for(int j = 0; j < a[0].length;j++){
                ArrangeArray(a,j);
            }
        }
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
        System.out.print("New Array ");
        System.out.println();
        NewA(a);
        displayArray(a);
    }    
    
}
