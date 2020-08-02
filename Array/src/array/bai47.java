/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai46.inputArray;
import java.util.Scanner;

/**
 Nhập ma trận vuông (n x n). Kiểm tra đường chéo chính có tăng dần hay ko
 */
public class bai47 {
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
    static boolean isIncrease(int[][] a){
        int b = a[0][0];
        for(int i = 1; i < a.length;i++){
            for(int j = 1; j < a[0].length;j++){
                if ( a[i][j] < b ){
                    return false;
                }else{
                    b = a[i][j];
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square matrix ");
        int n = sc.nextInt();
        int[][] a = inputArray(n);
        System.out.println("------------");
        displayArray(a);
        System.out.println();
        if ( isIncrease(a)){
            System.out.print("Diagonal is increasing ");
        }else{
            System.out.print("Digonal is not increasing");
        }    
    }    
}
