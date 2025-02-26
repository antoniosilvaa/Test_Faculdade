//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte num1 = 10;
        int operadores = 6;
        byte num2 = 20;
        switch (operadores){
            case 1:
                System.out.println("Resultado: "+ (num1 + num2));
                break;
            case 2:
                System.out.println("resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Resultado: " + (num1 / num2));
                break;
            default:
                System.out.println("Opção invalida tente novamnete" + ", A calculadora so tem somente 4 operadores, tente de 1 a 4");
                break;
        }
        }
    }
