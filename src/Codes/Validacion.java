package Codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    public static int counter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }

        }
        return count;
    }
    //Regex Alfanumerico + Espacio

    public static boolean alfesp(String str) {

        if (Pattern.matches("^[a-zA-Z ]*", str)) {
            return true;
        } else {
            return false;
        }

    }

    //Regex Alfanumerico
    public static boolean alf(String str) {

        if (Pattern.matches("^[a-zA-Z]*", str)) {
            return true;
        } else {
            return false;
        }

    }

    //Regex Numerico
    public static boolean num(String str) {

        if (Pattern.matches("^[0-9]*", str)) {
            return true;
        } else {
            return false;
        }

    }

    //Regex Direccion
    public static boolean direccion(String str) {

        if (Pattern.matches("^[a-zA-Z-.]*", str)) {
            return true;
        } else {
            return false;
        }

    }

}
