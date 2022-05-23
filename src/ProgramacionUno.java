/*
    Programacion I - Materia de Primer año TUP
    By Tande, Matias Emanuel

 */



import Algoritmos.Ordenamiento;


public class ProgramacionUno {



    public static void main(String[] args){

        Ordenamiento ord = new Ordenamiento();

        System.out.println("--- Algoritmos utilizados en la clase ---");
        System.out.println("--- Esto es una prueba ---");

        int arreglo[]= {9,5,1,7,3,4,6,8,2};
        ord.imprimirArreglo(arreglo);


        cargarArreglo(arreglo);

        ord.imprimirArreglo(arreglo);





        ord.imprimirArreglo(arreglo);

        ord.burbuja(arreglo);

        ord.imprimirArreglo(arreglo);

        



    }

    public static void cargarArreglo (int a[]){
        
        int b[]=a;

        for (int i=0 ; i<a.length; i++)
        {
            b[i]=(int) (Math.random()*10+1);
        }
        

    }



 




}
