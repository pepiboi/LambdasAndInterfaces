import java.io.*;

public class NumberTester {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    private File file;

    public NumberTester(String fileName) {
        file = new File(fileName);
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public boolean working() {
        if (file.exists()) {
            return file.canRead();
        } else {
            return false;
        }
    }

    public void setFile(String fileName) {
        file = new File(fileName);
    }

    public void testFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));
        int[] numbersTested = null;
        String str = br.readLine();
        String[] splitted = null;
        int place = 0;
        boolean running = true;

        try {
            int amount = Integer.parseInt(str);
            numbersTested = new int[amount * 2];

            while ((str = br.readLine()) != null) {
                try {
                    if (str.contains(" ")) {
                        splitted = str.split(" ");
                        switch (Integer.parseInt(splitted[0])) {
                            case 1:
                                if (oddTester.testNumber(Integer.parseInt(splitted[1]))) {
                                    System.out.println("EVEN");
                                } else {
                                    System.out.println("ODD");
                                }
                                running = true;
                                break;
                            case 2:
                                if (primeTester.testNumber(Integer.parseInt(splitted[1]))) {
                                    System.out.println("PRIME");
                                } else {
                                    System.out.println("NOT PRIME");
                                }
                                running = true;
                                break;
                            case 3:
                                if (palindromeTester.testNumber(Integer.parseInt(splitted[1]))) {
                                    System.out.println("PALINDROME");
                                }else{
                                    System.out.println("NOT PALINDROME");
                                }
                                running = true;
                                break;
                            default:
                                if (running) {
                                    System.out.println("WRONG FORMAT");
                                }
                                running = false;
                        }
                    } else {
                        System.out.println("WRONG FORMAT");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("WRONG FORMAT");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("WRONG FORMAT");
        }

    }

}
