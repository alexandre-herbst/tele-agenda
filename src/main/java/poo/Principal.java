package poo;

public class Principal {
    public static void main(String[] args) {
        Telefone t = new Telefone();

        t.add("Alexandre", "9643-0355");
        t.update("Alexandre", " 9999-9999");
        t.imprime(t);


    }
}
