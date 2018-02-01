import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/1/2018.
 */
public class ScannerExample {

    public static void main(String[] args) {

        System.out.println("Iveskite savo varda");

        Scanner sc = new Scanner(System.in);// objecta nuskaitymui is consoles

        String name = sc.nextLine();// nuskaito visa eilute ivesta
        //String name = sc.next(); // nuskaitimui iki tarpo

        System.out.println("Jusu vardas yra " + name);

        String a = "Petras";
        String b = "Petras";
        if (a.equals(b)) {//tikrinam stringus tik su equals metodu
            System.out.println("LYGUS");
        } else {
            System.out.println("NE");
        }
        int length = name.length();

        ScannerExample scannerExample = new ScannerExample();// objectas musu klases
        int countChar = scannerExample.countChars(name);
        if (length % 2 == 0) {
            System.out.println("Ivestas zodis " + name + " yra lyginis, ilgis "
                    + length + "rasta raidziu " + countChar);
        } else {
            System.out.println("Ivestas zodis " + name + " yra nelyginis, ilgis"
                    + length + " rasta raidziu " + countChar);
        }
    }

    private int countChars(String name) {
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;
            }
        }
        return numb;
    }
}
