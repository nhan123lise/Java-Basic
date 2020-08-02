/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). In ra mang trận vừa nhập và
tổng các phần tử lẻ của ma trận
 */
public class bai32 {
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
    static int sumOdd(int[][] a){
        int s = 0;
        for ( int i = 0; i < a.length;i++){
            for(int j = 0; j < a[0].length;j++){
                if(a[i][j] % 2 == 1){
                    s+=a[i][j];
                }
            }
        }
        return s;
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
        System.out.print("Sum of Odd nums is " + sumOdd(a));
    }
    

    
}
