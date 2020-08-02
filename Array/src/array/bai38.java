/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai37.inputArray;
import java.util.Scanner;

/**
 Nhập ma trận n hàng, m cột (n &gt; 0, m &gt; 0). Kiểm tra ma trận có toàn dương
hay không
 */
public class bai38 {
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
    static boolean IsPositive(int n){
        return n>0;
    }
    static boolean Check(int[][] a){
        for ( int i = 0; i < a.length;i++){
            for ( int j = 0; j < a[0].length;j++){
                if ( !IsPositive(a[i][j])){
                    return false;
                }
            }
        }
        return true;
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
        Check(a);
        if ( !Check(a)){
            System.out.print("Is not positive");
        }else{
            System.out.print("Is positive");
        }    
    }    
    
}
