import java.util.List;
import java.util.Random;

class PopulaLista extends Thread {
    private List<List> lista;
    private int tamanho;

    public PopulaLista(List<List> lista, int tamanho) {
        this.lista = lista;
        this.tamanho = tamanho;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " iniciada...");
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(rand.nextInt(100000 - 1000) + 1000); // números entre 1.000 e 100.000
        }
        System.out.println("Thread " + this.getName() + " finalizada!");
    }
}