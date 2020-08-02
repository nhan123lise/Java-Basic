/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodss;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai1array {
    static int[] inputArray(int n) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");  
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    static void displayArray(int []a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int sumoddArray(int []a){
        int s = 0;
        for(int i = 0; i < a.length; i++) {
            if ( a[i] % 2 != 0 ){
                s += a[i];
            }
        }
        return s;
    }
    
       
    public static void main(String[] args) {

 

        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        
        System.out.println("Nhap cac phan tu cua mang");
        int []intArray = inputArray(n);
        
        System.out.print("Mang vua nhap: ");
        displayArray(intArray);
        System.out.println();
        int k = sumoddArray(intArray);
        System.out.println("Tong phan le la " + k);
        
       }    
    
}
