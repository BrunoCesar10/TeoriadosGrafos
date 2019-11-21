
package grafo;

import java.util.ArrayList;
import java.util.Collections;

public class GrafoNaoDirecionado {
    int vertices;
    int grafo[][];

    public GrafoNaoDirecionado(int vertices){        //cria o grafo
        this.vertices = vertices;
        grafo = new int[vertices][vertices]; 
    }
    
    public void adicionarAresta(int origem, int destino, int peso){
        grafo[origem][destino] = peso;
        grafo[destino][origem] = peso;
    }
    
    public void printarGrafo(){
        System.out.println("Grafo Criado: ");
        for (int i = 0; i < vertices; i++){
            for (int j = 0; j < vertices; j++){
                System.out.print(grafo[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    
    public void getAdjacentes(){      //encontra os adjacentes
        for(int i = 0; i < vertices; i++){
            System.out.print("Vértice " + i + " é adjacente a " );
            for(int j = 0; j < vertices; j++){
                if(grafo[i][j] != 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    
    public boolean ehRegular(){       //verifica se é regular
        int[] adjacencias = new int[vertices];
        int primeiroElemento = 0;

        for(int i = 0; i < vertices; i++){
            int soma = 0;
            for(int j = 0; j < vertices; j++){
                soma = soma + grafo[i][j];
            }
            adjacencias[i] = soma;
        }
        for(int m = 0; m < adjacencias.length; m++){
            primeiroElemento = adjacencias[0];
            if (adjacencias[m] != primeiroElemento){
                return false;
                }
            }
        return true;
    } 
    
    public boolean ehCompleto(){
        int[] adjacencias = new int[vertices];

        for(int i = 0; i < vertices; i++){
            int soma = 0;
            for(int j = 0; j < vertices; j++){
                soma = soma + grafo[i][j];
            }
            adjacencias[i] = soma;
        }
        
        for (int k = 0; k < adjacencias.length; k++){
            if (adjacencias[k] != vertices - 1){
                return false;
            }
        }
        return true;
    }
    
    /*public boolean ehConexo(){
        
    }*/
    
    public void Dijkstra(int inicio){
        int distancias[] = new int[vertices];
        int verticeAnterior[] = new int[vertices];
        int indexVetores[] = new int[vertices];
        int proximoVertice;
        ArrayList<Integer> visitados = new ArrayList<>();
        ArrayList<Integer> pesoVisitados = new ArrayList<>();
        ArrayList<Integer> pesoVisitadosIndex = new ArrayList<>();

        for (int t = 0; t < vertices; t++) {
            indexVetores[t] = t;
        }

        for (int i = 0; i < vertices; i++) {
            distancias[i] = 999999999;
        }
        distancias[inicio] = 0;
        verticeAnterior[inicio] = -1;
        for (int n = 0; n < vertices; n++) {
             if (n == inicio) {
                    continue;
                }
            if (grafo[inicio][n] > 0 && grafo[inicio][n] < distancias[n]) {
                distancias[n] = grafo[inicio][n];
                verticeAnterior[n] = inicio;
                pesoVisitados.add(grafo[inicio][n]);
                pesoVisitadosIndex.add(n);
            }
        }
        int minIndex = pesoVisitados.indexOf(Collections.min(pesoVisitados));
        proximoVertice = pesoVisitadosIndex.get(minIndex);
        int pesoTotal = Collections.min(pesoVisitados);
        while (visitados.size() < vertices) {
            pesoVisitados.clear();
            pesoVisitadosIndex.clear();
            visitados.add(proximoVertice);
            //System.out.println(visitados);
            for (int n = 0; n < vertices; n++) {
                pesoVisitados.clear();
                pesoVisitadosIndex.clear();
                if (visitados.contains(n) == true || n == proximoVertice) {
                    continue;
                } else if (grafo[proximoVertice][n] > 0 && grafo[proximoVertice][n] < distancias[n]) {
                    distancias[n] = grafo[proximoVertice][n];
                    verticeAnterior[n] = proximoVertice;
                    pesoVisitados.add(grafo[proximoVertice][n]);
                    pesoVisitadosIndex.add(n);
                } else {
                    continue;
                }
            }
            if (pesoVisitados.size() > 0) {
                minIndex = pesoVisitados.indexOf(Collections.min(pesoVisitados));
                pesoTotal = pesoTotal + Collections.min(pesoVisitados);
                proximoVertice = pesoVisitadosIndex.get(minIndex);
                distancias[proximoVertice] = pesoTotal;
            }

        }
        System.out.println("");
        System.out.println("Algoritmo do Menor Caminho: ");
        for (int i = 0; i < vertices; i++) {
            System.out.println("A menor distância do vértice " + inicio + " até o vértice " + i + " é " + distancias[i]);
        }
    }
    
    public void gerarArvore(){
        ArrayList<Aresta> arestas = new ArrayList<>();
        ArrayList<Integer> verticesVisitados = new ArrayList<>();
        int arvore[][] = new int[vertices][vertices];
        int origem, destino, peso;
        
        for (int i = 0; i < vertices; i++){
            for (int j = 0; j < vertices; j++){
                if (grafo[i][j] > 0) {
                    arestas.add(new Aresta(i, j, grafo[i][j]));
                }
            }
        }
        
        Collections.sort(arestas);
        
        for (Aresta aresta : arestas) {
            origem = aresta.getOrigem();
            destino = aresta.getDestino();
            peso = aresta.getPeso();
            if (verticesVisitados.contains(origem) && verticesVisitados.contains(destino)){
                continue;
            } else {
                arvore[origem][destino] = peso;
                arvore[destino][origem] = peso;
                verticesVisitados.add(origem);
                verticesVisitados.add(destino);
            } 
        }
        
        System.out.println("Árvore Geradora Mínima:");
        for (int i = 0; i < vertices; i++){
            for (int j = 0; j < vertices; j++){
                System.out.print(arvore[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
    
    public void buscarArticulacao(int inicio){
        ArrayList<Integer> verticesVisitados = new ArrayList<>();
        verticesVisitados.add(inicio);
        
    }
}
