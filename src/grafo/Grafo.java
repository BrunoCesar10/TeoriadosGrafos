
package grafo;

import java.util.Scanner;

public class Grafo{
    Scanner scan = new Scanner(System.in);
    
    void criarGrafo(){
        System.out.print("Digite o número de vértices do Grafo: ");
        int n = scan.nextInt();
        scan.nextLine();
        int grafo[][] = new int[n][n];
        for (int i = 0; i < grafo.length; i++){
            for (int j = 0; j < grafo.length; j++){
                grafo[i][j] = 0;
            }
        }
        System.out.println("Deseja adicionar uma aresta ao Grafo? Responda apenas sim ou não: ");
        String resposta = scan.next();
        while ("sim".equals(resposta)){
            System.out.println("Vértice de origem: ");
            int origem = scan.nextInt();
            System.out.println("Vértice de destino: ");
            int destino = scan.nextInt();
            grafo[origem - 1][destino - 1] = 1;
            System.out.println("Deseja adicionar uma aresta ao Grafo? Responda apenas sim ou não: ");
            resposta = scan.next();
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

