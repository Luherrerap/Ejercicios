import java.util.Scanner;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
       /* Ejercicio 1

        String [] letras = {"A","B","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O" , "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (String i : letras){
            System.out.println(i.toLowerCase());

        }*/



        /* Ejercicio 2 
        int sumaEdades = 0;
        int i = 0;

        while(i<=100){
            System.out.println("Ingresa la edad " + i); 
            int edad = scanner.nextInt();
            sumaEdades += edad;
            i++;
        }
        int prom = sumaEdades/100;
        System.out.println("El promedio de edad entre las edades ingresadas es " + prom); */

        /*Ejercicio 3 
        float sumaCalificaciones = 0;
        int i = 0;
        while (i<7){
            System.out.println("Ingresa la calificacion "+ i);
            float calificacion = scanner.nextFloat();
            sumaCalificaciones += calificacion;
            i++;
        }
        float prom = sumaCalificaciones/7;
        System.out.println("El promedio de las calificaciones ingresadas es: "+ prom);*/

        /*Ejercicio 4 
        int i = 0;
        while(i<10){
            System.out.println("Ingresa el numero");
            float numero = scanner.nextFloat();
            double cubo = Math.pow(numero, 3);
            double cuarta = Math.pow(numero, 4);
            System.out.println("El cubo del numero es: "+ cubo + ", y la cuarta del numero es: " + cuarta);
            i++;
        } */

        /*Ejercicio 5
         
        int i = 0;
        int[] numeros = new int[10];
        
        while(i<10){
            System.out.println("Ingresa el numero");
            numeros[i] = scanner.nextInt();
            i++;
            }
        System.out.println("Los numeros positivos son:");    
        for(int num : numeros){
            if(num>0){
                System.out.println(num);
            } */







    }
        


}
    
