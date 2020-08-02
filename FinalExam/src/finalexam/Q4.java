/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Q4 {
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
        for ( int i = 0; i < a.length; i++){
            for ( int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
    static void swapColumn(int[][] a, int b, int c){
        int[] tmp = new int[a.length];
        for ( int i = 0; i < a.length;i++){
            tmp[i] = a[i][b];
            a[i][b] = a[i][c];
            a[i][c] = tmp[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows ");
        int n = sc.nextInt();
        System.out.print("Enter column ");
        int m = sc.nextInt();
        while ( n <= 0 || m <= 0 ){
            System.out.print("Re-enter n: ");
            n = sc.nextInt();
            System.out.print("Re-enter m: ");
            m = sc.nextInt();
        }
        int[][] a = inputArray(n,m);
        System.out.println("------------");
        displayArray(a);
        System.out.print("1st column ");
        int b = sc.nextInt();
        System.out.print("2nd column ");
        int c = sc.nextInt();
        swapColumn(a,b,c);
        displayArray(a);
        ArrayList<Integer> arr = new ArrayList<>();
        for ( int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr.add(a[i][j]);
            }
        }
        System.out.println();
        System.out.print("ArrayList: "+ arr);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println();
        System.out.print("Sort decreasing of ArrayList: " + arr);
    }    
    
    
}
