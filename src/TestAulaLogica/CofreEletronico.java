package TestAulaLogica;

import javax.swing.*;

public class CofreEletronico {
    public static void main(String[] args) {
        String senha1 = JOptionPane.showInputDialog ("Digite a senha 1");
        String senha2 = JOptionPane.showInputDialog ("Digite a senha 2");
        String senhaCoringa = JOptionPane.showInputDialog("Digite a senha Master");

        if (senha1 != null && senha2 != null && senha1.equals("12") && senha2.equals("13")) {
            JOptionPane.showMessageDialog(null,"Voce desbloqueou o cofre", " Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } else if (senhaCoringa != null && senhaCoringa.equals("23")) {
            JOptionPane.showMessageDialog(null, "Voce desbloqueou o cofre com a senha Master", " Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Senha invalida", "ERROR404", JOptionPane.ERROR_MESSAGE);
        }
    }
}