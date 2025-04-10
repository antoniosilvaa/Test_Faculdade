package ApsLogicaMatematica;

import java.util.Scanner;

public class DesarmeABomba {
    public static void main(String[] args) {
        String senha1;
        String senha2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira senha: ");
        senha1 = sc.nextLine();
        System.out.println("Digite a segunda senha: ");
        senha2 = sc.next();

        if (senha1.equals("12") && senha2.equals("13") ){
            System.out.println("A bomba explodiu");
        }else {
            System.out.println("Voce desarmou a bomba");
        }
    }
}
