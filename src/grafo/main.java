
package grafo;

public class main {
    public static void main(String[] args) {
        GrafoNaoDirecionado g1 = new GrafoNaoDirecionado(5);
        g1.adicionarAresta(0, 2, 3);
        g1.adicionarAresta(0, 3, 4);
        g1.adicionarAresta(0, 4, 3);
        g1.adicionarAresta(1, 2, 3);
        g1.adicionarAresta(1, 3, 1);
        g1.adicionarAresta(1, 4, 2);
        g1.printarGrafo();
        g1.gerarArvore();
        GrafoDirecionado g2 = new GrafoDirecionado(5);
        g2.adicionarAresta(0, 1, 1);
        g2.adicionarAresta(0, 2, 1);
        g2.adicionarAresta(1, 4, 1);
        g2.adicionarAresta(2, 3, 1);
        g2.adicionarAresta(3, 1, 1);
        g2.adicionarAresta(3, 4, 1);
        g2.printarGrafo();
        g2.ordenarTopologica();
    }
}
