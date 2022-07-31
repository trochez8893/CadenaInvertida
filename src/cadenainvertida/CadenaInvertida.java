package cadenainvertida;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
     

        Scanner teclado=new Scanner (System.in);
        System.out.print(" Ingrese dato a invertir: ");
        String texto=teclado.nextLine();
        
        String invertir="";
        for(int indice=texto.length()-1;indice >=0; indice--){
            invertir +=texto.charAt(indice);
        }
        System.out.println("Dato original ingresado es:" + texto);
         System.out.println("----------------------------------");
         System.out.println("Dato invertido  es: " + invertir);
        
    } }