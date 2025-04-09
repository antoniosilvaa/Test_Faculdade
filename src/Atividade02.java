import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        int banana;
        int maca;
        int pera;
        double valor;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantas bananas voce gostaria de comprar?");
        banana = teclado.nextInt();
        System.out.println("Quantas maça voce gostaria de comprar?");
        maca = teclado.nextInt();
        System.out.println("Quantas peras voce gostaria de comprar?");
        pera = teclado.nextInt();

        if (banana >= 12){
            valor = banana + 1.15;
            System.out.println("Voce comprou " + banana +" bananas" + "E o valor é: " + valor);
        }if (banana < 12) {
            valor = banana + 1.30;
            System.out.println("Voce comprou " + banana +" bananas" + "E o valor é: " + valor);
        }if (maca >= 12) {
            valor = maca + 1.20;
            System.out.println("Voce comprou " + maca +" maças" + "E o valor é: " + valor);
        }if (maca < 12) {
            valor = maca + 1.50;
            System.out.println("Voce comprou " + maca +" maças" + "E o valor é: " + valor);
        } if (pera >= 12) {
            valor = pera + 0.80;
            System.out.println("Voce comprou " + pera +" peras" + "E o valor é: " + valor);
        }else {
            valor = pera + 1;
            System.out.println("Voce comprou " + pera +" peras" + "E o valor é: " + valor);
        }
    }
}
