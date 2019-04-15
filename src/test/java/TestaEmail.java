package  poo;

import org.junit.Assert;
import org.junit.Test;

public class TestaEmail {
    @Test
    public void testaEmail(){
        Email a = new Email();
        Assert.assertTrue("email não válido", a.add("pessoal","teste@aluno.com"));
        Assert.assertFalse("email não válido", a.add("pessoal","teste@aluno.com"));
        Assert.assertFalse("rótulo não válido", a.add("1111","teste@aluno.com"));
        Assert.assertFalse("email não válido", a.add("pessoal","@aluno.com"));


        Assert.assertTrue("email não válido", a.update("pessoal","@aluno.com"));








    }


}
