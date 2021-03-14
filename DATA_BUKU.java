package ProgramEca;

import java.util.Scanner;

public class DATA_BUKU {

    public static void main(String[] args) {

        String NamaBuku;
        String KodeBuku;
        
        Scanner input = new Scanner(System.in);
        System.out.println("==Daftar Buku==");
        System.out.println("Nama Buku : ");
        
        NamaBuku = input.next();
        
        System.out.println("Kode Buku : ");
        
        
        KodeBuku = input.next();
        
        System.out.println("================");
        System.out.println("Nama Buku : " + NamaBuku);
        System.out.println("Kode Buku : " + KodeBuku);
    }
    
}
