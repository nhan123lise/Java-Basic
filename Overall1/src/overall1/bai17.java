/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 17.	Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất là 25
 */
public class bai17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n ");
        int n = sc.nextInt();
        for (int i = n; i <= n; i--)
            if( n % i == 0 && i % 2 != 0 ){
                System.out.print("uoc le lon nhat la " + i);
            break;
                
            }
    }
    
}
