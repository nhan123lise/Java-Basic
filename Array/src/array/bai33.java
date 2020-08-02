/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai32.inputArray;
import java.util.Scanner;

/**
 Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). Tìm giá trị lớn nhất và nhỏ nhất
của ma trận
 */
public class bai33 {
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
    static void displayMaxOfRowIndex(int [][]a) {
        int []maxRows = new int[a.length];
        int max = a[0][0];
        for(int i = 0; i < a.length; i++) {
            int maxR = a[i][0];
            for(int j = 0; j < a[0].length; j++) {
                //max of matrix
                if(max < a[i][j]) {
                    max = a[i][j];
                }
                
                //max on Row
                if(maxR < a[i][j]) {
                    maxR = a[i][j];
                }
            }
            maxRows[i] = maxR;
        }
        
        for(int i = 0; i < maxRows.length; i++) {
            if(maxRows[i] == max) {
                System.out.print(i + " ");
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
        System.out.print("Max of matrix is ");
        displayMaxOfRowIndex(a);
    }    
}
