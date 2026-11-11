public class TestRestaurante {
    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        rest1.nombre = "La Buena Mesa";
        rest1.direccion = "Calle Principal 123";
        rest1.calificacion = 4.5;

        System.out.println("Nombre del restaurante: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion);
        
      
        Restaurante rest2 = new Restaurante();
        rest2.nombre = "El Sabroso";
        rest2.direccion = "Avenida Secundaria 456";
        rest2.calificacion = 4.0;

        System.out.println("Nombre del restaurante: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion);
    
    }
}
