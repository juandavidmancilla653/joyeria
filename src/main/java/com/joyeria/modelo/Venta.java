package com.joyeria.modelo;

public class Venta {

    private int id_venta;
    private String fecha;
    private int id_tercero;

    public Venta() {}

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_tercero() {
        return id_tercero;
    }

    public void setId_tercero(int id_tercero) {
        this.id_tercero = id_tercero;
    }
}
