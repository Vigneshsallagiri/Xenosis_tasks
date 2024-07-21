import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Convert decimal to hexadecimal manually
        String hexadecimal = decimalToHexadecimal(decimal);

        System.out.println("The hexadecimal equivalent is: " + hexadecimal);
    }

    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, hexChars[remainder]);
            decimal = decimal / 16;
        }

        return hex.toString();
    }
}

