
package grafo;

public class main {
    public static void main(String[] args) {
        GrafoDirecionado grafo = new GrafoDirecionado(5);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 1);
        grafo.adicionarAresta(3, 4);
        grafo.adicionarAresta(4, 0);
        grafo.printGrafo();
        grafo.getAdjacentes();
        System.out.println(grafo.ehRegular());
        System.out.println(grafo.ehCompleto());
    }
}
