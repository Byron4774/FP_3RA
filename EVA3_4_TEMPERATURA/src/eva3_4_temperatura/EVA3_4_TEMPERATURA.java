/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA3_4_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int valor;
        do{
            imprimirMenu();
            valor = input.nextInt();
            
            switch(valor){
                case 1:
                    System.out.println("*****Fahr a Celc*****");
                    convertirFarCelcius();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("*****Kelv a Celc*****");
                    convertirKelCelcius();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("*****Celc a Fahr*****");
                    convertirCelFahrenheit();
                    System.out.println("");
                    break;
            }
        }while(valor != 4);
        
        if(valor == 4){
            System.out.println("Hasta Pronto.");
        }
        
    }
    public static void imprimirMenu(){
        System.out.println("Bienvenido al sistema.");
        System.out.println("Elige la opcion que necesitas");
        System.out.println("1. Convertir de Fahrenheit a Celcius");
        System.out.println("2. Convertir de Kelvin a Celcius");
        System.out.println("3. Convertir de Celcius a Fahrenheit");
        System.out.println("4. Terminar");
    }
    public static void convertirFarCelcius(){
        Scanner input = new Scanner(System.in);
        double fahr, resu;
        System.out.println("Grados fahrenheit");
        fahr = input.nextDouble();
        resu = convertirFarCelcius(fahr);
        System.out.println(fahr + " Fahrenheit = " + resu);
       
    }
    public static double convertirFarCelcius(double fahr){
        double resu = (fahr - 32) / 1.8;
        return resu;
    }
    public static void convertirKelCelcius(){
        Scanner input = new Scanner(System.in);
        double resu, kelv;
        System.out.println("Grados kelvin");
        kelv = input.nextDouble();
        resu = convertirKelCelcius(kelv);
        System.out.println(kelv + " Kelvin = " + resu);
    }
    public static double convertirKelCelcius(double kelv){
        double resu = (kelv -273.15);
        return resu;
    }
    
    public static void convertirCelFahrenheit(){
        Scanner input = new Scanner(System.in);
        double resu, celc;
        System.out.println("Grados celcius");
        celc = input.nextDouble();
        resu = convertirCelFahrenheit(celc);
        System.out.println(celc + " Celcius = " + resu);
    }
    public static double convertirCelFahrenheit(double celc){
        double resu = (((9* celc)/5) + 32);
        return resu;
    }
    
}
