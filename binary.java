import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int decimalNumber = scanner.nextInt();
        
        
        String binaryNumber = convertToBinary(decimalNumber);
        
        
        System.out.println("Binary representation: " + binaryNumber);
        
        
        int numberOfBits = countBits(binaryNumber);
        System.out.println("Number of bits: " + numberOfBits);
        
        
        scanner.close();
    }


    private static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    
    private static int countBits(String binaryNumber) {
        return binaryNumber.length();
    }
}
