package poo;

import java.util.HashMap;

public class Email {

    //Atributos e Construtor
    public Email(){ }
    private HashMap<String, String> dadosE = new HashMap<>();

    // Declaração dos metodos
    public boolean add(String r, String n){
        if(dadosE.containsKey(r)){
            return false;
        }
        else{
            dadosE.put(r, n);
            return true;
        }
    }

    public boolean remove(String r){
        if(dadosE.containsKey(r)){
            dadosE.remove(r);
            return true;
        }
        else{
            return false;
        }
    }
    public  boolean update(String r, String n){
        return true;
    }

    @Override
    public String toString() {

        return "teste";
    }
}
