/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai42.inputArray;
import java.util.Scanner;

/**
 Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). Nhập vào 2 số là 2 dòng trong
ma trận. Hoán vị 2 dòng trong ma trận
 */
public class bai43 {
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
    static void changeRow(int[][] a, int b, int c){
        int[] tmp = new int[a.length];
        for ( int j = 0; j < a[0].length;j++){
            tmp[j] = a[b][j];
            a[b][j] = a[c][j];
            a[c][j] = tmp[j];
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
        System.out.print("enter row ");
        System.out.print("1st row ");
        int b = sc.nextInt();
        System.out.print("2nd row ");
        int c = sc.nextInt();
        changeRow(a,b,c);
        displayArray(a);
    }    
}
