
package grafo;

public class GrafoNaoDirecionado {
    int vertices;
    int grafo[][];

    public GrafoNaoDirecionado(int vertices){        //cria o grafo
        this.vertices = vertices;
        grafo = new int[vertices][vertices]; 
    }
    
    public void adicionarAresta(int origem, int destino){
        grafo[origem][destino] = 1;
        grafo[destino][origem] = 1;
    }
    
    public void printGrafo(){
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
                if(grafo[i][j] == 1){
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
}
