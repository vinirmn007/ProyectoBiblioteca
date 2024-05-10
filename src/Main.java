import Publicaciones.Libro;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El señor de los anillos");
        System.out.println(libro.getNombre());
    }
}