package com.iessaladillo.pablo.projectesperanza.data.model;

public class Cliente {

    private String nombre;
    private int telefono;
    private long id_cliente;

    public Cliente(String nombre, int telefono, long id_cliente) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.id_cliente = id_cliente;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

}
