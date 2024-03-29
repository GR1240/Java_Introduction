
//Настроить проект, вывести в консоль "Hello world!"
// Вывести в консоль системные юату и время.
/**
 * HelloWorldDate 
 */

 
import java.time.LocalDateTime;
// import java.util.Calendar;
// import java.util.Scanner;
// import javax.xml.crypto.Data;
import java.util.Scanner;

/**
 * HelloWorldDate
 */
public class HelloWorldDate {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // Data
        // Calendar
        System.out.println(LocalDateTime.now());

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        int num = 45;
        double d = 5.7;
        String str1 = "Hello!";
        char c = 'f';
        boolean b = true;

        int[] array = new int[7];
        int[] array1 = { 5, 6, 8, 9, 5, 6 };

        for (int i = 0; i < array1.length; i++) {

        }

        for (int elem : array1) {
            elem = 45;
            System.out.println(elem);
        }

        while (b) {

        }

        if (true) {

        } else {

        }

    }

    public static void main1(String str) {
        System.out.println(str);
    }

    public static String main2(String str) {
        return str;
    }

    int num = 45;
    double d = 5.7;
    String str1 = "Hello!";
    char c = 'f';
    boolean b = true;

    int[] array = new int[7];
    int[] array1 = {5, 6, 8, 9, 5, 6};

    for(
    int i = 0; i<array1.length; i++);
    {

    }
}


// Scanner scanner = new Scanner(System.in);
// String str = scanner.nextLine();scanner.close();
