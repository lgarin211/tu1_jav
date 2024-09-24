import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Masukkan kata: ");
            String kata = scanner.nextLine();
            String kataBalik = "";
            for (int i = kata.length()-1; i >= 0; i--) {
                kataBalik += kata.charAt(i);
            }
            if (kata.equalsIgnoreCase(kataBalik)) {
                System.out.println("Palindrom");
            } else {
                System.out.println("Bukan Palindrom");
            }
        }while(1==1);
    }
}
