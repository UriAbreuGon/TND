
package model;



public class Compra {

    public Compra(int idTarjetaRecargaResultado, String fechaCompra1, String fechaCompra2, int cantidadRecargas1) {
    }
    private int idTarjetaRecarga;
    private String fechaCompra;
    private int cantidadRecargas;
    private int montoCompra;



    public int getIdTarjetaRecarga() {
        return idTarjetaRecarga;
    }

    public void setIdTarjetaRecarga(int idTarjetaRecarga) {
        this.idTarjetaRecarga = idTarjetaRecarga;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidadRecargas() {
        return cantidadRecargas;
    }

    public void setCantidadRecargas(int cantidadRecargas) {
        this.cantidadRecargas = cantidadRecargas;
    }

    public int getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(int montoCompra) {
        this.montoCompra = montoCompra;
    }
}
    

