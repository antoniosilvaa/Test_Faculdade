package TestAulaLogica;

import javax.swing.*;

public class Atividade04 {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog(null,"Qual marca do mouse? ", "Marca", JOptionPane.PLAIN_MESSAGE);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos foram vendidos?  ", "Vendidos", JOptionPane.PLAIN_MESSAGE));
        StringBuilder resumo = new StringBuilder("Resumo da Compra:\n");
        if (quantidade >= 500){
            JOptionPane.showMessageDialog(null, "Batemos a meta de vendas desse mes", "Parabens", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Precisamos bater a meta ainda vamos!!", "Voce consegue", JOptionPane.WARNING_MESSAGE);
        }
    }
    }

