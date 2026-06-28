public class Switch {
    public static void main(String[] args) {
        char operator = '+';
        int a = 5, b = 10;
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Enter The validate operator");
                break;
        }
    }
}
