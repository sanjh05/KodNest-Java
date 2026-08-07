import java.util.Scanner;
public class userInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the byte value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is : " +a);

        System.out.println("Enter the Short value: ");
        short b = sc.nextShort();
        System.out.println("Short value is : " + b);


        System.out.println("Enter the int value: ");
        int c = sc.nextInt();
        System.out.println("Int value is : " + c);

        System.out.println("Enter the float value: ");
        float d = sc.nextFloat();
        System.out.println("Float value is : " + d);

        System.out.println("Enter the long value: ");
        long e = sc.nextLong();
        System.out.println("Long value is : " + e);

        System.out.println("Enter the double value: ");
        double f = sc.nextDouble();
        System.out.println("Double value is : " + f);

        System.out.println("Enter the boolean value: ");
        boolean g = sc.nextBoolean();
        System.out.println("Bolean value is : " + g);
    }
}