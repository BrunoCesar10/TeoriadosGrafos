
package grafo;

import java.util.Scanner;

public class Grafo{
    Scanner scan = new Scanner(System.in);
    
    void criarGrafo(){
        System.out.print("Digite o número de vértices do Grafo: ");
        int n = scan.nextInt();
        scan.nextLine();
        int m = 0;
        int grafo[][] = new int[n + 1][n + 1];
        for (int i = 0; i < grafo.length; i++){
            for (int j = 0; j < grafo.length; j++){
                grafo[i][j] = 0;
            }
        }
        for (int k = 0; k < grafo.length; k++){
            grafo[k][0] = k;
            grafo[0][k] = m;
            m++;
        }
        System.out.println("Deseja adicionar uma aresta ao Grafo? Responda 1 para continuar, qualquer outro input terminará o grafo: ");
        String resposta = scan.nextLine();
        while ("1".equals(resposta)){
            System.out.println("Vértice de origem: ");
            int origem = scan.nextInt();
            System.out.println("Vértice de destino: ");
            int destino = scan.nextInt();
            System.out.println("Digite o peso da aresta:");
            int peso = scan.nextInt();
            grafo[origem][destino] = peso;
            System.out.println("Deseja adicionar uma aresta ao Grafo? Responda 1 para continuar, qualquer outro input terminará o grafo: ");
            resposta = scan.nextLine();
        }
        System.out.println("");
        System.out.println("Representação do grafo: ");
        for (int i = 0; i < grafo.length; i++){
            for (int j = 0; j < grafo.length; j++){
                System.out.print(grafo[i][j] + "\t");
            }
            System.out.println(" ");
        }   
    }

    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.criarGrafo();
    }
}

