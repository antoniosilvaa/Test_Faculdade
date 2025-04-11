package TestAulaLogica;
import javax.swing.JOptionPane;


public class AtividadeLogicaProgramação {
        public static void main(String[] args) {
            String[] frutas = {"Banana ", "Maçã", "Pera"};
            double[] precoNormal = {1.30, 1.50, 1.00};
            double[] precoDesconto = {1.15, 1.20, 0.80};
            int[] quantidades = new int[3];
            double total = 0;
            StringBuilder resumo = new StringBuilder("Resumo da Compra:\n");

            for (int i = 0; i < frutas.length; i++) {
                String entrada = JOptionPane.showInputDialog(
                        "Quantas " + frutas[i] + " você gostaria de comprar?"
                );

                // verificar se o user deixou em branco
                if (entrada == null || entrada.trim().isEmpty()) {
                    quantidades[i] = 0;
                } else {
                    try {
                        quantidades[i] = Integer.parseInt(entrada.trim());
                    } catch (NumberFormatException e) {
                        quantidades[i] = 0;
                    }
                }

                double preco = quantidades[i] >= 12 ? precoDesconto[i] : precoNormal[i];
                double valor = quantidades[i] * preco;
                total += valor;

                resumo.append(frutas[i]).append(": ")
                        .append(quantidades[i]).append(" unidades - R$ ")
                        .append(String.format("%.2f", valor)).append("\n");
            }

            resumo.append("\nTotal da compra: R$ ").append(String.format("%.2f", total));
            JOptionPane.showMessageDialog(null, resumo.toString());
        }
    }
