/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai31 {
    /*
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
    static void displayArray(int [][]a){
         for ( int i = 0; i < a.length; i++){//lay hang
            for ( int j = 0; j < a[0].length; j++){//lay cot
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
    static int SumEven(int [][]a){
        int s = 0;
        for ( int i = 0; i < a.length;i++){
            for (int j = 0; j < a[0].length;j++){
                if ( a[i][j] % 2 == 0 ){
                    s+=a[i][j];
                }
            }
        }
        return s;
    }
    static int getMax(int [][]a){
        int max = a[0][0];
        for (int i = 0; i < a.length;i++){
            for ( int j = 0; j < a[0].length;j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
    static int getMaxOfRow(int [][]a, int row){
        int max = a[row][0];
        for ( int j = 0; j < a[row].length; j++){
            if ( max < a[row][j]){
                max = a[row][j];
            }
        }
        return max;
    }
    static void displayMaxOfRow(int [][]a){
        int max = getMax(a);
        for (int i = 0; i < a.length;i++){
            int maxR = getMaxOfRow(a,i);
            if ( maxR == max ){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Row = ");
        n = sc.nextInt();
        System.out.print("Column = ");
        m = sc.nextInt();
        System.out.print("Input matrix");
        System.out.println();
        int [][] a = inputArray(n,m);
        System.out.print("Display matrix---------");
        System.out.println();
        displayArray(a);
        System.out.print("Sum of even numbers "+SumEven(a));
        System.out.println();
        displayMaxOfRow(a);
    }  
*/
}  

