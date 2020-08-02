/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 18.	Cho số nguyên dương n. Kiểm tra xem n có phải là số hoàn hảo hay không. 
Số hoàn hảo là số có tổng tất cả các ước bé hơn bé hơn n bằng chính nó. Ví dụ 6 là số hoàn hảo, vì 6 có các ước là 1, 2, 3. Và tổng 1 + 2 +3 = 6

 */
public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n = sc.nextInt();
        int s = 0;
        for ( int i = 1; i <= n/2; i++ ){
            if ( n % i == 0 ){
                s += i;
            }
        }
        if ( s == n ){
            System.out.print("n is perfect num");
        } else {
            System.out.print("n is not perfect num");
        }
    }
}
    

