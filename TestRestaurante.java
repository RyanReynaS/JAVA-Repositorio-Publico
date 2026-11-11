public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        Restaurante rest2 = new Restaurante();

        // Primera captura: valores por defecto (antes de modificar)
        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println("Restaurante 1:");
        System.out.println("Nombre del restaurante: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);
        System.out.println("Restaurante 2:");
        System.out.println("Nombre del restaurante: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);

        // Modificar los valores de cada restaurante
        rest1.nombre = "La Buena Mesa";
        rest1.direccion = "Calle Principal 123";
        rest1.calificacion = 4.5;

        rest2.nombre = "El Sabroso";
        rest2.direccion = "Avenida Secundaria 456";
        rest2.calificacion = 4.0;

        // Segunda captura: valores modificados (después de asignar)
        System.out.println();
        System.out.println("=== VALORES MODIFICADOS ===");
        System.out.println("Restaurante 1:");
        System.out.println("Nombre del restaurante: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);
        System.out.println("Restaurante 2:");
        System.out.println("Nombre del restaurante: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);
    }
}
