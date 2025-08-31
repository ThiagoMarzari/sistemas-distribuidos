import java.util.List;
import java.util.Random;

class PopulaLista extends Thread {
    private List<Integer> lista;
    private int tamanho;

    public PopulaLista(List<Integer> lista, int tamanho) {
        this.lista = lista;
        this.tamanho = tamanho;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.getName() + " iniciada...");
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(rand.nextInt(100000 - 1000) + 1000); // números entre 1000 e 100000
        }
        System.out.println("Thread " + this.getName() + " finalizada!");
    }
}