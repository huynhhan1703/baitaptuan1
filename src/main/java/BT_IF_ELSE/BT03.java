/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_IF_ELSE;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, min;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("IN RA SO NHO NHAT ");
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();

        min = a;
        if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }
            
        System.out.println("So nho nhat la: "+min);

    }

}
