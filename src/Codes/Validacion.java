package Codes;
/*XD*/
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
    
    //Regex Numerico Decimal
    public static boolean numDec(String str) {

        if (Pattern.matches("^[0-9]+\\.{0,1}[0-9]{0,2}", str)) {
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

    public static boolean unicode(String str) {
        if (Pattern.matches(".*", str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean ced2Dig(String str) {
        String val = str.substring(0, 2);
        int dig = Integer.parseInt(val);
        if (dig >= 1 || dig <= 24) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cedVal(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        return cedulaCorrecta;
    }

}
