package main;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número a sua altura em metros (ex: 1,70): \n");
        double sa = sc.nextDouble();
        double atarwa = 0.9;
        if (sa > atarwa) {
            System.out.println("voce e maior que o grandioso aventureiro Bilbo Bolseiro");
            double enwina = sa - atarwa;
            System.out.println("Se um mago te deixasse ");
            System.out.println(enwina);
            System.out.println("metros maior, você teria a mesma altura de Bilbo.\n");
        } else {
            System.out.println("voce e menor que o grandioso aventureiro Bilbo Bolseiro");
            System.out.println("voce e menor que o grandioso aventureiro Bilbo Bolseiro");
            double enwina = sa + atarwa;
            System.out.println("Se um mago te deixasse ");
            System.out.println(enwina);
            System.out.println("metros menor, voce teria a mesma altura de Bilbo.\n");
        }
        int urkhais = 10;
        System.out.print("Voce esta caminhando na floresta e um grupo de meio-orcs aparecem, quantos vc imagina que sao?: ");
        int intya = sc.nextInt();
        if (intya == urkhais) {
            System.out.println("\nAcertou!!");
        }
        if (intya != urkhais) {
            System.out.println("\nErrou!!");
        }
        System.out.println("Que começe a batalha!!!");
        while (urkhais > 0) {
            System.out.println("Meio-orc morto! ");
            urkhais = urkhais - 1;
        }
        System.out.println("Voce derrotou todos!!\n");
        System.out.println("Voce entao vai procurar moedas nos corpos dos inimogos derrotados.\n");
        int harma = 5;
        do {
            System.out.println("Voce encontrou uma moeda");
            harma = harma - 1;
        } while(harma > 0);
    }
}
