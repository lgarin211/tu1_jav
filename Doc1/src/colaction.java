import java.util.ArrayList;
import java.util.Scanner;

public class colaction {

    // array name of food "appel","tomato","banana"
    public String[] food = {"appel","tomato","banana"};
    
    // randong 0-2
    public int random = (int) (Math.random() * 3);


    // hangman
    public String[] hangman = {"_","_","_","_","_","_","_","_","_","_"};
         
    public static void main(String[] args) {

        // scaner 
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dlist = new ArrayList<String>();
        ArrayList<String> clist = new ArrayList<String>();
        colaction col = new colaction();

        for (int i = 0; i < col.food[col.random].length(); i++) {
            dlist.add("(_)");
            clist.add(col.food[col.random].substring(i, i+1));
        }

        int live=clist.size()-1;

        // System.out.println("Tebak kata: ");
        int ans=0;
        while (ans!=1) {
            System.out.println("Nyawa: " + live);
            System.out.println("Tebak kata: ");
            for (int i = 0; i < dlist.size(); i++) {
                System.out.print(dlist.get(i));
            }
            System.out.println();
            System.out.println("masukan tebakanmu: ");
            String tebakan = scanner.nextLine();
            
            for (int i = 0; i < clist.size(); i++) {
                if (tebakan.equals(clist.get(i))) {
                    dlist.set(i, tebakan);
                }
            }
            
            if (!dlist.contains("(_)")) {
                System.out.println("Selamat, kamu berhasil menebak kata: " + col.food[col.random]); 
                ans=1;
                break;
            }
            
            else{
                live--;
                System.out.println("Kamu belum berhasil menebak kata");
                if (live==0) {
                    System.out.println("Kamu kalah, kata yang benar adalah: " + col.food[col.random]);
                    ans=1;
                    break;
                    
                }
            }    
        }
        


    }
}
