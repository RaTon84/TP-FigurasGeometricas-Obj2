package ar.edu.unahur.obj2.figuras;

import org.junit.Assert;
import org.junit.Test;

public class PuntoTest {

    @Test
    public void puntoEnPlano(){
        Punto punto = new Punto(0,0);
        Assert.assertNotNull(punto);
    }
}
