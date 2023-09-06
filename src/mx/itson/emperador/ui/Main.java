/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.emperador.ui;

import java.util.Scanner;

/**
 * En este proyecto usamos el la funcion split para separar una cadena de texto, tambien utilizamos
 * la funcion lenght para encontar los espacios en blanco de donde queramos extraer el dato. 
 * @author Jesus Espericueta
 * 
 */
public class Main {
       public static void main(String[] args){
       
        // Usamos la clase Scanner para leer la entrada desde la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los datos de los alumnos que quieres separar por ID, Primer nombre y Primer apellido:");
        
        // Leemos la cadena de texto ingresada por el usuario
        String cadena = scanner.nextLine();
       
        // Dividimos la cadena en elementos usando la coma como delimitador
        String[] elementos = cadena.split(",");
        
        // Buscamos a través de los elementos separados
        for (String elemento : elementos) {
            /*
             Eliminamos espacios en blanco al principio y al final 
            de cada elemento antes de dividirlo asegurandonos que no queden espacios innecesarios
            */
 
            elemento = elemento.trim();
            
            //  Usamos un array de strings para separa la cadena con el metodo split en cada lugar donde encuentra un espacio en blanco.
            String[] partes = elemento.split(" ");
            
            // Utilizamos la funcion length para verificar que haya al menos cuatro espacios antes de continuar 
            if (partes.length >= 4) {
                // Extraemos el ID, primer apellido y primer nombre del elemento
                String id = partes[0];
                String primerNombre = partes[3];
                String primerApellido = partes[1];
                
                // Imprimimos los resultados
                System.out.println("ID: " + id);
                System.out.println("Primer Nombre: " + primerNombre);
                System.out.println("Primer Apellido: " + primerApellido);
                System.out.println();
            }
        }
           
       }             
}
