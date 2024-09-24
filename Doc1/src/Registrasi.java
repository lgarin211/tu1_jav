import java.util.Scanner;

public class Registrasi {
    public String name;
    public String email;
    public String password;

    public int login(Registrasi reg1){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Masukan nama");
            reg1.name = scanner.nextLine();
            // nama miniml 5 huruf
            if (reg1.name.length() < 5) {
                throw new Exception("Nama minimal 5 huruf");
            }
            System.out.println("Masukan email");
            reg1.email = scanner.nextLine();

            // email harus mengandung @ dan . 
            if (!reg1.email.contains("@") || !reg1.email.contains(".")) {
                throw new Exception("Email tidak valid");
            }
            
            System.out.println("Masukan password");
            reg1.password = scanner.nextLine();
            if (reg1.password.length() < 8) {
                throw new Exception("Password minimal 8 karakter");
            }else if (!reg1.password.matches(".*[a-zA-Z].*") || !reg1.password.matches(".*[0-9].*")) {
                throw new Exception("Password harus kombinasi huruf dan angka");
            }
            System.out.println("Login berhasil, nama: " + reg1.name + " email: " + reg1.email);
        } catch (Exception e) {
            System.out.println("------------"+e.getMessage()+"------------");
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        Registrasi reg1 = new Registrasi();
        
        while (reg1.login(reg1)!=1) {
            System.out.println("Login gagal");
            System.out.println();
        }


    }
}
