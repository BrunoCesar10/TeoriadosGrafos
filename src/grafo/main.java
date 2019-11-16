
package grafo;

public class main {
    public static void main(String[] args) {
        GrafoNaoDirecionado grafo = new GrafoNaoDirecionado(5);
        grafo.adicionarAresta(0, 1, 6);
        grafo.adicionarAresta(0, 3, 1);
        grafo.adicionarAresta(1, 2, 5);
        grafo.adicionarAresta(1, 3, 2);
        grafo.adicionarAresta(1, 4, 2);
        grafo.adicionarAresta(2, 4, 5);
        grafo.adicionarAresta(3, 4, 1);
        grafo.printGrafo();
        /*grafo.getAdjacentes();
        System.out.println(grafo.ehRegular());
        System.out.println(grafo.ehCompleto());
        grafo.Dijkstra(1);*/
        grafo.gerarArvore();
    }
}
