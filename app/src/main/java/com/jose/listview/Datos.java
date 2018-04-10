package com.jose.listview;

import java.util.ArrayList;

/**
 * Created by android on 09/04/2018.
 */

public class Datos {
    private static ArrayList<Persona> persona = new ArrayList<>();
    public static void guardar (Persona p){
     persona.add(p);
    }
    public static ArrayList<Persona> obtener (){
        return persona;
    }
}
