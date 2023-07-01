package cursojava.zoologico.nivel_2;

import cursojava.zoologico.nivel_1.Animal;

public class Mamifero extends Animal {

    protected String corDoPelo;

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

}