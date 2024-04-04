import java.util.Scanner;

public class reverseString {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

    public static void main(String[] args) {
        String originalStr = userInput;
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
    System.out.println("Reversed string: "+ reversedStr);
    }
}
