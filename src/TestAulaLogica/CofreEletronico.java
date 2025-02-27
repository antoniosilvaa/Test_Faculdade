package TestAulaLogica;

public class CofreEletronico {
    public static void main(String[] args) {
        int senha1 = 10;
        int senha2 = 35;
        int senhaCoringa = 40;

        if (senha1 == 20 && senha2 == 30) {
            System.out.println("acesso concedido");

        } else if (senhaCoringa == 78) {
            System.out.println("Acesso permitido pela senha Coringa");
        } else {
            System.out.println("Acesso negado");
        }
    }
}