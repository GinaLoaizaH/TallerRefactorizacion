import Vehiculos.Camion;
import Vehiculos.Carro;
import Vehiculos.Limites;
import Vehiculos.Mula;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.construirFotoMulta(80, "Carro");

        System.out.println("**************************************");
        Mula mula = new Mula();
        mula.construirFotoMulta(115, "Mula");

        System.out.println("**************************************");
        Camion camion = new Camion();
        camion.construirFotoMulta(74, "Camion");

    }
}