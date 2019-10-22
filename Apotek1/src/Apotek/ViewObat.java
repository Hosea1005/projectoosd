package Apotek;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewObat {
    int antriId;
    String antrinama;
    String antriJenis;
    int antriHarga;
    ArrayList<String> nama =  new ArrayList<>();

    ArrayList<Integer> id =  new ArrayList<>();

    ArrayList<String> jenis =  new ArrayList<>();

    ArrayList<Integer> harga = new ArrayList<>();



    public void tampil(){
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("-----Daftar Obat-----");

            System.out.println("ID: " + id.get(i) + "\nNama : " + nama.get(i) + "\nJenis : " + jenis.get(i) + "\nHarga : Rp. " + harga.get(i));
        }
    }
    public void search(int idObat){
        System.out.println(id.size());
        for (int i = 0; i < id.size(); i++) {
            System.out.println(idObat + " adalah  " + id.get(i));
//            if(idObat == id.get(i) ){
//                System.out.println("-----Daftar Obat-----");
//                System.out.println("ID: " + id.get(i) + "\nNama : " + nama.get(i) + "\nJenis : " + jenis.get(i) + "\nHarga : Rp. " + harga.get(i));
//            }
        }
    }

    public void View() {
        nama.add("Amoxilin");
        id.add(001);
        jenis.add("Pening");
        harga.add(1231);
        ViewObat v=new ViewObat();
        v.tampil();
               for(int z = 0;z<id.size();z++){
            antriId = id.get(z);
            antriHarga = harga.get(z);
            antriJenis = jenis.get(z);
            antrinama = nama.get(z);
        }
        while (true) {
            int input;
            String isi;
            int price;
            int cari;


            System.out.println("Pilihan");
            System.out.println("0. Lihat Obat");
            System.out.println("1. Tambah obat");
            System.out.println("2. Edit obat");
            System.out.println("3. Hapus obat");
            System.out.println("4. Kembali ke menu : ");
            System.out.println("5. Apakah anda ingin melakukan pemesanan");
            System.out.println("Input Pilihan Anda : ");
            Scanner scan =new Scanner(System.in);
            input = scan.nextInt();
            if(input==0){
                tampil();
            }
            else if(input == 1){
                System.out.println("Isi data di bawah ini : ");
                System.out.println("ID obat : ");
                price = scan.nextInt();
                id.add(price);
                System.out.println("Nama obat : ");
                isi = scan.next();
                nama.add(isi);
                System.out.println("Jenis obat : ");
                isi = scan.next();
                jenis.add(isi);
                System.out.println("Harga obat : ");
                price = scan.nextInt();
                harga.add(price);
            }
            else if(input == 2){
                System.out.println("Masukkan ID Obat : ");
                cari = scan.nextInt();
                for( int j=0 ; j<id.size() ; j++ ){
                    if(cari==id.get(j)){
                        System.out.println("Nama Obat");
                        isi = scan.next();
                        nama.set(j, isi);
                        System.out.println("Jenis Obat");
                        isi = scan.next();
                        jenis.set(j, isi);
                        System.out.println("Harga Obat");
                        price = scan.nextInt();
                        harga.set(j,price);
                    }
                }



            }
            else if (input ==3){
                int hapus = 0;
                System.out.println("Masukkan ID Obat : ");
                cari = scan.nextInt();
                for (int k = 0;k<id.size();k++){
                    if (cari == id.get(k)){
                        nama.remove(k);
                        id.remove(k);
                        jenis.remove(k);
                        harga.remove(k);
                    }
                }
            }
            else if (input ==4){
                Main main = new Main();

            }
            else if(input == 5){
                Pemesanan pesan = new Pemesanan();
                pesan.pesan();
            }
        }
    }


}
