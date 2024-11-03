/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
int op=1;
 Scanner scan=new Scanner(System.in);
        Random random= new Random();
        random random1=new random();
         int randomNumber=random.nextInt(10);
           System.out.println("Random number between 0 and 9: "+ randomNumber);

do{
  System.out.println("\n\nQue desea realizar?\n1)Suma de numeros aleatorios\n2)Suma de numeros aleatorios de -100 a 100\n3)Imprimir numeros aleatorios pares\n4)Lanzamiento de dado");
  op=scan.nextInt();
  switch(op){
      case 1:
          System.out.println("");
         System.out.println("Suma de numeros aleatorios ");
          System.out.println("Cuantos numeros aleatorios quieres generar? ");
            int cantidad=scan.nextInt();
            System.out.println("Cual es el rango que quiere generar de sus numeros? ");
          int rango=scan.nextInt();
            random1.SumaRandos(cantidad, rango);
          break;
          
      case 2:
          System.out.println("");
          System.out.println("Suma de numeros aleatorios de -100 a 100");
          System.out.println("Cuantos numeros aleatorios quieres generar? ");
            cantidad=scan.nextInt();
          
            random1.SumaRandos100(cantidad);
          break;
          
      case 3:
          System.out.println("");
          System.out.println("Numeros pares");
          System.out.println("Cuantos numeros aleatorios quieres generar? ");
            cantidad=scan.nextInt();
     random1.RandosPares(cantidad);
          break;
          
      case 4:
          System.out.println("");
                  System.out.println("Lanzamiento de dado");
                  System.out.println("Cuantos numeros lanzamientos de dado quieres generar? ");
            int lanz=scan.nextInt();
            random1.Dado(lanz);
          break;
          
      default:
          System.out.println("");
          System.out.println("Opción no válida");
          break;
          
      case 0:
          System.out.println("");
          System.out.println("Saliendo...");
          break;
  }
}while(op!=0);
    }
     }
    
    

