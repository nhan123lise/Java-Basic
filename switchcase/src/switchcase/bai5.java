/*
 * Nhập vào ký tự A → F hoặc a → f. In ra học lực như sau:
A hoặc a : Excellent
B hoặc b : Good
C hoặc c : Pretty good
D hoặc d : Average
F hoặc f : Failed
Ký tự khác : UNKNOW
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class bai5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("nhao vao ky tu ");
        char grade;
        grade = args[0].charAt(0);
        switch (grade) {
            case 'a':
            case 'A' :
                System.out.println("Excellent");
            break;
            case 'b' :
            case 'B' :
                System.out.println("Good");
            break;
                
                
        }
        
        
        
        
    }
    
}
