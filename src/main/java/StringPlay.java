import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringPlay {
    public static String capitalizeLetter(String letter){
        return letter.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = scanner.nextLine();
        System.out.println("You entered: \" "+input+"\"");
        if(StringUtils.isNumeric(input)) {
            System.out.println("\" "+input+"\" is a number");
        } else {
            System.out.println("\""+input+"\" is not a number");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}
