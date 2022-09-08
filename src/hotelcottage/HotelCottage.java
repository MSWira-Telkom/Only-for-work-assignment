/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelcottage;

import java.util.Scanner;

/**
 *
 * @author Syafiq
 */
public class HotelCottage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String bilik,hari;
        System.out.println(">---------------< Silahkan pilih bilik yang tertera");
        System.out.println("1. Duku"
                + "2. Jeruk"
                + "3. Alpukat"
                + "4. Jambu Air"
                + "5. Durian"
                + "6. Melon"
                + "7. Belimbing"
                + "8. Mangga"
                + "9. Kedondong"
                + "10. Barrack");
        
        System.out.println("Masukkan bilik yang anda pilih: ");
        bilik = input.next();
        System.out.println("Masukkan hari yang anda mau: ");
        hari = input.next();
        System.out.println("Berapa orang yang ingin menginap? :");
        int orang = input.nextInt();
        int harga = 0;
        
        if (bilik.equals ("Duku")) {
            if (hari.equals ("Weekday")) {
                harga = 915000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 1025000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 1225000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Jeruk")) {
            if (hari.equals ("Weekday")) {
                harga = 915000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 1025000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 1225000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Alpukat")) {
            if (hari.equals ("Weekday")) {
                harga = 575000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 695000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 895000;
            }
            if (orang <=1) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Jambu Air")) {
            if (hari.equals ("Weekday")) {
                harga = 575000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 695000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 895000;
            }
            if (orang <=1) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Durian")) {
            if (hari.equals ("Weekday")) {
                harga = 595000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 715000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 915000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Melon")) {
            if (hari.equals ("Weekday")) {
                harga = 595000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 715000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 915000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Belimbing")) {
            if (hari.equals ("Weekday")) {
                harga = 495000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 575000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 755000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Mangga")) {
            if (hari.equals ("Weekday")) {
                harga = 495000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 575000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 755000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Duku")) {
            if (hari.equals ("Weekday")) {
                harga = 495000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 575000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 755000;
            }
            if (orang <=2) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }if (bilik.equals ("Barrack")) {
            if (hari.equals ("Weekday")) {
                harga = 25000;
            }
            else if (hari.equals ("Weekend")) {
                harga = 25000;
            }
            else if (hari.equals ("Holiday")) {
                harga = 35000;
            }
            if (orang == 1) {
                
            }
            else {
                System.out.println("Masukkan jumlah orang yang mau nginep: ");
            }
        }
        System.out.println(" Harga = " + harga);
        System.out.println(" Selamat bersenang - senang!");
        
      
        }
    }
