package Questao03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 17/03/2020
 * @author thais
 */
public class Q2 extends Thread {
    @Override
    public void run () {
        try {
            System.out.println("Thread q2 iniciando...");

        // Criando estruturas para leitura
        FileInputStream fis = new FileInputStream("C:\\Users\\thais\\Documents\\7_semestre\\ProgramacaoConcorrente\\Atividad01\\src\\Questao02\\arquivoDeLeitura.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        ArrayList frases = new ArrayList();

        // Preenche lista de frases
        while (linha != null) {
            frases.add(linha);
            linha = br.readLine();
        }

        // Percorre arquivo
        int i = 0;
        while (i < frases.size()) {
            System.out.println(frases.get(i));
            try {
                Thread.sleep(10000); // Dorme por 10 segundos
            } catch (InterruptedException ex) {
                System.out.println("A thread q2 foi interrompida.");
            }

            i++;
        }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao encontrar arquivo.");
        } catch (IOException ex) {
            System.out.println("Erro ao ler conteúdo do arquivo.");
        }
        
        System.out.println("Thread q2 finalizando...");
    }
}
