package com.joyeria.modelo;

public class Tercero {

    private int id_tercero;
    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private int id_tipo_tercero;

    public Tercero() {
    }

    public Tercero(String nombre, String documento, String telefono, String direccion, int id_tipo_tercero) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id_tipo_tercero = id_tipo_tercero;
    }


    public int getId_tercero() {
        return id_tercero;
    }

    public void setId_tercero(int id_tercero) {
        this.id_tercero = id_tercero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_tipo_tercero() {
        return id_tipo_tercero;
    }

    public void setId_tipo_tercero(int id_tipo_tercero) {
        this.id_tipo_tercero = id_tipo_tercero;
    }
}