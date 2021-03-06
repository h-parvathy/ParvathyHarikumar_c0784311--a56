package parvathy;
import java.io.FileNotFoundException;
import java.util.Date;

public class Sample
{
    public static void main(String[] args) throws FileNotFoundException {
        Quote q = new Quote();
        q.validateCredentials();
        //username parvathy
        //password paaru339
        q.inputName();
        q.inputChoice();
        q.printServiceCost();
        q.printItemCost();
        q.printOptionCost();
        q.printTotalCost();
    }
}
