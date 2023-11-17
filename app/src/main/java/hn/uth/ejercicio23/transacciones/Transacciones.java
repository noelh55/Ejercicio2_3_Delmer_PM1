package hn.uth.ejercicio23.transacciones;

public class Transacciones {
    public static final String tablaImagen = "imagen";
    public static final String idImagen = "idImagen";
    public static final String blonImagen = "blonImagen";
    public static final String descripcion = "descripcion";

    public static final String CreateTableImagen =
            "CREATE TABLE imagen(idImagen INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "blonImagen BLOB, descripcion TEXT)";
    public static final String DropeTableImagen =
            "DROPE TABLE IF EXISTS imagen";

    /* Base de Datos */
    public static final String NameDataBase = "dbimagenes";



}
