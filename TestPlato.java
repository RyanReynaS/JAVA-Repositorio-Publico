public class TestPlato {
    public static void main(String[] args) {
        Plato platoA = new Plato();
        Plato platoB = new Plato();
        Plato platoC = new Plato();

        // Primera captura: valores por defecto (antes de modificar)
        System.out.println("=== VALORES POR DEFECTO ===");
        System.out.println("Plato A:");
        System.out.println("Nombre del plato: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);
        System.out.println("Plato B:");
        System.out.println("Nombre del plato: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);
        System.out.println("Plato C:");
        System.out.println("Nombre del plato: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);

        // Modificar los atributos de cada plato
        platoA.nombre = "Ensalada César";
        platoA.tipo = "Entrante";
        platoA.precio = 8.50;
        platoA.disponible = true;

        platoB.nombre = "Pollo a la Parrilla";
        platoB.tipo = "Principal";
        platoB.precio = 15.00;
        platoB.disponible = false;

        platoC.nombre = "Tarta de Queso";
        platoC.tipo = "Postre";
        platoC.precio = 6.00;
        platoC.disponible = true;

        // Segunda captura: valores modificados (después de asignar)
        System.out.println();
        System.out.println("=== VALORES MODIFICADOS ===");
        System.out.println("Plato A:");
        System.out.println("Nombre del plato: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);
        System.out.println("Plato B:");
        System.out.println("Nombre del plato: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);
        System.out.println("Plato C:");
        System.out.println("Nombre del plato: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);
    }
}
