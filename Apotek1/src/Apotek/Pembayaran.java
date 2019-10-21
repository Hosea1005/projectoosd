package Apotek;

import java.util.Scanner;

public class Pembayaran extends Pemesanan{
    public void bayar(){
        int cari;
        Scanner scan = new Scanner(System.in);
        Pemesanan pesan = new Pemesanan();
        System.out.println("Pembayaran");
        System.out.println("Masukkan nomor antrian : ");
        cari = scan.nextInt();
        System.out.println(pesan.antri.isEmpty());
        for (int i = 0; i < pesan.antri.size(); i++) {
            if(cari ==  pesan.antri.get(i)){
                System.out.println("-----Pesanan Anda-----");
                System.out.println("Nama : "+pesan.nama.get(i)+"\nNomor antrian : "+pesan.antri.get(i)+"\nID: " + pesan.id.get(i) + "\nNama : " + pesan.nama.get(i) + "\nJenis : " + pesan.jenis.get(i) + "\nHarga : Rp. " + pesan.harga.get(i));
            }
            else {
                System.out.println("Nama : "+pesan.nama.get(i)+"\nNomor antrian : "+pesan.antri.get(i)+"\nID: " + pesan.id.get(i) + "\nNama : " + pesan.nama.get(i) + "\nJenis : " + pesan.jenis.get(i) + "\nHarga : Rp. " + pesan.harga.get(i));
            }
    }
}
}
