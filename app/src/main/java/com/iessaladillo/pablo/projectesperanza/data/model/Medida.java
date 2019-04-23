package com.iessaladillo.pablo.projectesperanza.data.model;

public class Medida {



    private long id;
    private double cantidad;
    private double nombre;

    public Medida(double cantidad, double nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getNombre() {
        return nombre;
    }

    public void setNombre(double nombre) {
        this.nombre = nombre;
    }




}
