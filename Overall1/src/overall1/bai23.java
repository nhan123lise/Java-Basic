/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
23.	Nhập số nguyên n. Hãy tính tích các chữ số của số nguyên dương n (n > 0)
 */
public class bai23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        int k = 1;
        while ( n != 0 ){
            k *= n % 10;
            n /= 10;
        }
        System.out.print("Product of digits" + k);
    }
}
