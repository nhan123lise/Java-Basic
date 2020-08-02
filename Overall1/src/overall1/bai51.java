/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
Nhập 2 số nguyên a và b. Tìm ước chung lớn nhất của 2 số nguyên, bội
chung nhỏ nhất của 2 số nguyên dương.
Hướng dẫn: Để tìm ƯCLN, ta so sánh 2 số a và b nếu a &gt; b thì lấy a = a - b ngược
lại b = b - a, dừng khi a = b
 */
public class bai51 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        int s = a*b;
       
        while(a != b) {
            if(a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.print("BCNN la " + (s/a));
        
    }
    
}
