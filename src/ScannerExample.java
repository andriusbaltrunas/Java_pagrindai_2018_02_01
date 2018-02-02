import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/1/2018.
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// objecta nuskaitymui is consoles
        ScannerExample scannerExample = new ScannerExample();// objectas musu klases
        String name = "";
        do {
            System.out.println("Iveskite savo varda");
            name = sc.nextLine();// nuskaito visa eilute ivesta
            System.out.println("Jusu vardas yra " + name);

            int length = name.length();

            int countChar = scannerExample.countChars(name);
            if (length % 2 == 0) {
                System.out.println("Ivestas zodis " + name + " yra lyginis, ilgis "
                        + length + "rasta raidziu " + countChar);
            } else {
                System.out.println("Ivestas zodis " + name + " yra nelyginis, ilgis"
                        + length + " rasta raidziu " + countChar);
            }

        } while (!name.equals("pabaiga"));


        //String name = sc.next(); // nuskaitimui iki tarpo


        String a = "Petras";
        String b = "Petras";
        if (a.equals(b)) {//tikrinam stringus tik su equals metodu
            System.out.println("LYGUS");
        } else {
            System.out.println("NE");
        }

    }

    //test commit
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
