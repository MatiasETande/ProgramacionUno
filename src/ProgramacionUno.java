/*
    Programacion I - Materia de Primer año TUP
    By Tande, Matias Emanuel

 */



import Algoritmos.Busqueda;
import Algoritmos.Ordenamiento;


public class ProgramacionUno {



    public static void main(String[] args){

        
        Ordenamiento ordenamiento = new Ordenamiento();

        System.out.println("*** Algoritmos utilizados en la clase ***");
        


        int arreglo[]= {9,5,1,7,3,4,6,8,2};

        //Algoritmos de busqueda
        System.out.println("\n### Algoritmos de busqueda ###");
        
        /*
        Se definen dos arreglos:
        -Un arrreglo con los valores ordenados de menor a mayor
        -Un arreglo con valores desordenados
        */
        int arregloOrdenado[] = new int[] { 1, 12, 44, 56, 3, 67, 5, 7, 0, 99};
        int arregloDesordenado[] = new int[] { 0, 1, 3, 5, 7, 12, 44, 56, 67, 99};

        Busqueda busqueda = new Busqueda();

        int valorBuscado=1;

        System.out.println("\n--- Busqueda Lineal o Secuencial ---\n");
        busqueda.busquedaLineal(arregloDesordenado, valorBuscado);
        System.out.println("\n--- ---------------------------- ---\n");

        System.out.println("\n--- Busqueda Lineal con centinela ---\n");
        busqueda.busquedaLinealCentinela(arregloDesordenado, valorBuscado);
        System.out.println("\n--- ---------------------------- ---\n");

        System.out.println("\n--- Busqueda Lineal adaptado con for y Return ---\n");
        /*
        En este caso se usa una funcion que devuelve un valor entero -1 en caso de no 
        encontrar el valor y en caso de encontrarlo devuelve la posicion en la que se
        encuentra el valor buscado
        */
        if((busqueda.busquedaLinealCustom(arregloDesordenado, valorBuscado))!=-1)
        {
            System.out.println("Se encontro en la posicion :"+busqueda.busquedaLinealCustom(arregloDesordenado, valorBuscado));
        }else{
            System.out.println("No se encontro el valor "+valorBuscado+" en el arreglo");
        }
        System.out.println("\n--- ---------------------------- ---\n");


        System.out.println("\n---       Busqueda Binaria       ---\n");
        busqueda.busquedaBinaria(arregloDesordenado, valorBuscado);
        System.out.println("\n--- ---------------------------- ---\n");




        /*ord.imprimirArreglo(arreglo);
        cargarArreglo(arreglo);
        ord.imprimirArreglo(arreglo);
        ord.imprimirArreglo(arreglo);
        ord.burbuja(arreglo);
        ord.imprimirArreglo(arreglo);*/

        



    }




    public static void cargarArreglo (int a[]){
        
        int b[]=a;

        for (int i=0 ; i<a.length; i++)
        {
            b[i]=(int) (Math.random()*10+1);
        }
        

    }



 




}
