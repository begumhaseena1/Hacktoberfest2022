/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daffa
 */
import java.util.Scanner;

public class tugas{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.print("Pilihan:\n 1. Nasi Goreng(Rp.15.000.00)\n 2. Mie Ayam(Rp.10.000.00)\n 3. Bakso(Rp.13.000.00)\n");
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng Spesial Porsi Sedang");
                System.out.println("Harga : 19.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*19000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Goreng Spesial Porsi Besar Kumplit");
                System.out.println("Harga : 24.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*24000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}
