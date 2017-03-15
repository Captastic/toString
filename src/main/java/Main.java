/**
 * Created by anthonycapriotti on 3/15/17.
 */
public class Main {

        static Parser parser = new Parser();

        public static void main(String[] args) {
            String number = "10000";
            System.out.println(parser.selection(Integer.parseInt(number)));

        }
}

