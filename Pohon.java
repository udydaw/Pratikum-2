/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Pohon {
      Scanner input = new Scanner(System.in);

    String nama;
    double tinggi;

    void setNama() {
        System.out.print("Nama Pohon    : ");
        nama = input.nextLine();
    }
    void setTinggi() {
        System.out.print("Tinggi Pohon  : ");
        tinggi = input.nextDouble();        
    }
    void getNama() {
        System.out.println("Nama pohon ini adalah "+nama);
    }
    void getTinggi() {
        System.out.println("Pohon ini memiliki tinggi "+tinggi+" meter");
        System.out.println("");
    }
}
