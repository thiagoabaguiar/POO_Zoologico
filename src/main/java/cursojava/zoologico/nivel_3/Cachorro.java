package cursojava.zoologico.nivel_3;

import cursojava.zoologico.nivel_2.Mamifero;

public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Osso enterrado...");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo...");
    }

    public void reagir(String frase) {

        if (frase.equals("Oi, amigão!")) {
            System.out.println("Abanar rabo e ficar feliz!");
        } else {
            System.out.println("Rosnar...");
        }

    }

    public void reagir(int hora) {

        if (hora > 23) {
            System.out.println("Hora inválida");
        } else if (hora >= 6 && hora <= 12) {
            System.out.println("Espreguiçar...");
        } else if (hora > 12 && hora <= 18) {
            System.out.println("Levantar rápido...");
        } else {
            System.out.println("Ignorar e deitar");
        }

    }

    public void reagir(boolean dono) {

        if (dono) {
            System.out.println("Abanar rabo e pedir comida...");
        } else {
            System.out.println("Rosnar e latir...");
        }

    }

    public void reagir(int idade, float peso) {

        if (idade <= 5 && peso <= 20) {
            System.out.println("Cachorro jovem e leve quer brincar");
        } else if (idade <= 5 && peso > 20) {
            System.out.println("Cachorro jovem e pesado quer afago");
        } else if (idade > 5 && peso <= 20) {
            System.out.println("Cachorro idoso e leve quer comida");
        } else {
            System.out.println("Cachorro idoso e pesado quer dormir");
        }

    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }

}
