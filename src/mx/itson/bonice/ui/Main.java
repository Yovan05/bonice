
package mx.itson.bonice.ui;

import java.util.Scanner;

/**
 *Inicia el programa y determina si es un palindromo
 * @author alexi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el texto a evaluar");
        
        String oracion = leer.nextLine();
        
        String formato = oracion.toLowerCase().replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace("!", "").replace("¡", "").replace(",", "");
        
        int numCaracteres = formato.length()-1;
        
        char[] caracteres = formato.toCharArray();
        
        String union = "";
        
        for(char i: caracteres){
            int posicion = numCaracteres--;
            char h = caracteres[posicion];
            String caracter =String.valueOf(h);
            union +=caracter;
            if(posicion==0){
                if(formato.equals(union)){
                    System.out.println("Es un palindromo");
                }else{
                    System.out.println("No es un palindromo");
                }
            }
            
        }
    }
    
}
