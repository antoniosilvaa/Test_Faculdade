package TestAulaLogica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CalculoIMCSwing extends JFrame {
    private JTextField campoPeso;
    private JTextField campoAltura;

    public CalculoIMCSwing() {
        super("Calculadora de IMC");

        // Layout
        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Componentes
        JLabel labelPeso = new JLabel("Peso (kg):");
        campoPeso = new JTextField();

        JLabel labelAltura = new JLabel("Altura (m):");
        campoAltura = new JTextField();

        JButton botaoCalcular = new JButton("Calcular IMC");

        // Ação do botão
        botaoCalcular.addActionListener((ActionEvent e) -> calcularIMC());

        // Adiciona componentes ao layout
        add(labelPeso);
        add(campoPeso);
        add(labelAltura);
        add(campoAltura);
        add(new JLabel()); // espaço vazio
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
            String mensagem;

            if (imc <= 18.5) {
                mensagem = "Abaixo do peso";
            } else if (imc <= 25) {
                mensagem = "Peso normal";
            } else if (imc <= 30) {
                mensagem = "Acima do peso";
            } else {
                mensagem = "Obeso";
            }

            JOptionPane.showMessageDialog(this,
                    String.format("Seu IMC é: %.2f\nClassificação: %s", imc, mensagem),
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite valores válidos para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculoIMCSwing::new);
    }
}

