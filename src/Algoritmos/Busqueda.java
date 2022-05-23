package Algoritmos;

public class Busqueda{    


/* Método de Búsqueda Secuencial o Lineal */
public void busquedaLineal(int[] arreglo, int valor) {

    int i = 0;
    int pos = -1;

    while(i < arreglo.length) {
        if (arreglo[i] == valor) {
            pos = i;
            System.out.println("Se encuentra en la posicion: " + pos);
        }
        i++;
    }
    if (pos==-1)System.out.println("No se encontro el valor "+valor+" en el arreglo");
    
}

/* Método de Búsqueda Secuencial o Lineal con Centinela */
public static int busquedaLinealCentinela(int[] arreglo, int valor) {

    int i = 0;

    while(i < arreglo.length && arreglo[i] != valor) {
        i++;
        System.out.println("Nro iteraciones: " + i);
    }

    if (i < arreglo.length)
        return i;

    return -1;
}

/* Ejemplo de Método de Búsqueda Secuencial o Lineal adaptado con For y Return */
public static int busquedaLinealCustom(int[] arreglo, int valor){

    for (int i = 0; i < arreglo.length; i++) {

        if (arreglo[i] == valor){
            System.out.println("nro iteraciones: " + i);
            return i;
        }
    }

    return -1;
}

/* Método de Búsqueda Binaria */
public static int busquedaBinaria(int[] arreglo, int valor) {
    int min = 0;
    int max = arreglo.length - 1;
    int medio = 0;

    boolean encontrado = false;

    while (min <= max && !encontrado)
    {
        medio = (min + max) / 2;
        if (arreglo[medio] == valor)
            encontrado = true;
        else
        {
            if (arreglo[medio] > valor)
                max = medio - 1;
            else
                min = medio + 1;
        }
    }
    if (!encontrado)
        return -1;

    return medio;
}

/* Método de Búsqueda Secuencial o Lineal con Strings */
public static int busquedaLinealStrings(String[] arreglo, String valor) {

    int i = 0;
    int pos = -1;

    while(i < arreglo.length) {

        String valorArreglo = arreglo[i];

        // utilizo .equals para comparar strings
        if (valorArreglo.equals(valor)) {
            pos = i;
            System.out.println("Se encuentra en: " + pos);
        }
        i++;
    }

    return pos;
}


}