/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_IF_ELSE;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT01 {
    public static void main(String[] args) {
        double a,b;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("GIAI PHUONG TRINH BAC 1 ");
        System.out.print("Nhap a: ");
        a= sc.nextDouble();
        System.out.print("Nhap b: ");
        b= sc.nextDouble();
        
        if (a==0) {
            if (b==0) {
                kq="PHUONG TRINH VO SO NGHIEM";
            }else{
                kq="PHUONG TRINH VO  NGHIEM";
            }
        } else {
            kq="PHUONG TRINH CO NGHIEM x ="+ (-b/a);
        }
        System.out.println(kq);
    }
}
