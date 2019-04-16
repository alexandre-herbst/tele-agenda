package poo;

import java.util.HashMap;

public class Email {

    //Atributos e Construtor
    public Email(){ }
    private HashMap<String, String> dadosE = new HashMap<>();

    private boolean validaEmail(String email){
        String emailER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        return email.matches(emailER);
    }


    // Declaração dos metodos
    public boolean add(String r, String n){

        if(! this.validaEmail(n)) return false;
        if(dadosE.containsKey(r)) return false;

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
        if(dadosE.containsKey(r)){
            dadosE.put(r, n);
        }
        return true;
    }

    @Override
    public String toString() {

        return "teste";
    }
}
