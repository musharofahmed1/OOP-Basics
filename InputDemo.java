import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        double weight;

        System.out.println("Enter Your Name: ");
        name = input.nextLine();

        System.out.println("Enter Your Age: ");
        age = input.nextInt();

        System.out.println("Enter Your Weight: ");
        weight = input.nextDouble();
        
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Weight: "+weight);

    }
    //javac InputDemo.java && java InputDemo
}
