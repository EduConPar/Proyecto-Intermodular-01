package proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        Scanner teclado = new Scanner(System.in);

        while (value != 5) {
            System.out.println("--- Elige un valor ---");
            System.out.println("1. Crear Reseña");
            System.out.println("2. Mostrar Reseñas");
            System.out.println("3. Editar Reseña");
            System.out.println("4. Eliminar Reseña");
            System.out.println("5. Salir");
            value = teclado.nextInt();
            teclado.nextLine();

            if (value == 1) {
                System.out.print("Ingrese el nombre del autor: ");
                String autor = teclado.nextLine();
                System.out.print("Elije la película para crear su reseña: ");
                String tituloBuscado = teclado.nextLine();
                System.out.print("Ingrese la reseña: ");
                String textoReseña = teclado.nextLine();
                System.out.print("Ingrese la puntuación (1-5): ");
                int puntuacion = teclado.nextInt();
                teclado.nextLine();

                reseñas nuevaReseña = new reseñas(autor, textoReseña, puntuacion);
                pelicula peliculaElegida = new pelicula(tituloBuscado, tituloBuscado, value);
                peliculaElegida.getReseñas().add(nuevaReseña);
                System.out.println("Reseña añadida correctamente.");
            }

            if (value == 2) {
                System.out.print("Elije la película para mostrar sus reseñas: ");
                String tituloBuscado = teclado.nextLine();
                pelicula peliculaElegida = new pelicula(tituloBuscado, tituloBuscado, value);

                if (tituloBuscado.equals(peliculaElegida.getTitulo())) {
                    System.out.println("Reseñas de la película " + peliculaElegida.getTitulo() + ":");
                    for (reseñas r : peliculaElegida.getReseñas()) {
                        System.out.println("Autor: " + r.getNombre());
                        System.out.println("Reseña: " + r.getComentario());
                        System.out.println("Puntuación: " + r.getCalificacion());
                        System.out.println("Fecha: " + r.getFecha());
                        System.out.println("--------------------");
                    }
                } else {
                    System.out.println("Película no encontrada.");
                }
            }

            if (value == 3) {
                System.out.print("Elije la película para editar su reseña: ");
                String tituloBuscado = teclado.nextLine();
                pelicula peliculaElegida = new pelicula(tituloBuscado, tituloBuscado, value);
                if (tituloBuscado.equals(peliculaElegida.getTitulo())) {
                    System.out.print("Ingrese el nombre del autor de la reseña a editar: ");
                    String autor = teclado.nextLine();
                    for (reseñas r : peliculaElegida.getReseñas()) {
                        if (r.getNombre().equals(autor)) {
                            System.out.print("Ingrese la nueva reseña: ");
                            String nuevaReseña = teclado.nextLine();
                            r.setComentario(nuevaReseña);
                            System.out.print("Ingrese la nueva puntuación (1-5): ");
                            int nuevaPuntuacion = teclado.nextInt();
                            teclado.nextLine();
                            r.setCalificacion(nuevaPuntuacion);
                            System.out.println("Reseña editada correctamente.");
                        }
                    }
                } else {
                    System.out.println("Película no encontrada.");
                }
            }

            if (value == 4) {
                System.out.print("Elije la película para eliminar su reseña: ");
                String tituloBuscado = teclado.nextLine();
                pelicula peliculaElegida = new pelicula(tituloBuscado, tituloBuscado, value);
                if (tituloBuscado.equals(peliculaElegida.getTitulo())) {
                    System.out.print("Ingrese el nombre del autor de la reseña a eliminar: ");
                    String autor = teclado.nextLine();
                    for (reseñas r : peliculaElegida.getReseñas()) {
                        if (r.getNombre().equals(autor)) {
                            peliculaElegida.getReseñas().remove(r);
                            System.out.println("Reseña eliminada correctamente.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Película no encontrada.");
                }
            }

            if (value == 5) {
                break;
            }
        }
    }
}
