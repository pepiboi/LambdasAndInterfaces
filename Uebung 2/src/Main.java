import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Willkommen zum Filetester! Geben Sie den Pfad zu Ihrer gewünschten Datei an.");
        NumberTester nt = new NumberTester(s.nextLine());
        while(!nt.working()){
            System.out.println("Geben Sie einen Gültigen Pfad ein oder stellen Sie sicher, dass die Datei ist eine .txt Datei ist.");
            nt.setFile(s.nextLine());
        }
        nt.setOddEvenTester( (int n) -> (n % 2) == 0);
        nt.setPalindromeTester((int n) -> {
            String str = Integer.toString(n);
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                ++i;
                --j;
            }
            return true;
        });
        nt.setPrimeTester((int n) -> {
            if (n <= 1) return false;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        });
        try{
        nt.testFile(); }
        catch(Exception e){
            System.out.println("Dumm gelaufen.");
        }
    }
}
