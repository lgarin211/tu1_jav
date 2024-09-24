import java.util.Scanner;
public class Zodiak {
    // Tikus, Kerbau, Macan, Kelinci, Naga, Ular, Kuda, Kambing, Monyet, Ayam, Anjing, Babi    
    public static String[] zodiak = {"Kuda", "Kambing", "Monyet", "Ayam", "Anjing", "Babi","Tikus", "Kerbau", "Macan", "Kelinci", "Naga", "Ular"};
    int totalcio = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Masukkan tahun lahir: ");
            int tahun = scanner.nextInt();
            int cio = (tahun-1900) % 12;
            System.out.println(cio);
            System.out.println("Zodiak anda adalah: " + zodiak[cio]);
        }while(1==1);
    }


}
