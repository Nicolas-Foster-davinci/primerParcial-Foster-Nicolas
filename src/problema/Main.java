package problema;

public class Main {
    public static void main(String[] args) {

        //objeto de la clase Ortoedro
        Ortoedro ortoedro = new Ortoedro(9,7,7);
        System.out.println("la superficie del ortoedro es: " + ortoedro.calcularSuperficie());
        System.out.println("el volumen del ortoedro es: " +  ortoedro.calcularVolumen());
        System.out.println(ortoedro.toString() + "\n");

        //objeto de la clase TetraedroRegular
        TetraedroRegular tetraedroRegular = new TetraedroRegular(7);
        System.out.println("la superficie del tetraedroRegular es: " + tetraedroRegular.calcularSuperficie());
        System.out.println("el volumen del tetraedroRegular es: " + tetraedroRegular.calcularVolumen());
        System.out.println(tetraedroRegular.toString() + "\n");

        //objeto de la clase Cubo
        Cubo cubo = new Cubo(7);
        System.out.println("la superficie del cubo es: " + cubo.calcularSuperficie());
        System.out.println("el volumen del cubo es: " + cubo.calcularVolumen());
        System.out.println(cubo.toString() + "\n");
        
    }
}
