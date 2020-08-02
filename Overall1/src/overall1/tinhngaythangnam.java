/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overall1;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class tinhngaythangnam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day ");
        int d = sc.nextInt();
        System.out.print("Enter month ");
        int m = sc.nextInt();
        System.out.print("Enter year ");
        int y = sc.nextInt();
        int x = 0;
        int k = 0;
        for( int i = 1; i < m; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    x = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    x = 30;
                    break;
                case 2:
                    if ( (y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0) ){
                        x = 29;
                    }else{
                        x = 28;
                    }
                    break;
            }
            k += x;
        }
        k += d;
        System.out.print("Ngay "+d+" thang "+m+" nam "+y+" la ngay thu "+k+" cua nam");
    }
}
