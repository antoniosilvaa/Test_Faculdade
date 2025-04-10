package ApsLogicaMatematica;

import javax.swing.*;


public class DesarmeBomba {
    public static void main(String[] args) {
        String codigo1 = JOptionPane.showInputDialog("Digite o primeiro codigo:");
        String codigo2 = JOptionPane.showInputDialog("Digite o segundo codigo:");

        if (codigo1 != null && codigo2 != null && codigo1.equals("12") && codigo2.equals("13")){
            JOptionPane.showMessageDialog(null, "\uD83D\uDCA5 A BOMBA EXPLODIU \uD83D\uDCA5", "ALERTA!!", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"✅ Você desarmou a bomba!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
