/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO1PC;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class pc1ejercicio {
     public static void main(String[] args) {
         
        
         int numeroFinalKPH;
         try{
             Scanner scanner = new Scanner ( System.in);
             System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
            numeroFinalKPH = scanner.nextInt();

            if (numeroFinalKPH <= 60 || numeroFinalKPH % 10 != 0) {
                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
                System.exit(0);
            }

            System.out.println("KPH\t\tMPH");
            System.out.println("-------------------");

            for (int kph = 60; kph <= numeroFinalKPH; kph += 10) {
                double mph = kph * 0.6214;
                System.out.printf("%d\t\t%.1f\n", kph, mph);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número válido.");
        }
    }
         }
         
     

