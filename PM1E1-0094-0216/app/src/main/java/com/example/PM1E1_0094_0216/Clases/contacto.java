package com.example.PM1E1_0094_0216.Clases;
import java.sql.Blob;
public class contacto {
    private int codigo;
    private String nomCont;
    private String codPais;
    private String Nota;
    private int numCon;
    private Blob image;

    public Blob getImage() {
        return image;
    }
    public contacto() {}
    public contacto(int codigo, String codPais, String nomCont,
                     int numCono, String Nota, Blob image)
    {
        this.codigo = codigo;
        this.codPais = codPais;
        this.nomCont = nomCont;
        this.numCon = numCon;
        this.Nota = Nota;
        this.image = image;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getcodPais() {
        return codPais;
    }
    public void setcodPais(String codPais) {
        this.codPais = codPais;
    }
    public String getnomCont() {
        return nomCont;
    }
    public void setnomCont(String nomCont) {
        this.nomCont = nomCont;
    }
    public int getnumCon() {
        return numCon;
    }
    public void setnumCon(int numCon) {
        this.numCon = numCon;
    }
    public String getNota() {
        return Nota;
    }
    public void setNota(String Nota) {
        this.Nota = Nota;
    }
    public void setImage(Blob image) {
        this.image = image;
    }
}
