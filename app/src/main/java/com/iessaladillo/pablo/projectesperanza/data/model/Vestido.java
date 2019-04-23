package com.iessaladillo.pablo.projectesperanza.data.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vestido {
    public Vestido(long id_vestido, LocalDate fecha_entrega, String nombre, String foto, ArrayList<Medida> lista_medidas) {
        this.id_vestido = id_vestido;
        this.fecha_entrega = fecha_entrega;
        this.nombre = nombre;
        this.foto = foto;
        this.lista_medidas = lista_medidas;
    }

    
    private long id_vestido;
    private LocalDate fecha_entrega;
    private String nombre;
    private String foto;
    private ArrayList<Medida> lista_medidas;

    public long getId_vestido() {
        return id_vestido;
    }

    public void setId_vestido(long id_vestido) {
        this.id_vestido = id_vestido;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public ArrayList<Medida> getLista_medidas() {
        return lista_medidas;
    }

    public void setLista_medidas(ArrayList<Medida> lista_medidas) {
        this.lista_medidas = lista_medidas;
    }
}
