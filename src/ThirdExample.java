import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/2/2018.
 */
public class ThirdExample {

    public static void main(String[] args) {
        System.out.println("Pasirinkite punkta\n1. Trikimpis\n2. Staciakampis\n3. Kvadratas\n4. Apskritimas");
        Scanner sc = new Scanner(System.in);
        int action = getCorrectNumber(sc);

        switch (action){
            case 1:
                System.out.println("Iveskite krasteine a");
                int petras = getCorrectNumber(sc);
                System.out.println("Iveskite krasteine b");
                int antanas = getCorrectNumber(sc);
                double result = trikampis(petras, antanas);
                System.out.println("Trikampio plotas yra " + result);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Nera tokio veiksmo");
        }

    }

    private static double trikampis(int a, int b){
        return (a*b)/2;
    }

    private static int getCorrectNumber(Scanner sc){
        int numb = 0;
        while (true){
            System.out.println("Iveskite skaicius");
            try {
                numb = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Juk sakiau kad ivesk skaiciu!!!!");
                sc.nextLine();
            }
        }

        return numb;
    }
}
