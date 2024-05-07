package Vehiculos;

public class Carro extends Limites {


    public Carro(int limiteinferior, int limiteIntermedio, int limiteSuperior) {
        super(limiteinferior, limiteIntermedio, limiteSuperior);
        this.limiteinferior = limiteinferior;
        this.limiteIntermedio = limiteIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public Carro() {
        this.limiteinferior = 65;
        this.limiteIntermedio = 66;
        this.limiteSuperior = 85;
    }

}
