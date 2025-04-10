package ApsLogicaMatematica;

import java.util.Scanner;

public class DesarmeBomba {
    public static void main(String[] args) {
        int codigo1;
        int codigo2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro codigo: ");
        codigo1 = sc.nextInt();
        System.out.println("Digite o segundo codigo: ");
        codigo2 = sc.nextInt();
        if (!(codigo1 == 12) && !(codigo2 == 13) ){
            System.out.println("Voce desarmou a bomba");
        }else {
            System.out.println("A bomba explodiu");
        }
    }
}
