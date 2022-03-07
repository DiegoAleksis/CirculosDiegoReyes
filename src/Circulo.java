public class Circulo {
private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public Circulo(){
        System.out.println("No sirvo para nada");
    }
    public Circulo(float radio){
        this.radio=radio;
    }
    public float calcularArea(){
        return (float) (Math.PI*Math.pow(radio,2));
    }
}
