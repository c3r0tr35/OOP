import java.util.Scanner;

class Persona {
    // Atributos (Variables)
    String nombre;
    int edad;

    // Método (Función)
    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear el primer objeto
        Persona p1 = new Persona();
        p1.nombre = "Ana";
        p1.edad = 20;
        p1.saludar();

        // Crear el segundo objeto
        Persona p2 = new Persona();
        p2.nombre = "Lina";
        p2.edad = 23;
        p2.saludar();

        // Crear el tercer objeto
        Persona p3 = new Persona();
        p3.nombre = "Zach";
        p3.edad = 32;
        p3.saludar();
    }
}