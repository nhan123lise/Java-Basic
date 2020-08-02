/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.bai7.InputArray;
import java.util.Scanner;

/**
 Viết chương trình nhập vào mảng một chiều số nguyên n phần tử (n &gt; 0). Tìm số
chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1
 */
public class bai8 {
    static int[] InputArray(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for ( int i = 0; i < n; i++){
            System.out.print("["+i+"]");
            a[i] = sc.nextInt();
        }
        return a;
    }
    static void DisplayArray(int a[]){
        for ( int i = 0; i < a.length; i++){
            System.out.print("  " + a[i]);
        }
        System.out.println();
    }
    static int EvenNum(int a[], int n)
    {
        int b=-1;
        for ( int i = (n-1); i >= 0; i--)
        {
            if ( a[i] % 2 == 0 )
            {
                b= a[i];
                return b;
            }
        }
        return b;
    }
    public static void main(String[] args)
    {
        System.out.print("Enter n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Input your Array ");
        System.out.println();
        int[] intArray = InputArray(n);
        System.out.print("Numbers of Array ");
        DisplayArray(intArray);
        int b = EvenNum(intArray, n);
        System.out.print("Last even num of Array is " + b);
        
    }
    
}
