/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2ramas;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class ClaseB {
    public ClaseB(){}
    
    public void suma(){
        Scanner ler= new Scanner(System.in);
        float sumar1, sumar2, resultado;
            System.out.println("Introduzca numero1 a sumar");
            sumar1=ler.nextFloat();
            System.out.println("Introduzca numero2 a sumar");
            sumar2=ler.nextFloat();
            resultado=sumar1+sumar2;
            System.out.println("El resultado de la suma es= "+resultado);
    }
}
