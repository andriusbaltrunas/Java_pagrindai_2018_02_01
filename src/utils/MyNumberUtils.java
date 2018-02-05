package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 2/5/2018.
 */
public class MyNumberUtils {
    public static int getCorrectNumber(Scanner sc) {
        int numb = 0;
        while (true) {
            System.out.println("Iveskite skaicius");
            try {
                numb = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Juk sakiau kad ivesk skaiciu!!!!");
                sc.nextLine();
            }
        }

        return numb;
    }

    public static double getCorrectDouble(Scanner sc) {
        double numb = 0.0;
        while (true) {
            System.out.println("Iveskite skaiciu");
            try {
                numb = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas skaicus");
                sc.nextLine();
            }
        }
        return numb;
    }

    public static double getCorrectDouble(Scanner sc, String numb) {
        double n = 0;
        try {
            n = Double.valueOf(numb);
        } catch (NumberFormatException e) {
            System.out.println("Blogai ivestas skaicius pakatokite");
            n = getCorrectDouble(sc);
        }
        return n;
    }
}
