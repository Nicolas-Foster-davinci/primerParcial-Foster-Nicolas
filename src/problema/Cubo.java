package problema;

public class Cubo extends FiguraTridimensional{

    //Atributos:
    double lado;
    static final int CARAS=6;

    //Constructores:

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado = 1;
    }

    //Metodos heredados:

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = Math.pow(lado, 3);
        return volumen;
    }

    @Override
    public double calcularSuperficie() {
        double superficie;
        superficie = 6 * Math.pow(lado, 2);
        return superficie;
    }

    //Metodo toString:

    @Override
    public String toString() {
        return "La figura es un cubo ";
    }
}
