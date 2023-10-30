/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Piero
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Titanic", "Drama", "+12", "No");
	Pelicula pelicula2 = new Pelicula("Toy Story", "Fantasia", "APT", "Si");
	
	ArrayList <Pelicula> peliculas = new ArrayList<>();
	peliculas.add(pelicula1);
	peliculas.add(pelicula2);
	
	Scanner leer = new Scanner(System.in);
	
	while(true){
	    System.out.println("¡Bienvenido!");
	    System.out.println("****************** / Administración de peliculas / ******************");
	    System.out.println("Selecciona una opcion:");
	    System.out.println("1. Agregar pelicula");
	    System.out.println("2. Eliminar pelicula");
	    System.out.println("3. Buscar pelicula");
	    System.out.println("4. Mostrar todas las peliculas");
	    System.out.println("5. Salir");
	    int opcion = leer.nextInt();
	    leer.nextLine();
	    
	    switch(opcion){
	        case 1 -> {
                    System.out.println("Ingrese el titulo de la pelicula");
                    String titulo = leer.nextLine();
                    System.out.println("Ingrese el genero de la pelicula");
                    String genero = leer.nextLine();
                    System.out.println("Ingrese la clasificacion de la pelicula");
                    String clasificacion = leer.nextLine();
                    System.out.println("¿La pelicula está en cartelera?");
                    String cartelera = leer.nextLine();
                    Pelicula nuevaPelicula = new Pelicula(titulo, genero, clasificacion, cartelera);
                    peliculas.add(nuevaPelicula);
                    System.out.println("Pelicula agrega con éxito");
                }
	        case 2 -> {
                    System.out.println("Ingrese el título de la película a eliminar");
                    String tituloEliminado = leer.nextLine();
                    for (Pelicula pelicula : peliculas){
                        if (pelicula.getTitulo().equals(tituloEliminado)){
                            peliculas.remove(pelicula);
                            System.out.println("Pelicula eliminada con éxito");
                            break;
                        }
                    }
                }
	        case 3 -> {
                    System.out.println("Ingrese el título de la película a buscar");
                    String tituloBuscar = leer.nextLine();
                    for (Pelicula pelicula : peliculas){
                        if (pelicula.getTitulo().equals(tituloBuscar)){
                            System.out.println(pelicula);
                        }
                    }
                }
	        case 4 -> {
                    System.out.println("Peliculas registradas");
                    for (Pelicula pelicula : peliculas){
                        System.out.println(pelicula);
                    }
                }
	        case 5 -> {
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                }
	        default -> System.out.println("Elige una opcion válida");
	    }
	}
    }
    
}
