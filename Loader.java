import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //используется для считывания ввода с клавиатуры
        while (true) {
            System.out.println("Press any key for start. For stop enter STOP");
            String command = scanner.next();
            if (command.equals("STOP")) {
                break;
            } else {
                System.out.println("Input first figure");
                int operand1 = scanner.nextInt();
                System.out.println("Input operation sign");
                char operation = scanner.next().charAt(0);
                System.out.println("Input second figure");
                int operand2 = scanner.nextInt();
                int result = 0;
                String badInput = "Bad input";

                switch (operation) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        System.out.println(badInput);
                }
                System.out.println(result);

            }
        }
    }
}
