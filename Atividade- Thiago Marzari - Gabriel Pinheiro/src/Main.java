import java.util.ArrayList;
import java.util.List;

/*
=====================================================
    Autoria do Código
    Disciplina: Sistemas Distribuidos
    Autores: Thiago Marzari & Gabriel Pinheiro
=====================================================
*/

public class Main {
    public static void main(String[] args) {
        List<List> listaDeListas = new ArrayList<>();
        int totalListas = 5; // m listas
        int tamanhoLista = 1000; // n números por lista

        // inicializa as listas
        for (int i = 0; i < totalListas; i++) {
            listaDeListas.add( new ArrayList<Integer>());
        }

        // cria e inicia as threads
        List<PopulaLista> threads = new ArrayList<>();
        for (int i = 0; i < totalListas; i++) {
            PopulaLista t = new PopulaLista(listaDeListas.get(i), tamanhoLista);
            threads.add(t);
            t.start();
        }

        // aguarda as threads terminarem
        for (PopulaLista t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // calcula a média
        long soma = 0;
        long totalNumeros = 0;

        for (List<Integer> lista : listaDeListas) {
            for (int num : lista) {
                soma += num;
                totalNumeros++;
            }
        }

        double media = (double) soma / totalNumeros;
        System.out.println("Média dos valores: " + media);
    }
}