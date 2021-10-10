import java.io.*;

public class NumberTester {

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    private File file;

    public NumberTester(String fileName){
        file = new File(fileName);
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public boolean working(){
        if(file.exists()){
            return file.canRead();
        }else{
            return false;
        }
    }

    public void setFile(String fileName){
        file = new File(fileName);
    }

    public void testFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str = br.readLine();
        while((str = br.readLine()) != null){

        }
    }
}
