package ejerciciouno;

import java.util.Scanner;
public class EjercicioUno {

    public static void main(String[] args) {
        
       int distancia =0;
       int dias =0;
        
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese distancia a recorrer");
       distancia = leer.nextInt();
       
       System.out.println("Ingrese dias de estancia");
       dias = leer.nextInt();
       
       PasajeAvion boleto = new  PasajeAvion(distancia, dias);
       
       System.out.println("El valor del vuelo es: " + boleto.getVrVuelo());
       
    }
    
}
