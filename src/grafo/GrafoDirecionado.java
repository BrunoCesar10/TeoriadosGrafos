
package grafo;

import java.util.ArrayList;
import java.util.Collections;

public class GrafoDirecionado {
    int vertices;
    int grafo[][];

    public GrafoDirecionado(int vertices){        //cria o grafo
        this.vertices = vertices;
        grafo = new int[vertices][vertices]; 
    }
    
    public void adicionarAresta(int origem, int destino, int peso){
        grafo[origem][destino] = peso;
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
    
    public void ordenarTopologica(){
        ArrayList<Vertice> listaDeVertices = new ArrayList<>();
        
        for (int i = 0; i < vertices; i++){
            listaDeVertices.add(new Vertice(i, 0));
        }
        
        for (int i = 0; i < vertices; i++){
            for (int j = 0; j < vertices; j++){
                if (grafo[i][j] > 0){
                    listaDeVertices.get(j).setGrauDeEntrada(listaDeVertices.get(j).getGrauDeEntrada() + 1);
                }
            }
        }
        
        Collections.sort(listaDeVertices);
        
        System.out.println("Ordenação topológica: ");
        for (Vertice vertice : listaDeVertices) {
            System.out.print("Vértice " + vertice.getNome() + "->");
        }
    }
}
