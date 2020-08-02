/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). In ra
mảng vừa nhập và tổng các phần tử chẵn của mảng
 */
public class bai2 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"] = ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void displayArray(int[] a){
        for ( int i = 0; i < a.length; i++ ){
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }
     static int sumEvenNumbersOfArray(int[]b){
        int S = 0;
        for(int i = 0; i < b.length; i++){
            if(b[i]%2 == 0)
                S += b[i];
        }      
        System.out.println(S);
        return S;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n;
        System.out.print("Nhập n = ");
        n = ip.nextInt();
        while(n <= 0){
            System.out.print("Nhập lại n > 0: ");
            n = ip.nextInt();
        }
        System.out.println("Nhập các phần tử của mảng: ");      
        int[]intArray = inputArray(n);
        System.out.print("Các phần tử của mảng là: ");
        displayArray(intArray);
       
        System.out.print("Tổng các phần tử chẵn của mảng là: ");
        sumEvenNumbersOfArray(intArray);
    }
    
}
