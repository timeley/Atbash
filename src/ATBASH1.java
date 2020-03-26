
import java.util.Scanner;

public class ATBASH1 {

    private static Scanner in;
    public static void main(String[] args){
        in = new Scanner(System.in);
       
        String abcedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcInverso = "";
        // COLOCAR EL ABECEDARIO AL REVEZ
        
        for (int i = abcedario.length()-1; i > -1; i--) {
            abcInverso += abcedario.charAt(i);
        }

        System.out.print("Ingresa Mensaje: ");
        String mensaje = in.nextLine();
        
        mensaje = mensaje.toUpperCase();

        String TextoDescifrado = "";
        for (int i = 0; i < mensaje.length(); i++) {
            if(mensaje.charAt(i) == (char)32){
                
            } else {
                for (int j = 0; j < abcInverso.length(); j++) {
                    if (mensaje.charAt(i) == abcInverso.charAt(j)){
                        TextoDescifrado += abcedario.charAt(j);
                        
                    }
                } 
            } 
        }

        System.out.println("El texto descifrado es: " + TextoDescifrado);
    }


}