import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double hasil = 0;
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid!");
                    return;
            }
            System.out.println("Hasil: " + hasil);
        }while(1==1);


    }
}
