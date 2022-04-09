
package tiposenumerados;
import java.util.Scanner;

public class enums {
    
    public static void main (String[] args) {
         Scanner sn = new Scanner (System.in);
         System.out.println("Selecciona un producto:");
         String producto= sn.next();
         Catalogo Producto= Catalogo.valueOf(producto.toUpperCase());

        System.out.println(Producto.toString());
    }
    }  

