package com.example.final_videojuegos_meneses.entities;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Account {

    private String nombre;
    private Number monto;
    @SerializedName("fecha_creacion")
    private Date fechaCreacion;

    @SerializedName("sucursal_1")
    private String sucursal1;

    @SerializedName("sucursal_2")
    private String sucursal2;

    @SerializedName("sucursal_3")
    private String sucursal3;

    private String imagen;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Number getMonto() {
        return monto;
    }

    public void setMonto(Number monto) {
        this.monto = monto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getSucursal1() {
        return sucursal1;
    }

    public void setSucursal1(String sucursal1) {
        this.sucursal1 = sucursal1;
    }

    public String getSucursal2() {
        return sucursal2;
    }

    public void setSucursal2(String sucursal2) {
        this.sucursal2 = sucursal2;
    }

    public String getSucursal3() {
        return sucursal3;
    }

    public void setSucursal3(String sucursal3) {
        this.sucursal3 = sucursal3;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
