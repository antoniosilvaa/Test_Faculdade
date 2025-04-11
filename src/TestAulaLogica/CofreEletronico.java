package TestAulaLogica;

import javax.swing.*;

public class CofreEletronico {
    public static void main(String[] args) {
        String senha1 = JOptionPane.showInputDialog (null,"Digite a senha 1", "Insira a Senha:", JOptionPane.PLAIN_MESSAGE);
        String senha2 = JOptionPane.showInputDialog (null,"Digite a senha 2", "Insira a Senha:", JOptionPane.PLAIN_MESSAGE);
        String senhaCoringa = JOptionPane.showInputDialog(null,"Digite a senha Master", "Insira a Senha:", JOptionPane.PLAIN_MESSAGE);

        if (senha1 == null || senha2 == null || senhaCoringa == null || senha1.isEmpty() || senha2.isEmpty() || senhaCoringa.isEmpty()){
            JOptionPane.showMessageDialog(null, "INSIRA ALGUMA SENHA", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (senha1.equals("12") && senha2.equals("13")) {
            JOptionPane.showMessageDialog(null,"Voce desbloqueou o cofre", " Sucesso", JOptionPane.INFORMATION_MESSAGE);

        } else if (senhaCoringa.equals("23")) {
            JOptionPane.showMessageDialog(null, "Voce desbloqueou o cofre com a senha Master", " Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Senha invalida", "ERROR404", JOptionPane.ERROR_MESSAGE);
        }
    }
}