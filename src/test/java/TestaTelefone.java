package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaTelefone {
    @Test
    public void testaTelefone(){
        Telefone a = new Telefone();
        Assert.assertFalse("Este nome ja existe na agenda ","false");
        Assert.assertTrue("não é um numero válido", "0000-0000");
        Assert.assertTrue("NÃO é um numero válido", "00000000 ");



    }
}
