package ApsLogicaDeProgramação;


import javax.swing.*;

public class ApsLogicaDeProgrmacao {
    public static void main(String[] args) {
        int opcao;
        boolean continuar = true;
        while (continuar) {
            String menu = """
                    === Igualdade de Gênero e Luta das Mulheres na Sociedade ===
                    1 - feminismo
                    2 - igualdade de genero
                    3 - luta das mulheres no dia a dia
                    0 - Encerrar Programa
                    """;

            String inputOpcao = JOptionPane.showInputDialog(menu);

            if (inputOpcao == null) {
                continuar = false;
                break;
            }

            try {
                opcao = Integer.parseInt(inputOpcao);

                if (opcao >= 1 && opcao <= 3) {
                    JOptionPane.showMessageDialog(null, "Agora iremos ver um pouco sobre a opção que voce escolheu", "MULHERES MAIS FORTE", JOptionPane.INFORMATION_MESSAGE);

                    switch (opcao) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Feminismo é um movimento social por direitos civis, protagonizado por mulheres, que desde sua origem reivindica a igualdade política,\n jurídica e social entre homens e mulheres. Sua atuação não é sexista, isto é, não busca impor algum tipo de superioridade feminina, mas a igualdade entre os sexos.", "Feminismo", JOptionPane.INFORMATION_MESSAGE);
                            quiz(1);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Igualdade de gênero é o princípio de que todas as pessoas, independentemente do sexo, devem ter os mesmos direitos,\n oportunidades e tratamento. É um direito humano e uma questão de justiça social\n", "Igualdade de Genero", JOptionPane.INFORMATION_MESSAGE);
                            quiz(2);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "A luta das mulheres no dia a dia é uma batalha contínua por igualdade, direitos e justiça em diversas áreas da vida. Essa luta abrange questões como violência de gênero,\n desigualdade salarial, falta de representatividade política,\n preconceito e estereótipos que limitam a autonomia e o desenvolvimento das mulheres.\n", "luta das mulheres no dia a dia", JOptionPane.INFORMATION_MESSAGE);
                            quiz(3);
                            break;

                    }

                } else if (opcao == 0) {
                    JOptionPane.showMessageDialog(null, "Encerrando programa...");
                    continuar = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção invalida tente novamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.", "ERROR", JOptionPane.ERROR_MESSAGE);
                opcao = -1;
            }
        }
    }


    public static void quiz(int opcao) {
        String pergunta = "";
        String[] opcoes = {};
        int respostaCorreta = 0;

        switch (opcao) {
            case 1:
                pergunta = "O que o feminismo busca?";
                opcoes = new String[]{
                        "A) Superioridade das mulheres",
                        "B) Igualdade entre os sexos",
                        "C) Dominação feminina",
                        "D) Nenhuma resposta está correta!"
                };
                respostaCorreta = 1;
                break;
            case 2:
                pergunta = "Igualdade de gênero significa:";
                opcoes = new String[]{
                        "A) Mulheres são melhores que homens",
                        "B) Apenas os homens têm direitos iguais",
                        "C) Todos têm os mesmos direitos e oportunidades",
                        "D) Todas estão corretas!"
                };
                respostaCorreta = 2;
                break;
            case 3:
                pergunta = "Qual das opções faz parte da luta diária das mulheres?";
                opcoes = new String[]{
                        "A) Aumento de salários apenas para homens",
                        "B) Combate à violência de gênero",
                        "C) Redução da representatividade feminina",
                        "D) Redução dos salarios para todos"
                };
                respostaCorreta = 1;
                break;
        }

        int resposta = JOptionPane.showOptionDialog(null, pergunta, "Quiz",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (resposta == respostaCorreta) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou! 💪", "Resultado do Quiz", JOptionPane.INFORMATION_MESSAGE);
        } else if (resposta != -1) {
            JOptionPane.showMessageDialog(null, "Você errou. Mas continue aprendendo! 💡", "Resultado do Quiz", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
