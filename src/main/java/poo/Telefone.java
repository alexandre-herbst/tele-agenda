package poo;

import java.util.HashMap;

public class Telefone {


     // Declarações dos atributos e construtor:
    public Telefone(){ }
    private HashMap<String, String> dadosT = new HashMap<>();



    // Declaração dos metodos
    public boolean add(String r, String n){
        if(dadosT.containsKey(r)){
            return false;
        }
        else {
            dadosT.put(r, n);
            return true;
        }
    }


    public boolean remove(String r){
        if(dadosT.containsKey(r)){
            dadosT.remove(r);
            return true;
        }
        return false;
    }

    public  boolean update(String r, String n){
        return true;
    }



    @Override
    public String toString() {

    return "teste";
    }



}
