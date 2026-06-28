import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First subject marks ");
        int marks1 = input.nextInt();
        System.out.println("Enter the second subject marks ");
        int marks2 = input.nextInt();
        System.out.println("Enter the Third subject marks ");
        int marks3 = input.nextInt();
        System.out.println("Enter the Fourth subject marks ");
        int marks4 = input.nextInt();
        System.out.println("Enter the Five subject marks ");
        int marks5 = input.nextInt();

        int percentage = (marks1 + marks2 + marks3 + marks4 + marks5) / 5;
        System.out.println(percentage);
    }

}
