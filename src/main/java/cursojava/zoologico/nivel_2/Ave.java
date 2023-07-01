package cursojava.zoologico.nivel_2;

import cursojava.zoologico.nivel_1.Animal;

public class Ave extends Animal {
    
    protected String corDaPena;
    
    public String getCorDaPena(){
        return this.corDaPena;
    }
    
    public void setCorDaPena(String corDaPena){
        this.corDaPena = corDaPena;
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando...");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas...");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Assobiando...");
    }
    
    public void fazerNinho(){
        System.out.println("Ninho contruído...");
    }
    
}
