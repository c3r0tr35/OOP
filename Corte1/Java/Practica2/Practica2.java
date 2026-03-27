public class Proyecto2 {
    public static void main(String[] args) {
        String base = "Hola,soy %s y tengo %s.";
        
        String persona1 = String.format(base, "Lina", "14");
        String persona2 = String.format(base, "Maria", "42");
        String persona3 = String.format(base, "Tomas", "34");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
