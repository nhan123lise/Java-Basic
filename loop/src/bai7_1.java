
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class bai7_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("\t" + i);
            if (i % 10 == 9 ) System.out.println("");
            i++;
        } while ( i < 100 );
        }
    }

