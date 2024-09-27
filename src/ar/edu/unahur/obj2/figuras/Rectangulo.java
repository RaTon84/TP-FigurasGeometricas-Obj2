package ar.edu.unahur.obj2.figuras;

public class Rectangulo extends Figura{

    private Integer lado2;
    private Integer lado1;
    private Punto esquinaSuperior;
    private Punto esquinaInferior;

    public Rectangulo(Punto esquinaInferior, Punto esquinaSuperior) {
//        this.lado1 = Math.abs(esquinaInferior.getX() - esquinaSuperior.getX());;
//        this.lado2 = Math.abs(esquinaInferior.getY() - esquinaSuperior.getY());;
        ///pregutar por el this///
        Integer lado1 = Math.abs(esquinaInferior.getX() - esquinaSuperior.getX());
        Integer lado2 = Math.abs(esquinaInferior.getY() - esquinaSuperior.getY());
        if (!lado1.equals(lado2)) {
            this.esquinaInferior = esquinaInferior;
            this.esquinaSuperior = esquinaSuperior;
            this.lado1 = lado1;
            this.lado2 = lado2;
        }else{
            throw new RuntimeException("los lados son iguales, cree un cuadrado");
        }
    }
    @Override
    public void mover(Integer deltaX, Integer deltaY) {
        this.esquinaInferior.setX(esquinaInferior.getX() + deltaX);
        this.esquinaInferior.setY(esquinaInferior.getY() + deltaY);
        this.esquinaSuperior.setX(esquinaSuperior.getX() + deltaX);
        this.esquinaSuperior.setY(esquinaSuperior.getY() + deltaY);
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    public Punto getEsquinaSuperior() {
        return esquinaSuperior;
    }

    public Punto getEsquinaInferior() {
        return esquinaInferior;
    }

    public Integer getLado2() {
        return lado2;
    }

    public Integer getLado1() {
        return lado1;
    }
}
