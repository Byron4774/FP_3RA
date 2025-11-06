/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author megan
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu = calcularCuadrado(100);
        System.out.println("El cuadrado de 4 es " + resu);
        System.out.println("El cuadrado de 4 es " + calcularCuadrado(4));
        calcularCuadrado(4);
    }
    public static int calcularCuadrado(int num){
     int cuadrado = num * num;
     return cuadrado;
        
    }

}
