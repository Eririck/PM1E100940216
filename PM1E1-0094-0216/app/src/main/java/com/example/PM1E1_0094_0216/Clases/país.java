package com.example.PM1E1_0094_0216.Clases;
public class país {
    private String NombrePaises;
    private String codigo;
    public País() {
    }
    public país(String codigo, String NombrePaises)
    {   this.codigo = codigo;
        this.NombrePaises = NombrePaises;}
    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }
    public String getNombrePaises()
    {
        return NombrePaises;
    }
    public void setNombrePaises(String NombrePaises)
    {
        this.NombrePaises = NombrePaises;
    }
}
