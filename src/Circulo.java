public class Circulo {
float radio;

public Circulo(){
    System.out.println("Hola miss, soy el constructor por defecto y no sirvo para nada");}

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
}
