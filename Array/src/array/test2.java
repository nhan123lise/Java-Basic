/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class test2 {
    static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int []a = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("[%d] = ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    static void displayArray(int []a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    static void sort(int []a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    
    static void rotate(int a[], int k) {
        int[] newA = new int[a.length];
        k = k % a.length;
        if(k != a.length) {
            for(int i = 0; i < a.length; i++) {
                int j = i + k;
                if(j >= a.length) {
                    j %= a.length;
                }
                if(j < 0) { // k < 0
                    j += a.length;
                }
                newA[j] = a[i];
            }
            //day newA vao a
            for(int i = 0; i < a.length; i++) {
                a[i] = newA[i];
            }          
        }       
    }
    
    static int[] random(int a[]) {
        int []b = a.clone();
        Random r = new Random();
        for(int i = 0; i < b.length; i++){
            int iR = r.nextInt(b.length);
            int tmp = b[i];
            b[i] = b[iR];
            b[iR] = tmp;
        }
        
        return b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        
        System.out.println("Input a array");
        int []a = inputArray(n);
        
        System.out.println("Sort");
        sort(a);
        displayArray(a);
        
        System.out.print("\nRotate k = ");
        int k = sc.nextInt();
        rotate(a, k);
        System.out.println("After rotate");
        displayArray(a);
        
        System.out.println("\nRandom");
        int []b = random(a);
        displayArray(b);
    }
}
