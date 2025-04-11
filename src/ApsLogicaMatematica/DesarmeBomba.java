package ApsLogicaMatematica;

import javax.swing.*;


public class DesarmeBomba {
    public static void main(String[] args) {

        String codigo1 = JOptionPane.showInputDialog(null, "Digite o primeiro codigo:", "DESARME A BOMBA!!!", JOptionPane.WARNING_MESSAGE);
        String codigo2 = JOptionPane.showInputDialog(null,"Digite o segundo codigo:", "DESARME A BOMBA!!!", JOptionPane.WARNING_MESSAGE);

        if (codigo1 == null || codigo2 == null || codigo1.isEmpty() || codigo2.isEmpty()){
            JOptionPane.showMessageDialog(null, "INSIRA ALGUM VALOR NUMERICO PARA DESARMAR A BOMBA!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (codigo1.equals("11") && codigo2.equals("13")){
            JOptionPane.showMessageDialog(null, "\uD83D\uDCA5 A BOMBA EXPLODIU \uD83D\uDCA5", "ALERTA!!", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"✅ Você desarmou a bomba!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
