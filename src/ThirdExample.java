import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/2/2018.
 */
public class ThirdExample {

    public static void main(String[] args) {
        System.out.println("Pasirinkite punkta\n1. Trikimpis\n2. Staciakampis\n3. Kvadratas\n4. Apskritimas");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        switch (action){
            case 1:
                System.out.println("Iveskite krasteine a");
                int petras = sc.nextInt();
                System.out.println("Iveskite krasteine b");
                int antanas = sc.nextInt();
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
}
