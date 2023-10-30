/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

/**
 *
 * @author Piero
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private String clasificacion;
    private String cartelera;

    public Pelicula(String titulo, String genero, String clasificacion, String cartelera) {
        this.titulo = titulo;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.cartelera = cartelera;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getCartelera() {
        return cartelera;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nGenero: " + genero + "\nClasificación: " + clasificacion + "\nCartelera: "+ cartelera + "\n";
    }
}
