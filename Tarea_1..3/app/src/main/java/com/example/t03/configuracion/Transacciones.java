package com.example.t03.configuracion;
    public class Transacciones {
    public  static final String NameDatabase="mvcdb";
    public static final String tablaPersonas = "personas";
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String direccion = "direccion";
    public static final String Correo = "Correo";
    public static final String CreateTablePersonas
            = "CREATE TABLE personas(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
              "nombres TEXT, apellidos TEXT, edad INTEGER, direccion TEXT, Correo TEXT)";
    public static final String DROPTablePersonas= "DROP TABLE IF EXIST personas";

}
