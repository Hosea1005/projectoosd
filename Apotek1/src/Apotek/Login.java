package Apotek;

import java.util.Scanner;

public class Login {
    String username;
    String password;
    public  void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");
        username = scan.nextLine();
        System.out.println("Password: ");
        password = scan.nextLine();

        if("admin".equals(username) && "admin".equals(password)){
            System.out.println("SIApotik FirstAtTeam");
        }else{
            System.out.println("Gagal Login, coba lagi");
            login();
        }
    }
}
