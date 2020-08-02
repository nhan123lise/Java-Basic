/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 Nhập 1 số nguyên n, xuất tổng từ 1 đến n
 */
public class loop {
    public static void main(String[] args) {
        int num;
        int s = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Num = ");
        num = sc.nextInt();
        
        int i = 0;
        while (i <= num) {
            s += i;
            i++;
        }
        
        System.out.println("Sum = " + s);
    }
}
        
    

