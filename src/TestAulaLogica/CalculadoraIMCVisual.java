package TestAulaLogica;

import javax.swing.*;
import java.awt.*;

public class CalculadoraIMCVisual extends JFrame {
    private JTextField campoPeso;
    private JTextField campoAltura;

    public CalculadoraIMCVisual() {
        super("Calculadora de IMC 💪");

        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoPeso = new JTextField();
        campoAltura = new JTextField();
        JButton botaoCalcular = new JButton("Calcular IMC");

        botaoCalcular.addActionListener(e -> calcularIMC());

        add(new JLabel("Peso (kg):"));
        add(campoPeso);
        add(new JLabel("Altura (m):"));
        add(campoAltura);
        add(new JLabel());
        add(botaoCalcular);

        setVisible(true);
    }

    private void calcularIMC() {
        try {
            float peso = Float.parseFloat(campoPeso.getText());
            float altura = Float.parseFloat(campoAltura.getText());

            if (peso <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(this, "Peso e altura devem ser maiores que zero.", "Erro", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double imc = peso / (altura * altura);
            String classificacao;
            String emoji;
            Color cor;

            if (imc <= 18.5) {
                classificacao = "Abaixo do peso";
                emoji = "🥶";
                cor = Color.CYAN;
            } else if (imc <= 25) {
                classificacao = "Peso normal";
                emoji = "😎";
                cor = new Color(144, 238, 144); // verde claro
            } else if (imc <= 30) {
                classificacao = "Acima do peso";
                emoji = "🤔";
                cor = Color.ORANGE;
            } else {
                classificacao = "Obeso";
                emoji = "😰";
                cor = Color.PINK;
            }


            JPanel painel = new JPanel();
            painel.setBackground(cor);
            painel.setLayout(new BorderLayout());
            JLabel label = new JLabel(
                    String.format("<html><center>Seu IMC é: <b>%.2f</b><br>%s %s</center></html>", imc, classificacao, emoji),
                    SwingConstants.CENTER
            );
            label.setFont(new Font("Arial", Font.BOLD, 16));
            painel.add(label, BorderLayout.CENTER);

            JOptionPane.showMessageDialog(this, painel, "Resultado do IMC", JOptionPane.PLAIN_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculadoraIMCVisual::new);
    }
}

