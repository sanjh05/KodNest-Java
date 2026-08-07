import java.util.Scanner;
public class userInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Age is " + age);

        System.out.println("Enter your height : ");
        float height = sc.nextFloat();
        System.out.println("Height is : " + height);

        sc.nextLine();
        //yaha nextLine isliye use kiya h because agar vo use nhi karenge toh nextline pending rahegi toh uske case me vo full name consider nhi karega toh nextline ka use ho jaaye aur full name print ho jaaye toh uska use karenge
        
        System.out.println("Enter your Full Name : ");
        String fullname = sc.nextLine();
        System.out.println("Full Name is : " + fullname);


    }
}
