import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
        public static void main(String[] args){
            List<String> list = new ArrayList<String>();

            list.add("eins");
            list.add("zwei");
            list.add("drei");

            for(String s : list){
                System.out.println(s);
            }
            System.out.println("---------------");

            list.forEach((n) -> System.out.println(n));
        }
}
