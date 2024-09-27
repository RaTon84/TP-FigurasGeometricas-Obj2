package ar.edu.unahur.obj2.figuras;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectanguloTest {

    Punto esquinaInferior = new Punto(0,0);
    Punto esquinaSuperior = new Punto(1,3);
    Rectangulo rectangulo = new Rectangulo(esquinaInferior, esquinaSuperior);

    @Test
    public void puntoEsquinaInferiorRectangulo(){
        assertEquals(0, rectangulo.getEsquinaInferior().getX().intValue());
        assertEquals(0, rectangulo.getEsquinaInferior().getY().intValue());
    }

    @Test
    public void MoverRectangulo() {
        rectangulo.mover(1,1);
        assertEquals(1, rectangulo.getEsquinaInferior().getX().intValue());
        assertEquals(1, rectangulo.getEsquinaInferior().getY().intValue());
    }

    @Test
    public void areaDeUnRectangulo() {
        Double lado1 = rectangulo.getLado1().doubleValue();
        Double lado2 = rectangulo.getLado2().doubleValue();
        assertEquals(lado1*lado2, rectangulo.calcularArea(),0.01);
    }
}
