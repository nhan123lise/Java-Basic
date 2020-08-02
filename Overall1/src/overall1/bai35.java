/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 35.	Nhập số nguyên N. Viết chương trình tìm số nguyên dương m lớn nhất sao cho 1 + 2 + … + m < N
 */
public class bai35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N");
        int N = sc.nextInt();
        int m = 1;
        int s = 0;
        for (; m < N; m++){
            s += m;
            if ( s >= N ){
                break;
            }
        }
        m = m - 1;
        System.out.print("So nguyen duong m la" + m);
    }
    
}
