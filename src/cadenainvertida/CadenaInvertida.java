package cadenainvertida;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
     

        Scanner token=new Scanner (System.in);
        System.out.print(" Ingrese dato a invertir: ");
        String texto=token.nextLine().toUpperCase();
        String aux1="";
        char[] aux2=new char[texto.length()];
      for(int i=texto.length()-1;i>=0; i--){
            char c=texto.charAt(i);
            if(c>=65&&c<=90){
                aux1+=c;
            }else {
                aux2[i]=c;
            }
        }
        
         System.out.println("----------------------------------");
         System.out.println( "Su dato invertido es:" +aux1+String.valueOf(aux2));
        
    } }