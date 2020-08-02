/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenthithanhnhan;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai3 {
    static int ReverseNum(int n) {
        int s = 0;
        while (n != 0) {
            int a = n % 10;
            s = s*10 + a;
            n /= 10;           
        }
        return s;       
    }
    static boolean IsSymmetry(int n) {
        if ( n == ReverseNum(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        n = sc.nextInt();
        if (IsSymmetry(n) && ((n > 10) || (n < -10))) {
            System.out.println(n + " is sysmmetry");
        } else {
            System.out.println(n + " is not symmetry");
        }
    }
}
