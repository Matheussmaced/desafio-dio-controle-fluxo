import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) throws Exception {

        try {
            Scanner terminal = new Scanner(System.in);

            System.out.println("Digite o primeiro numero");
            int numberOne = terminal.nextInt();

            System.out.println("Digite o segundo numero");
            int numberTwo = terminal.nextInt();

            countNumbers(numberOne, numberTwo);
        } catch (InputMismatchException e) {
            System.out.println("Deve ser um número");
        }

    }

    static void countNumbers(int number1, int number2) throws paramsInvalidException {

        if (number1 > number2) {
            System.out.println("O número 2 deve ser maior que o número 1");
        }

        int score = number2 - number1;

        for (int i = 1; i < score; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }

}
