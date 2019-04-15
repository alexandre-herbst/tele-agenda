package poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaTelefone {
    @Test
    public void testaTelefone(){
        Telefone a = new Telefone();
        Assert.assertFalse("Este nome ja existe na agenda ",a.add("nome", "0000-0000" ));

    }
}
