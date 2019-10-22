package Apotek;

import java.util.ArrayList;
import java.util.Scanner;

public class Pemesanan extends  ViewObat{
    ArrayList<String> nama =  new ArrayList<>();
    ArrayList<Integer> antri =  new ArrayList<>();


    public void pesan(){
        ViewObat v=new ViewObat();
        Scanner scan = new Scanner(System.in);
        int antriPemesanan;
        String namaPemesanan;
        int a;
        int b;
        int idO;
        System.out.println("-------Pemesanan--------\n");
        System.out.println("Masukkan nomor antrian : ");
        antriPemesanan = scan.nextInt();
        antri.add(antriPemesanan);
        System.out.println("Masukkan nama pembeli : ");
        namaPemesanan = scan.next();
        nama.add(namaPemesanan);
        System.out.println("Masukkan ID Obat saya : ");
        idO = scan.nextInt();
        v.search(idO);

    }
}
