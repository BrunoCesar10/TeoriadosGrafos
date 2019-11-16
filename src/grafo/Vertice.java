
package grafo;

public class Vertice implements Comparable<Vertice>{
    int nome, grauDeEntrada;
    
    public Vertice(int nome, int grauDeEntrada){
        this.nome = nome;
        this.grauDeEntrada = grauDeEntrada;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
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
