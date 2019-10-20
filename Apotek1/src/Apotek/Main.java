package Apotek;

import javax.swing.text.View;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int pilih;
        System.out.println("---SELAMAT DATANG---");
        System.out.println("--APOTEK MAMMAN 18--");
        Login login = new Login();
        login.login();

        System.out.println("Selamat datang ");

        System.out.println("1. Data Obat");
        System.out.println("2. Pemesanan");
        System.out.println("3. Pembayaran");
        System.out.println("4. Data Pembeli");
        System.out.println("5. Exit");

        Scanner scan = new Scanner(System.in);
        pilih = scan.nextInt();
        if(pilih == 1){
            ViewObat tampil = new ViewObat();
            tampil.View();
        }
        else if(pilih == 2){
            Pemesanan p=new Pemesanan();
            p.pesan();
        }
        else if(pilih == 3){

        }
        else if(pilih == 4){

        }
        else if(pilih == 5){
            System.out.println("Terima kasih Telah menggunakan Sistem ini");

        }
        else{
            System.out.println("Maaf pilihan anda tidak ditemukan");
            System.exit(0);
        }

    }
}
