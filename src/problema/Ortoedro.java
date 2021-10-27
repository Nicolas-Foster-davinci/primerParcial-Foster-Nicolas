package problema;

public class Ortoedro extends FiguraTridimensional{

    //Atributos:
    double ancho;
    double base;
    double altura;
    static final int CARAS=6;


    //Constructores:
    public Ortoedro(double ancho, double base, double altura) {
        this.ancho = ancho;
        this.base = base;
        this.altura = altura;
    }

    public Ortoedro() {
        this.ancho = 1;
        this.base = 1;
        this.altura = 1;
    }

    //Metodos heredados:


    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = ancho * base * altura;
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = 2 * (ancho * base) + 2 * (ancho * altura) + 2 * ( base * altura);
        return superficie;
    }

    //Metodo toString:

    @Override
    public String toString() {
        return "La figura es un Ortoedro";
    }


}
