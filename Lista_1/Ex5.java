package Lista_1;

import javax.swing.JOptionPane;

public class Ex5 {
    
    public static void main(String[] args) {

        int jogadores = 2;
        int times = 2;
        
        int qtdPeso = 0, qtdIdade = 0;
        int somaAltura = 0, somaIdade = 0;
        int idade, altura;
        double peso;

        for (int i = 0; i < times; i++) {
            for (int j = 0; j < jogadores; j++) {
                
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça a idade do Jogador " + j + " do time " + i));
                altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça a altura do Jogador " + j + " do time " + i));
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Forneça o peso do Jogador " + j + " do time " + i));

                if (idade < 18) {
                    qtdIdade++;
                }

                if (peso > 80) {
                    qtdPeso++;
                }

                somaAltura += altura;
                somaIdade += idade;

            }
        }

        // Calcular médias
        double mediaAltura = (double) somaAltura / (times * jogadores);
        double mediaIdade = (double) somaIdade / (times * jogadores);

        // Exibir resultados
        JOptionPane.showMessageDialog(null, "Quantidade de jogadores com menos de 18 anos: " + qtdIdade);
        JOptionPane.showMessageDialog(null, "Quantidade de jogadores com peso acima de 80kg: " + qtdPeso);
        JOptionPane.showMessageDialog(null, "Média de altura dos jogadores: " + mediaAltura);
        JOptionPane.showMessageDialog(null, "Média de idade dos jogadores: " + mediaIdade);

    }

}
