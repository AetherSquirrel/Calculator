import java.util.Scanner;

// Тест для компилятора формул.
public class CompfTest {
    public static void main(String[] args) throws Exception {
        //Compf c = new Compf();
        Calc c = new Calc();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Formula input -> ");
            String str = in.next();
            char[] chars = str.toCharArray();
            c.compile(chars);
        }
    }
}
