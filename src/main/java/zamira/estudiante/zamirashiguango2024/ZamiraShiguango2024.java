/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package zamira.estudiante.zamirashiguango2024;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ZamiraShiguango2024 {

    public static void main(String[] args) {

       /* float[] notas = new float[5];

        float promedioNota;
        float notaAlta;
        float notaBaja;
    

        Scanner zamira = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("ingre la nota de los estudiantes: ");
            notas[i] = zamira.nextFloat();

        }
        int menu = zamira.nextInt();
        do{

        System.out.println("Selecione ");
        System.out.println("1. calcula promedio");
        System.out.println("2. calcula nota mas alta y mas baja");
        System.out.println("3. aprobados y reprobados");
        System.out.println("4. salir");

        

        switch (menu) {

            case 1:
                float suma = 0;
                for (int i = 0; i < 5; i++) {
                    suma = notas[i] + suma;
                }
                promedioNota = suma / 5;

                System.out.println("el promedio es: " + promedioNota);

                break;

            case 2:
                System.out.println("Opcion 2");
                notaAlta = notas[0];
                notaBaja = notas[0];

                for (int i = 1; i < 5; i++) {
                    if (notas[i] > notaAlta ) {
                        notaAlta = notas[i];
                    }
                if (notas[i] < notaBaja ) {
                        notaBaja = notas[i];
                    }

                }
                System.out.println("La nota mas Alta es : "+notaAlta);
                System.out.println("La nota mas Baja es : "+notaBaja);
                break;

            case 3:
                System.out.println("Opcion 3");
                
               int contadorAprobados = 0; 
               int contadorDesaprobado= 0;
                
                for (int i = 0; i < 5; i++) {
                    if (notas[i] >= 70 ) {
                        contadorAprobados++;
                    }
                    else{
                    contadorDesaprobado++;
                    }
                }
                break;

            case 4:
                System.out.println("salir ");
                break;

            default:
                System.out.println("Opcion no valida intentolo de nuevo");
                break;
        
                
        }
        
        } 
        while(menu != 4);
*/
       
       
       
        float[] productos = new float[5];

        float promedioProductos;
        float productosAlta;
        float productosBaja;
    

        Scanner zamira = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("ingre la nota de los estudiantes: ");
            productos[i] = zamira.nextFloat();

        }
        int menu = zamira.nextInt();
        do{

        System.out.println("Selecione ");
        System.out.println("1. calcula promedio");
        System.out.println("2. calcula nota mas alta y mas baja");
        System.out.println("3. aprobados y reprobados");
        System.out.println("4. salir");

        

        switch (menu) {

            case 1:
                float suma = 0;
                for (int i = 0; i < 5; i++) {
                    suma = productos[i] + suma;
                }
                promedioProductos = suma / 5;

                System.out.println("el promedio es: " + promedioProductos);

                break;

            case 2:
                System.out.println("Opcion 2");
                productosAlta = productos[0];
                productosBaja = productos[0];

                for (int i = 1; i < 5; i++) {
                    if (productos[i] > productosAlta ) {
                        productosAlta = productos[i];
                    }
                if (productos[i] < productosBaja ) {
                        productosBaja = productos[i];
                    }

                }
                System.out.println("La nota mas Alta es : "+productosAlta);
                System.out.println("La nota mas Baja es : "+productosBaja);
                break;

            case 3:
                System.out.println("Opcion 3");
                
               int contadorAprobados = 0; 
               int contadorDesaprobado= 0;
                
                for (int i = 0; i < 5; i++) {
                    if (productos[i] >= 70 ) {
                        contadorAprobados++;
                    }
                    else{
                    contadorDesaprobado++;
                    }
                }
                break;

            case 4:
                System.out.println("salir ");
                break;

            default:
                System.out.println("Opcion no valida intentolo de nuevo");
                break;
        
                
        }
        
        } 
        while(menu != 4);
    }
}
