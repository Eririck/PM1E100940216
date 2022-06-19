package com.example.PM1E1_0094_0216.Clases.configuraciones;
import java.sql.Blob;
public class Transacciones {
    public static final String NameDatabase = "PM01DB";

    public static String tblPaises = "paises";
    public static final String codigo ="codigo";
    public static final String p_país="país";

    public static final String CreateTablePaises = "CREATE TABLE " + tblPaises + "(codigo INTEGER PRIMARY KEY,"+"país TEXT )";
    public static final String DropTablePaises = "DROP TABLE " + tblPaises;

    public static final String tablacontactos = "contactos";

        public static final String id = "id";
        public static final String nombreCompleto = "nombreCompleto";
        public static final String telefono = "telefono";
        public static final String Nota = "Nota";
        public static final String foto = "foto";
        public static final String País = "País";
        public static final String createTableContact = "CREATE TABLE " + tablacontactos +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombreCompleto TEXT, telefono INTEGER, Nota TEXT, foto BLOB, País TEXT)";
        public static final String dropTableContact = "DROP TABLE IF EXIST" + tablacontactos;
}
