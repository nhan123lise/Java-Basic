/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 21.	Nhập số nguyên n. Hãy đếm số lượng chữ số của số nguyên dương n (n > 0)
 */
public class bai21 {

    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int num = sc.nextInt();
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
    
