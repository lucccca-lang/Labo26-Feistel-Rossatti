package residuos;

// 4. Sistema integral de recolección de residuos

// Debido a un crecimiento de la ciudad en estos años, se necesita empezar a actualizar el sistema de recolección de residuos
// ya que se observaron varios problemas
// en el funcionamiento.

// Hay distintos tipos de residuos con nombre, indicación de si es reciclable o no y una descripción del tratamiento que necesita.
//  El sistema deberá poder registrar nuevos tipos, modificarlos y consultar cuáles son reciclables y cuáles no.

// En la ciudad existen distintos puntos de recolección. Cada uno de estos puntos poseen una dirección única, su latitud y longitud,
// un barrio, un nombre y los tipos de residuos que recibe junto a su cantidad. Ejemplo: el punto ubicado en la escuela 15 podría recibir
// papel,
//  cartón y plástico, mientras que en un laboratorio también podría aceptar residuos electrónicos.

// El sistema deberá permitir buscar un punto mediante su dirección, agregar, modificar, eliminar, agregar o quitar residuos aceptados
//  y consultar
//  si recibe un tipo determinado. También se deberá poder conocer todos los puntos ubicados en un barrio, una lista de los puntos
//  que reciben
//   cierto tipo de residuo y que, dado un barrio, devolver cuantos puntos de residuo hay para cada tipo de residuo.

// Por otro lado, hay una flota de camiones. De cada uno se conoce la patente, la marca, el modelo, su capacidad máxima expresada
// en kilogramos,
// la autonomía de 45km que es igual para todos y los tipos de residuos que está autorizado a transportar.
// Algunos camiones pueden transportar residuos generales,
//  mientras que otros están preparados exclusivamente para materiales reciclables o residuos que requieren un tratamiento especial.

// El sistema deberá permitir que se inicie una recolección indicándole el camión y una lista de puntos de recolección a visitar.
// Es importante que esa lista está en un orden determinado que es el que hacen los oficiales para asegurarse que es el camino más corto.

// Para que la recolección sea exitosa se deberá asegurar que la distancia total del primer punto de recolección
//  al último sea menor a 45km (porque se apaga),
// que el total de peso a recolectar de los puntos de recolección no supere la capacidad máxima del camión.
//  Importante que si se recolecta del punto este tiene
//  que quedar vacío y únicamente el camión va a poder agarrar los residuos de los tipos que transporta.

// La recolección se hace una vez por día y se quiere guardar en el sistema la fecha y el resultado:
// si salió bien (cumplió con las condiciones detalladas arriba) o salió mal.
// Esto le sirve al sistema para poder calcular luego el porcentaje de eficiencia que está teniendo esta nueva forma de recolección.


import java.util.HashSet;

public class TipoResiduo {
    private int nombre;
    private boolean esReciclable;
    private String descripcionTratamiento;


    public int getNombre() {
        return nombre;
    }
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public boolean isEsReciclable() {
        return esReciclable;
    }
    public void setEsReciclable(boolean reciclable) {
        this.esReciclable = reciclable;
    }
    public String getDescripcionTratamiento() {
        return descripcionTratamiento;
    }
    public void setDescripcionTratamiento(String descripcionTratamiento) {
        this.descripcionTratamiento = descripcionTratamiento;
    }




}
