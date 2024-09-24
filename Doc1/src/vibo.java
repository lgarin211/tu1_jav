import java.util.Scanner;

public class vibo {
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // membuat vibonaci paskl dengan inputan 4
        //    1
        //   1 1
        //  1 2 1
        // 1 3 3 1

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan besaaran: ");
        int besaaran = scanner.nextInt();
        int besaaran2 = besaaran;
        for (int i = 0; i < besaaran; i++) {
            for (int j = 0; j < besaaran2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(faktorial(i) / (faktorial(j) * faktorial(i - j))%10 + "  ");
            }
            System.out.println();
            besaaran2--;
        }
    }
}
