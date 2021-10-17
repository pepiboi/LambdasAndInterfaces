import java.util.Scanner;

public class Main {
    private static int OPTION = -1;
    private static double xA = 0; // real Number 1
    private static double xB = 0; // real Number 2
    private static double yA = 0; // imaginary Number 1
    private static double yB = 0; // imaginary Number 2
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args){
        ComplexCalculator cc = new ComplexCalculator(
                (x, y) -> { x.setA(xA);
                            x.setB(xB);
                            y.setA(yA);
                            y.setB(yB);
                            Number b = new Number();
                            b.setA((x.getA() + x.getB()));
                            b.setB((y.getA() + y.getB()));
                            return b;},
                (x, y) -> { x.setA(xA);
                            x.setB(xB);
                            y.setA(yA);
                            y.setB(yB);
                            Number b = new Number();
                            b.setA((x.getA() - x.getB()));
                            b.setB((y.getA() - y.getB()));
                            return b;},
                (x, y) -> { x.setA(xA);
                            x.setB(xB);
                            y.setA(yA);
                            y.setB(yB);
                            Number b = new Number();
                            b.setA((x.getA() * x.getB() - y.getA() * y.getB()));
                            b.setB((x.getA() * y.getB() - y.getA() * y.getB()));
                            return b;},
                (x, y) -> { x.setA(xA);
                            x.setB(xB);
                            y.setA(yA);
                            y.setB(yB);
                            Number b = new Number();
                            b.setA((x.getA() * x.getB() + y.getA() * y.getB())/(x.getB() * x.getB() + y.getB() * y.getB()));
                            b.setB((y.getA() * x.getB() - x.getA() * y.getB())/(x.getB() * x.getB() + y.getB() * y.getB()));
                            return b;}
        );
        VektorCalculator vc = new VektorCalculator(3,3,3,3);
        RationalCalculator rc = new RationalCalculator(3,3,3,3);
        int op = 0;
        while(true){
            menue();
            switch (OPTION){
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

    private static void menue(){
            System.out.println("Choose calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - exit programm");
            try {
                OPTION = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Not a valid Number.");
                menue();
            }
            if (OPTION > 4 || OPTION < 1) {
                System.out.println("Not a valid Number.");
                menue();
            }
    }

    private static void enterNumbersVektor(){
        try {
            System.out.println("Enter number x a>");
            xA = Double.parseDouble(s.nextLine());
            System.out.println("Enter number x b>");
            xB = Double.parseDouble(s.nextLine());
            System.out.println("Enter number y a>");
            yA = Double.parseDouble(s.nextLine());
            System.out.println("Enter number y b>");
            yA = Double.parseDouble(s.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Not a valid Number.");
            enterNumbersVektor();
        }
    }

    private static void enterNumbersComplex(){
        try {
            System.out.println("Enter real number 1>");
            xA = Double.parseDouble(s.nextLine());
            System.out.println("Enter real number 2>");
            xB = Double.parseDouble(s.nextLine());
            System.out.println("Enter imaginary number 1>");
            yA = Double.parseDouble(s.nextLine());
            System.out.println("Enter imaginary number 2>");
            yA = Double.parseDouble(s.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Not a valid Number.");
            enterNumbersVektor();
        }
    }
    private static void enterNumberRational(){
        try {
            System.out.println("Enter number x a>");
            xA = Double.parseDouble(s.nextLine());
            System.out.println("Enter number x b>");
            xB = Double.parseDouble(s.nextLine());
            System.out.println("Enter number y a>");
            yA = Double.parseDouble(s.nextLine());
            System.out.println("Enter number y b>");
            yA = Double.parseDouble(s.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Not a valid Number.");
            enterNumbersVektor();
        }
    }

    private static int calcOperation(){
        int op = 0;
        System.out.println("Choose Operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - mulitply");
        System.out.println("4 - divide");
        System.out.println("5 - Enter Numbers again");
        try {
            op = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid Number.");
            calcOperation();
        }
        if (op > 5 || op < 1) {
            System.out.println("Not a valid Number.");
            calcOperation();
        }
        return op;
    }


}
