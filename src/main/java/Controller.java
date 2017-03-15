/**
 * Created by anthonycapriotti on 3/15/17.
 */

public class Controller {
    IO io = new IO();
    Parser parser = new Parser();

    public void run(){
        io.output(parser.selection(io.input()));
    }
}