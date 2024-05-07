package Vehiculos;

public class Mula extends Limites {


    public Mula(int limiteinferior, int limiteIntermedio, int limiteSuperior) {
        super(limiteinferior, limiteIntermedio, limiteSuperior);
        this.limiteinferior = limiteinferior;
        this.limiteIntermedio = limiteIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public Mula() {
        this.limiteinferior = 95;
        this.limiteIntermedio = 96;
        this.limiteSuperior = 110;
    }
}

