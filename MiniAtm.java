import java.util.Scanner;

public class MiniAtm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {

            case 1:
                System.out.println("Check Balance");
                break;

            case 2:
                System.out.println("withdraw ");
                break;

            case 3:
                System.out.println("Deposit");
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("invalid number ");

        }
    }
}
