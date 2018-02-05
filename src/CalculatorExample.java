import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import utils.MyNumberUtils;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/5/2018.
 */
public class CalculatorExample {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 2 skaicius ir veiksma tarp ju pvz: '10 + 10'");
        String line = scanner.nextLine();
        //10_+_10
        String[] items = line.split(" ");
        if(items.length == 3){
            menu(items, scanner);
        }else{
            System.out.println("Blogai ivestas formatas");
        }
    }

    private static void menu(String[] items, Scanner sc){
        double numb = MyNumberUtils.getCorrectDouble(sc, items[0]);
        double numb1 = MyNumberUtils.getCorrectDouble(sc, items[2]);
        switch (items[1]){
            case "+":
                sum(numb, numb1);
                break;
            case "-":
                break;
            case "*":
                break;
            case "^":
                break;
            default:
                System.out.println("Nera tokio veiksmo");
        }
    }

    private static void sum(double numb, double numb1){
        double mySum = numb + numb1;
        System.out.println("Suma yra " + mySum);
    }
}
