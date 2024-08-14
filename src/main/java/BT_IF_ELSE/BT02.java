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
public class BT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double t,v,a,dtb;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("TINH DTB VA XEP LOAI HS");
        System.out.print("Nhap diem Toan: ");
        t= sc.nextDouble();
        System.out.print("Nhap diem Van: ");
        v= sc.nextDouble();
        System.out.print("Nhap diem Anh: ");
        a= sc.nextDouble();
        
        
        dtb=(a+v+t)/3;
        if (dtb<=4)
            kq="Yeu";
        else if(dtb<=6.5)
            kq="Trung binh";
        else if(dtb<=8)
            kq="Kha";
        else
            kq="Gioi";
        
        System.out.println("DTB: "+dtb+"- XL: "+kq);
        }
    }

