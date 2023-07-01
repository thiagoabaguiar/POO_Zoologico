package cursojava.zoologico;

public class Peixe extends Animal {
    
    protected String corDaEscama;

    public String getCorDaEscama() {
        return this.corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo algas...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não emite som...");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    
}
