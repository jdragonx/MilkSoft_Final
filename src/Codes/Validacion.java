
package Codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
    



    
        public static void counter (String str){
        int count =0;
                for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) != ' ')    
                count++;  
            
        }    
                System.out.print("\nValidation C: "+count);
 
    }
        //Regex Alfanumerico + Espacio
        public static boolean alfnumesp(String str){
            
            if (Pattern.matches("^[a-zA-Z ]*", str)){
            return true;
        }else{
            return false;
        }
            
        }
        
        //Regex Alfanumerico
        //Regex Alfanumerico + Espacio
        public static boolean alfnum(String str){
            
            if (Pattern.matches("^[a-zA-Z]*", str)){
            return true;
        }else{
            return false;
        }
            
        }
        
        
        //Regex Numerico
        public static boolean num(String str){
            
            if (Pattern.matches("^[0-9]*", str)){
            return true;
        }else{
            return false;
        }
 
        }
        
        //Regex Direccion
        public static boolean direccion(String str){
            
            if (Pattern.matches("^[a-zA-Z-.]*", str)){
            return true;
        }else{
            return false;
        }
            
        }
        
     
}
    
    
 