import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            // chamando o método contendo a lógica de contagem
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException();
            } else {
                contar(parametroUm, parametroDois);
            }
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o numero " + x);
        }

    }

}
