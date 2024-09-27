package ar.edu.unahur.obj2.figuras;

public class Elipse extends Figura{

    private Punto centro;
    private Punto puntoRadioX;
    private Punto puntoRadioY;
    private Integer radioX;
    private Integer radioY;

    public Elipse(Punto centro, Punto puntoRadioX, Punto puntoRadioY) {
        Integer radioX = Math.abs(centro.getX() - puntoRadioX.getX());
        Integer radioY = Math.abs(centro.getY() - puntoRadioY.getY());
        if(!radioX.equals(radioY)) {
            this.centro = centro;
            this.puntoRadioX = puntoRadioX;
            this.puntoRadioY = puntoRadioY;
            this.radioX = radioX;
            this.radioY = radioY;
        }else{
            throw new RuntimeException("el radio es igual, cree un circulo");
        }
    }

    @Override
    public void mover(Integer deltaX, Integer deltaY) {
        this.centro.setX(this.centro.getX() + deltaX);
        this.centro.setY(this.centro.getY() + deltaY);
        this.puntoRadioX.setX(this.puntoRadioX.getX() + deltaX);
        this.puntoRadioX.setY(this.puntoRadioX.getY() + deltaY);
        this.puntoRadioY.setX(this.puntoRadioY.getX() + deltaX);
        this.puntoRadioY.setY(this.puntoRadioY.getY() + deltaY);
    }

    @Override
    public double calcularArea() {
        return 3.14* radioX * radioY;
    }

    public Punto getCentro() {
        return centro;
    }

    public Integer getRadioX() {
        return radioX;
    }

    public Integer getRadioY() {
        return radioY;
    }
}
