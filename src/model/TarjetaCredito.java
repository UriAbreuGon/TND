
package model;

public class TarjetaCredito extends ConexionMysql {
    private int numeroTarjeta;
    private int fechaVencimiento;
    private int cantidadARecargar;

    public TarjetaCredito(int numeroTarjeta, int fechaVencimiento, int cantidadARecargar) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadARecargar = cantidadARecargar;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCantidadARecargar() {
        return cantidadARecargar;
    }
}
    

