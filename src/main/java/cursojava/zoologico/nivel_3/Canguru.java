package cursojava.zoologico.nivel_3;

import cursojava.zoologico.nivel_2.Mamifero;

public class Canguru extends Mamifero {
 
    public void usarBolsa(){
        System.out.println("Usando a bolsa...");
    }
    
    @Override
    public void locomover(){
        System.out.println("Saltando...");
    }
    
}
