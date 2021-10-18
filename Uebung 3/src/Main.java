import java.util.Scanner;

public class Main {
    private static int OPTION = -1;
    private static int OPERATION = -1;
    private static Number b = new Number();
    private static Number x = new Number();
    private static Number y = new Number();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ComplexCalculator cc = new ComplexCalculator(
                (x, y) -> {
                    return assignNumbers(x, y, 1);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 2);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 3);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 4);
                }
        );
        VektorCalculator vc = new VektorCalculator(
                (x, y) -> {
                    return assignNumbers(x, y, 1);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 2);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 3);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 4);
                }
        );
        RationalCalculator rc = new RationalCalculator(
                (x, y) -> {
                    return assignNumbers(x, y, 1);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 2);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 3);
                },
                (x, y) -> {
                    return assignNumbers(x, y, 4);
                }
        );
        while (true) {
            menue();
            switch (OPTION) {
                case 1:
                    enterNumbers();
                    calcOperation();
                    b = check(rc);
                    break;
                case 2:
                    enterNumbers();
                    calcOperation();
                    b = check(vc);
                    break;
                case 3:
                    enterNumbers();
                    calcOperation();
                    b = check(cc);
                    break;
                default:
                    System.exit(0);
            }
            System.out.println("----------------");
            System.out.println("Solution:");
            System.out.printf("a = %s\nb = %s\n",b.getA(),b.getB());
            System.out.println("----------------");
        }
    }

    private static void menue() {
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

    private static void enterNumbers() {
        try {
            System.out.println("Enter number x a>");
            x.setA(Double.parseDouble(s.nextLine()));
            System.out.println("Enter number x b>");
            x.setB(Double.parseDouble(s.nextLine()));
            System.out.println("Enter number y a>");
            y.setA(Double.parseDouble(s.nextLine()));
            System.out.println("Enter number y b>");
            y.setB(Double.parseDouble(s.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Not a valid Number.");
            enterNumbers();
        }
    }

    private static void calcOperation() {
        System.out.println("Choose Operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - mulitply");
        System.out.println("4 - divide");
        System.out.println("5 - Enter Numbers again");
        try {
            OPERATION = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a valid Number.");
            calcOperation();
        }
        if (OPERATION > 5 || OPERATION < 1) {
            System.out.println("Not a valid Number.");
            calcOperation();
        }
    }

    private static Number assignNumbers(Number x, Number y, int operator) {
        switch (operator) {
            case 1:
                b.setA((x.getA() + x.getB()));
                b.setB((y.getA() + y.getB()));
                break;
            case 2:
                b.setA((x.getA() - x.getB()));
                b.setB((y.getA() - y.getB()));
                break;
            case 3:
                b.setA((x.getA() * x.getB() - y.getA() * y.getB()));
                b.setB((x.getA() * y.getB() - y.getA() * y.getB()));
                break;
            default:
                b.setA((x.getA() * x.getB() + y.getA() * y.getB()) / (x.getB() * x.getB() + y.getB() * y.getB()));
                b.setB((y.getA() * x.getB() - x.getA() * y.getB()) / (x.getB() * x.getB() + y.getB() * y.getB()));
        }
        return b;
    }

    private static Number check(AbstractCalculator a) {
        switch (OPERATION) {
            case 1:
                return a.add(x, y);
            case 2:
                return a.subtract(x, y);
            case 3:
                return a.multiply(x, y);
            default:
                return a.divide(x, y);
        }
    }

}
