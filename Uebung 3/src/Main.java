import java.util.Scanner;

public class Main {
    private static int OPTION = 1;
    private static int xA = 0;
    private static int xB = 0;
    private static int yA = 0;
    private static int yB = 0;
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        ComplexCalculator cc = new ComplexCalculator(2,3,3,3);
        VektorCalculator vc = new VektorCalculator(3,3,3,3);
        RationalCalculator rc = new RationalCalculator(3,3,3,3);
        while(OPTION != 4){
            switch (menue()){
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.exit(0);
            }
        }
    }

    private static int menue(){
        while(true) {
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - exit programm");
            try {
                OPTION = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dies ist keine Gültige Eingabe.");
            }
            if (OPTION > 4 || OPTION < 1) {
                System.out.println("Dies ist keine Gültige Eingabe.");
            }
            break;
        }
        return OPTION;
    }

    private static void enterNumbers(){
        try {
            System.out.println("Enter number x a>");
            xA = Integer.parseInt(s.nextLine());
            System.out.println("Enter number x b>");
            xB = Integer.parseInt(s.nextLine());
            System.out.println("Enter number y a>");
            yA = Integer.parseInt(s.nextLine());
            System.out.println("Enter number y b>");
            yA = Integer.parseInt(s.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Geben Sie gültige Zahlen ein.");
            enterNumbers();
        }
    }
}
