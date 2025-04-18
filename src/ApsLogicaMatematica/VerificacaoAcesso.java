package ApsLogicaMatematica;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VerificacaoAcesso {
    public static void main(String[] args) {
        JFrame frame = new JFrame("🕵️ MISSÃO INFILTRAÇÃO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 320);
        frame.setLayout(new BorderLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 1, 10, 5));
        painel.setBackground(Color.DARK_GRAY);
        painel.setBorder(new LineBorder(new Color(0, 204, 204), 3)); // azul ciano neon


        JCheckBox disfarce = new JCheckBox("👤 Disfarce ativado");
        JCheckBox cameras = new JCheckBox("🎥 Câmeras desativadas");
        JCheckBox permissao = new JCheckBox("📄 Permissão falsificada");

        Font fonte = new Font("Consolas", Font.BOLD, 16);
        Color cianoNeon = new Color(0, 255, 255);

        JCheckBox[] boxes = {disfarce, cameras, permissao};
        for (JCheckBox box : boxes) {
            box.setFont(fonte);
            box.setForeground(cianoNeon);
            box.setBackground(Color.DARK_GRAY);
        }


        JButton tentarBtn = new JButton("🚪 TENTAR ENTRAR NA BASE");
        tentarBtn.setFont(new Font("Arial", Font.BOLD, 16));
        tentarBtn.setBackground(new Color(0, 100, 0));
        tentarBtn.setForeground(Color.WHITE);

        JLabel resultado = new JLabel("Resultado: ", JLabel.CENTER);
        resultado.setFont(new Font("Arial", Font.BOLD, 18));
        resultado.setForeground(Color.LIGHT_GRAY);

        tentarBtn.addActionListener((ActionEvent e) -> {
            boolean D = disfarce.isSelected();
            boolean A = cameras.isSelected();
            boolean P = permissao.isSelected();

            boolean acesso = (D && A) || (P && A);

            if (acesso) {
                resultado.setText("✅ Acesso à base CONCEDIDO");
                resultado.setForeground(Color.GREEN);
            } else {
                resultado.setText("❌ Acesso NEGADO! Sirene ativada!");
                resultado.setForeground(Color.RED);
            }
        });

        painel.add(disfarce);
        painel.add(cameras);
        painel.add(permissao);
        painel.add(tentarBtn);
        painel.add(resultado);

        frame.add(painel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


