package poo;

import java.util.HashMap;

public class Email {

    //Atributos e Construtor
    public Email(){ }
    private HashMap<String, String> dadosE = new HashMap<>();

    // Declaração dos metodos
    public boolean add(String r, String n){
        return true;

    }
    public boolean remove(String r){
        return true;

    }
    public  boolean update(String r, String n){
        return true;
    }

    @Override
    public String toString() {

        return "teste";
    }
}
