
package grafo;

public class Aresta implements Comparable<Aresta>{
    int origem, destino, peso;
    
    public Aresta (int origem, int destino, int peso){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public int compareTo(Aresta aresta){
        int comparaPeso=((Aresta) aresta).getPeso();
        return this.peso-comparaPeso;
    }
}
