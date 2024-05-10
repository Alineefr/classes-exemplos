package classes;

public class Gato extends Animal {
    private int vidas;
    private int quantidadeOlhos;



    public Gato(String raca, String idade, String cor, double tamanho, double peso, char genero) {
        super(raca, idade, cor, tamanho, peso, genero);
        
    }

    
    // Padrão + vidas
    
    public Gato(String raca, String idade, String cor, double tamanho, double peso, char genero, int vidas) {
        super(raca, idade, cor, tamanho, peso, genero);
        this.vidas = vidas;
    }

    public int getVidas() {
        return vidas;
    }

    
    
    
}
