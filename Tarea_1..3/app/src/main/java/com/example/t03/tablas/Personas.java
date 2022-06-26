package com.example.t03.tablas;

public class Personas {
    private Integer id, edad;
    private String nombres, apellidos, direccion, Correo;

    public Personas(Integer id, Integer edad, String nombres, String apellidos, String direccion, String Correo) {
        this.id = id;
        this.edad = edad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.Correo = Correo;
    }

    public Personas() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }


    public void setCorreo(String correo) {
        this.Correo = correo;
    }
}
