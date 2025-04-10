import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        int banana, maca, pera;
        double Valormaca, Valorbanana, Valorpera;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas bananas voce gostaria de comprar? ");
        banana = sc.nextInt();
        System.out.println("Quantas maças voce gostaria de comprar? ");
        maca = sc.nextInt();
        System.out.println("Quantas peras voce gostaria de comprar? ");
        pera = sc.nextInt();

        if (banana >= 12){
            Valorbanana = banana * 1.15;
            System.out.println("Voce comprou: " + banana + " e o valor é: " + Valorbanana);
        }else {
            Valorbanana = banana * 1.30;
            System.out.println("Voce comprou: " + banana + " e o valor é: " + Valorbanana);
        }
        if (maca >= 12){
            Valormaca = maca * 1.20;
            System.out.println("Voce comprou: " + maca + " e o valor é: " + Valormaca);
        }else {
            Valormaca = maca * 1.50;
            System.out.println("Voce comprou: " + maca + " e o valor é: " + Valormaca);
        }
        if (pera >= 12){
            Valorpera = pera * 0.80;
            System.out.println("Voce comprou: " + pera + " e o valor é: " + Valorpera);
        }else {
            Valorpera = pera * 1.00;
            System.out.println("Voce comprou: " + pera + " e o valor é: " + Valorpera);
        }

    }
}
