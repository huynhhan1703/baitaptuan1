/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_For_While_DoWhile;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BT08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinh tong cac so tu 1->n");
        System.out.print("Nhap n: ");
        n= sc.nextInt();
        
        
        for (int i = 0; i <= n; i++) {
            s+=i;
        }
        System.out.println("Tong cac so la: "+s);
    }
    
}
