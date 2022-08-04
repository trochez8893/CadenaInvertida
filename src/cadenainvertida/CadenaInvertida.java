package cadenainvertida;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
     

        Scanner token=new Scanner (System.in);
        System.out.print(" Ingrese dato a invertir: ");
        String texto=token.nextLine();
        String dato1="";
        char[] dato2=new char[texto.length()];
      for(int i=texto.length()-1;i>=0; i--){
            char c=texto.charAt(i);
            if(c>=97&&c<=122){
          
                dato1+=c;
            }else {
                dato2[i]=c;
            }
        }
      
         System.out.println("----------------------------------");
         System.out.println( "Su dato invertido es:" +dato1+String.valueOf(dato2));
         
    } }