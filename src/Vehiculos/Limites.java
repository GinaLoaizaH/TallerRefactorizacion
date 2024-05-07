package Vehiculos;

public class Limites{

    protected int limiteinferior;
    protected int limiteIntermedio;
    protected int limiteSuperior;

    public Limites(int limiteinferior, int limiteIntermedio, int limiteSuperior) {
        this.limiteinferior = limiteinferior;
        this.limiteIntermedio = limiteIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public Limites() {

    }


    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo.equalsIgnoreCase("Carro") ||
            tipoVehiculo.equalsIgnoreCase("Camion") ||
            tipoVehiculo.equalsIgnoreCase("Mula")){

            if(velocidad<= limiteinferior){
                return 0;
            } else if (velocidad >= limiteIntermedio && velocidad <= limiteSuperior) {
                return 1;
            }
            return 2;
        }
        return -1;
    }


    public String enviarCorreo(String tipoVehiculo) {

        if(tipoVehiculo.equalsIgnoreCase("Carro") ||
                tipoVehiculo.equalsIgnoreCase("Camion") ||
                tipoVehiculo.equalsIgnoreCase("Mula")){
            String cuerpoMensaje = "\n" + "//enviando correo para el tipo: " + tipoVehiculo;
            String asunto = "\n" + "//asunto: comparendo " + tipoVehiculo;
            return asunto + cuerpoMensaje;
        }
        return "Enviando correo con vehiculo desconocido";
    }


    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int calculoComparendo = calcularComparendo(velocidad, tipoVehiculo);
        String correo = enviarCorreo(tipoVehiculo);

        System.out.println(
                calculoComparendo == -1 ?
                "No hay calculo para el tipo de vehiculo " + tipoVehiculo :
                "--- el tipo de comparendo es: " + calculoComparendo + correo);

    }
}
