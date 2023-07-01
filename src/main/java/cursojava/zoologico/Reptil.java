package cursojava.zoologico;

public class Reptil extends Animal {

    protected String corDaEscama;

    public String getCorDaEscama() {
        return this.corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil...");
    }

}
