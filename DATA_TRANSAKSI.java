package ProgramEca;

import java.util.Scanner;

public class DATA_TRANSAKSI {

    public static void main(String[] args) {
        
     String NamaBarang;
        String JumlahTransaksi;
        
        Scanner input = new Scanner(System.in);
        System.out.println("==Daftar Barang==");
        System.out.println("Nama Barang : ");
        
        NamaBarang = input.next();
        
        System.out.println("Jumlah Transaksi : ");
        
        
        JumlahTransaksi = input.next();
        
        System.out.println("================");
        System.out.println("Nama Barang : " + NamaBarang);
        System.out.println("Jumlah Transaksi : " + JumlahTransaksi);   
    }
    
}
