/**
 * Created by anthonycapriotti on 3/15/17.
 */
public class Parser {


        private final static String[] bigger = {"", " thousand ", " million ", " billion ", " trillion "};

        private final static String[] tens = {"", "ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};


        private final static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };



        protected String selection(int input){
            String results;
            if (input < 1000) {
                results = convertLessThanOneThousand(input);
            } else {
                results = convert(input);
            }
            return results;
        }

        protected String convertLessThanOneThousand(int number){
            String currentNumber;
            String prefix = "";

            if (number == 0) {return "zero";}

            if (number % 100 < 20) {
                currentNumber = units[number % 100];
                number /= 100;
            } else {
                currentNumber = units[number % 10];
                number /= 10;

                currentNumber = tens[number % 10] + currentNumber;
                number /= 10;
            }

            return units[number]  + currentNumber;
        }

        protected String convert(int number){
            String prefix = "";
            String current = "";
            int place = 0;

            if(number < 0){
                number = -number;
                prefix = "negative";
            }

            do {
                int n = number % 1000;
                if (n != 0){
                    String s = convertLessThanOneThousand(n);
                    current = s + bigger[place] + current;
                }
                place++;
                number /= 1000;
            } while (number > 0);

            return (prefix + current).trim();
        }
}

