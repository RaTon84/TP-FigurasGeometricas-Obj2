package ar.edu.unahur.obj2.figuras;

import static org.junit.Assert.*;
import org.junit.Test;

public class ElipseTest {

    Punto centro = new Punto(0,0);
    Punto radioX = new Punto(0,3);
    Punto radioY = new Punto(0,2);
    Elipse elipse = new Elipse(centro, radioX, radioY);

    @Test
    public void puntoCentroElipse(){
        assertEquals(0, centro.getX().intValue());
        assertEquals(0, centro.getY().intValue());
    }

    @Test
    public void moverElipse(){
        elipse.mover(1,1);
        assertEquals(1, elipse.getCentro().getX().intValue());
        assertEquals(1, elipse.getCentro().getY().intValue());
    }

    @Test
    public void areaDeUnRectangulo() {
        Double radioX = elipse.getRadioX().doubleValue();
        Double radioY = elipse.getRadioY().doubleValue();
        assertEquals(3.14*radioX*radioY, elipse.calcularArea(),0.01);
    }
}
