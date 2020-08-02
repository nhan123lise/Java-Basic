/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
Viết chương trình nhập vào các số nguyên cho đến khi nhập 0 thì dừng. 
In danh sách vừa nhập ra màn hình
Nhập số nguyên và in ra vị trí tìm thấy đầu tiên trong danh sách. Nếu không tìm thấy, chèn số đó vào đầu danh sách
Nhập số nguyên và in ra vị trí tìm thấy cuối cùng trong danh sách. Nếu không tìm thấy, chèn số đó vào cuối danh sách
Sắp xếp theo thứ tự tăng dần
Sắp xếp theo thứ tự giảm dần

 */
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer> arr = new ArrayList<>();
        do{
            System.out.print("Import number: ");
            n = sc.nextInt();
            if ( n != 0){
                arr.add(n);
            }
        }while(n != 0);
        //a
        System.out.println("Your array: ");
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        //b
        System.out.print("Import number: ");
        int m = sc.nextInt();
        if (arr.indexOf(m) == -1){
            arr.add(0, m);
            System.out.println("New array: ");
            for (int i = 0; i < arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        } else {
            System.out.println(arr.indexOf(m));
        }
        //c
        System.out.print("Import number: ");
        int o = sc.nextInt();
        if (arr.lastIndexOf(o) == -1){
            arr.add(o);
            System.out.println("New array: ");
            for (int i = 0; i < arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        } else {
            System.out.println(arr.lastIndexOf(o));
        }
        //d
        Collections.sort(arr);
        //e
        ArrayList arr1 = (ArrayList) arr.clone();
        System.out.println("current: "+arr);
//        for (int i = 0; i < arr.size(); i++){
//            arr.set(i, (int) arr1.get(arr1.size()-1-i));
//        }
        System.out.println(arr);
        Collections.reverse(arr1);
        System.out.print(arr1);
        //Advance 
//        Collections.sort(arr, (o1, o2) -> {
//            return o2-o1;
//        });
    }
    
    
}
