package TestAulaLogica;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        float altura;
        int peso;
        double imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();

        imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println("abaixo do peso: " + imc);

        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("Peso normal: " + imc);

        } else if (imc >= 25 && imc <= 30) {
            System.out.println("Acima do peso: " + imc);

        }else {
            System.out.println("Obeso: " + imc);
        }
    }
}
