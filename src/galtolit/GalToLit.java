/*
 * Este programa convierte galones a litros.
 * Asigne el nombre GalToLit a este programa.
 */
package galtolit;

/**
 * @author karlosc
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons, liters;
        
        gallons = 10;
        liters = gallons * 3.7854; //Conversión a litros
        
        System.out.println(gallons +"gallons is "+liters+" liters." );
    }
}