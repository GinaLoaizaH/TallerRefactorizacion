package Vehiculos;

public class Camion extends Limites {


    public Camion(int limiteinferior, int limiteIntermedio, int limiteSuperior) {
        super(limiteinferior, limiteIntermedio, limiteSuperior);
        this.limiteinferior = limiteinferior;
        this.limiteIntermedio = limiteIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public Camion() {
        this.limiteinferior = 75;
        this.limiteIntermedio = 76;
        this.limiteSuperior = 95;
    }
}
