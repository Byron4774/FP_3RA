/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author megan
 */
public class EVA3_7_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume = 5;
        System.out.println("Numero original = " + nume);
        incrementar(nume);
        System.out.println("Despues de incrementar = " + nume);
    }
    public static void incrementar(int valor){
        valor = valor + 1;
    }
    
}
