package JogoAdivinhacao;

import java.util.Scanner;
import java.util.Random;

public class adivinheONumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        boolean jogarDenovo = true;

        while (jogarDenovo) {
            int randomNumber = ran.nextInt(100) + 1;
            int tentativas = 0;
            boolean acertou = false;

            System.out.println("Jogo de Adivinhação do número! ");

            while (tentativas < 10 && !acertou) {
                System.out.println("Chute um número de 1 a 100: ");
                int chute = scan.nextInt(); 

                tentativas++;
                System.out.println("Tentativas (max 10): " + tentativas);

                if (chute < randomNumber) {
                    System.out.println("Dica: o número é maior!");
                } else if (chute > randomNumber) {
                    System.out.println("Dica: o número é menor!");
                } else {
                    System.out.println("Parabéns, você acertou o número!");
                    acertou = true; 
                }
            }

            if (!acertou) {
                System.out.println("Você perdeu o jogo :( O número era: " + randomNumber);
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            String sn = scan.next();
            jogarDenovo = sn.equalsIgnoreCase("s");

            if (!jogarDenovo) {
                System.out.println("Obrigado por jogar!");
            }
        }

        scan.close(); 
    }
}
