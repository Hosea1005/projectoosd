package Apotek;

import java.util.ArrayList;
import java.util.Scanner;

public class Pemesanan extends  ViewObat{
    ArrayList<String> nama =  new ArrayList<>();
    ArrayList<Integer> antri =  new ArrayList<>();

    int antriPemesanan;
    String namaPemesanan;
    int a;
    int b;
    int idO;

    public void pesan(){
        ViewObat v=new ViewObat();
        v.tampil();
        Scanner scan = new Scanner(System.in);

        System.out.println("-------Pemesanan--------\n");
        System.out.println("Masukkan nomor antrian : ");
        antriPemesanan = scan.nextInt();
        antri.add(antriPemesanan);
        System.out.println("Masukkan nama pembeli : ");
        namaPemesanan = scan.next();
        nama.add(namaPemesanan);
        System.out.println("Masukkan ID Obat : ");
        idO = scan.nextInt();

        System.out.println(v.id.size());
        for (int i = 0; i < v.id.size(); i++) {
            if(idO ==  v.id.get(i)){
                System.out.println("-----Daftar Obat-----");
                System.out.println("Nama : "+nama.get(i)+"\nNomor antrian : "+antri.get(i)+"\nID: " + v.id.get(i) + "\nNama : " + v.nama.get(i) + "\nJenis : " + v.jenis.get(i) + "\nHarga : Rp. " + v.harga.get(i));
            }
            System.out.println("Apakah anda ingin melakukan pembayaran ?");
            System.out.println("1. Ya\n 2. Tidak");
            a =  scan.nextInt();
            if(a == 1){
                Pembayaran bayar = new Pembayaran();
                bayar.bayar();
            }

        }
    }
}
