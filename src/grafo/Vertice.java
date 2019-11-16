
package grafo;

public class Vertice implements Comparable<Vertice>{
    int grauDeEntrada;
    
    public Vertice(int grauDeEntrada){
        this.grauDeEntrada = grauDeEntrada;
    }

    public int getGrauDeEntrada() {
        return grauDeEntrada;
    }

    public void setGrauDeEntrada(int grauDeEntrada) {
        this.grauDeEntrada = grauDeEntrada;
    }
    
    @Override
    public int compareTo(Vertice vertice){
        int comparaGrau = ((Vertice) vertice).getGrauDeEntrada();
        return this.grauDeEntrada-comparaGrau;
    }
}
