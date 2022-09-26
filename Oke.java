/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operator;
import java.util.Scanner;
/**
 *
 * @author daffa
 */
public class opertorini {
    public static Scanner input;
   public static void main(String []args){
       
       int panjang,lebar,luas;
       input = new Scanner( System.in );
       System.out.print("Masukan Nilai Panjang :");
       panjang = input.nextInt();
       System.out.print("Masukan Nilai Lebar :");
       lebar = input.nextInt();
       luas = panjang * lebar;
       
       System.out.println("Luas Persegi Panjang : " + luas);
   }
}
