package Ejercicios1;


import java.util.Scanner;

public class main {

    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Que ejercicio quieres realizar");
      int Ejercicio = scanner.nextInt();
      
      
      switch (Ejercicio) {
         case 1: {

            System.out.println("Ingrese un numero entero");
            int numero = scanner.nextInt();
            if (numero % 2 == 0 ){
             System.out.println("El numero es par");
            } 
            else{
            System.out.println("El numero es impar");
            }

            break;

         }

         case 2: {
            System.out.println("Ingrese un numero entero");
            int numero = scanner.nextInt();
            if (numero > 0 ){
               System.out.println("El numero es positivo");
            }
            else{
               System.out.println("El numero es negativo");
            }
            break;

         }

         default: {
            System.out.println("El numero de ejercicio no esta disponible");

         }

         case 3: {
            System.out.println("Ingrese un numero entero");
            int numero = scanner.nextInt();
            if (numero > 0 ){
               System.out.println("Ingrese un segundo numero");
               int numero2 = scanner.nextInt();
               int suma = numero + numero2;
               int resta = numero - numero2;
               int producto = numero * numero2;
               System.out.println("La suma de los numeros es: " + suma + ", la resta de los numeros es: " + resta + " y el producto de los numeros es: " + producto);

            }
            else {
               System.out.println("El numero no es positivo");

            }
            break;
         }
         
         case 4: {
            System.out.println("Ingrese el primer numero");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2 = scanner.nextInt();
            if (numero1 > numero2){
               System.out.println("El primer numero: " + numero1 + ", es mayor al segundo numero: " + numero2);
            }
            else{
               System.out.println("El segundo numero: " + numero2 + ", es mayor al primer numero: " + numero1);
            }
            break;
         }

         case 5: {
            System.out.println("Ingrese el primer numero");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2 = scanner.nextInt();
            System.out.println("Ingrese el tercer numero");
            int numero3 = scanner.nextInt();
            int mayor;

            if(numero1 > numero2 && numero1 > numero3){
               mayor = numero1;
            }
            else if(numero2 > numero1 && numero2 > numero3){
               mayor = numero2;
            }
            else{
               mayor = numero3;
            }
            System.out.println("El numero mayor es: " + mayor);

            break;

         }

         case 6: {
            System.out.println("Ingrese el primer numero");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numero2 = scanner.nextInt();
            System.out.println("Ingrese el tercer numero");
            int numero3 = scanner.nextInt();
            System.out.println("Ingrese el cuarto numero");
            int numero4 = scanner.nextInt();
            int mayor;

            if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
               mayor = numero1;
            }
            else if(numero2 > numero1 && numero2 > numero3 && numero2 > numero4){
               mayor = numero2;
            }
            else if(numero3 > numero1 && numero3 > numero2 && numero3 > numero4){
               mayor = numero3;
            }
            else{
               mayor = numero4;
            }
            System.out.println("El numero mayor es: " + mayor);
            break;


         }

         case 7: {
            System.out.println("Ingrese la temperatura del agua como numero entero");
            int temperatura = scanner.nextInt();
            if (temperatura<0){
               System.out.println("El estado del agua es solido");
            }
            else if (temperatura<100 && temperatura>=0){
               System.out.println("El estado del agua es liquido");
            }
            else{
               System.out.println("El estado del agua es gaseoso");
            }
            break;
         }

         case 8: {
            System.out.println("Ingrese el año");
            int año = scanner.nextInt();
            if (año%400 == 0){
               System.out.println("El año es bisiesto");
            }
            else if( año%4 == 0 && año != 100){
               System.out.println("El año es bisiesto");
            }
            else {
               System.out.println("El año no es bisiesto");
            }
            break;

         }

         case 9: {
            System.out.println("Ingrese el mes del año");
            int mes = scanner.nextInt();
            System.out.println("Ingrese el dia del mes");
            int dia = scanner.nextInt();
            switch (mes) {
               case 1:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de enero");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de febrero");
                  }
                  break;
               }
               case 2:{
                  if (dia > 0 && dia <28){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de febrero");
                  }
                  else if(dia == 28){
                     System.out.println("La fecha de mañana es: 1 de marzo");
                  }
                  break;
               }
               case 3: { 
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de marzo");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de abril");
                  }
                  break;
               }
               case 4: {
                  if (dia > 0 && dia <30){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de abril");
                  }
                  else if(dia == 30){
                     System.out.println("La fecha de mañana es: 1 de mayo");
                  }
                  break;
               }
               case 5:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de mayo");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de junio");
                  }
                  break;
               }
               case 6:{
                  if (dia > 0 && dia <30){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de junio");
                  }
                  else if(dia == 30){
                     System.out.println("La fecha de mañana es: 1 de julio");
                  }
                  break;
               }
               case 7:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de julio");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de agosto");
                  }
                  break;
               }
               case 8:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de agosto");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de septiempre");
                  }
                  break;
               }
               case 9:{
                  if (dia > 0 && dia <30){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de septiempre");
                  }
                  else if(dia == 30){
                     System.out.println("La fecha de mañana es: 1 de octubre");
                  }
                  break;
               }
               case 10:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de octubre");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de noviembre");
                  }
                  break;
               }
               case 11:{
                  if (dia > 0 && dia <30){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de noviembre");
                  }
                  else if(dia == 30){
                     System.out.println("La fecha de mañana es: 1 de diciembre");
                  }
                  break;
               }
               case 12:{
                  if (dia > 0 && dia <31){
                     dia++;
                     System.out.println("La fecha el dia de mañana es: "+ dia + " de diciembre");
                  }
                  else if(dia == 31){
                     System.out.println("La fecha de mañana es: 1 de enero");
                  }
                  break;
               }
               default:{
                  System.out.println("El mes no es valido");
               }
                     
            }
         }

         case 10:{
            System.out.println("Ingrese el numero del mes");
            int mes = scanner.nextInt();
            if (mes < 0 && mes>12){
               System.out.println("El mes no es valido");
            }
            else{
               switch (mes) {
                  case 1:{
                     System.out.println("El mes es enero");
                     break;
                  }
                  case 2:{
                     System.out.println("El mes es febrero");
                     break;
                  }
                  case 3:{
                     System.out.println("El mes es marzo");
                     break;
                  }
                  case 4:{
                     System.out.println("El mes es abril");
                     break;
                  }
                  case 5:{
                     System.out.println("El mes es mayo");
                     break;
                  }
                  case 6:{
                     System.out.println("El mes es junio");
                     break;
                  }
                  case 7:{
                     System.out.println("El mes es julio");
                     break;
                  }
                  case 8:{
                     System.out.println("El mes es agosto");
                     break;
                  }
                  case 9:{
                     System.out.println("El mes es septiembre");
                     break;
                  }
                  case 10:{
                     System.out.println("El mes es octubre");
                     break;
                  }
                  case 11:{
                     System.out.println("El mes es noviembre");
                     break;
                  }
                  case 12:{
                     System.out.println("El mes es diciembre");
                     break;
                  }
               }
            }
         }

         case 11:{
            System.out.println("Ingresa la inicial");
            String letra = scanner.next();
            String minuscula = letra.toLowerCase();
            switch (minuscula) {
               case "l":{
                  System.out.println("Lunes");
                  break;
               }
               case "m":{
                  System.out.println("Martes");
                  break;
               }
               case "x":{
                  System.out.println("Miercoles");
                  break;
               }
               case "j":{
                  System.out.println("Jueves");
                  break;
               }
               case "v":{
                  System.out.println("Viernes");
                  break;
               }
               case "s":{
                  System.out.println("Sabado");
                  break;
               }
               case "d":{
                  System.out.println("Domingo");
                  break;
               }
               default:{
                  System.out.println("Inicial no valida");
               }
            }
         }

         case 12:{
            System.out.println("Ingrese el dia");
            int dia = scanner.nextInt();
            System.out.println("Ingrese el mes del año");
            int mes = scanner.nextInt();
            System.out.println("Ingrese el año");
            int año = scanner.nextInt();

            if(año<=0){
               System.out.println("La fecha no es valida");
            }
            else{
               if(mes <= 0 && mes> 12){
                  System.out.println("La fecha no es valida");
               }
               else{
                  switch (mes) {
                     case 1:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 2:{
                        if(dia<=0 && dia >28){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 3:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 4:{
                        if(dia<=0 && dia >30){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 5:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 6:{
                        if(dia<=0 && dia >30){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 7:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 8:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 9:{
                        if(dia<=0 && dia >30){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 10:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 11:{
                        if(dia<=0 && dia >30){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                     case 12:{
                        if(dia<=0 && dia >31){
                           System.out.println("La fecha no es valida");
                        }
                        else{
                           System.out.println("La fecha es valida");
                        }
                        break;
                     }
                  }
               }
            }
         }
         
      }     
    }
 
    






}