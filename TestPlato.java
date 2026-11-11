public class TestPlato {
    public static void main(String[] args) {
        Plato platoA = new Plato();
        platoA.nombre = "Ensalada César";
        platoA.tipo = "Entrante";
        platoA.precio = 8.50;
        platoA.disponible = true;

        System.out.println("Nombre del plato: " + platoA.nombre);
        System.out.println("Tipo: " + platoA.tipo);
        System.out.println("Precio: $" + platoA.precio);
        System.out.println("Disponible: " + platoA.disponible);

        Plato platoB = new Plato();
        platoB.nombre = "Pollo a la Parrilla";
        platoB.tipo = "Principal";
        platoB.precio = 15.00;
        platoB.disponible = false;

        System.out.println("Nombre del plato: " + platoB.nombre);
        System.out.println("Tipo: " + platoB.tipo);
        System.out.println("Precio: $" + platoB.precio);
        System.out.println("Disponible: " + platoB.disponible);

        Plato platoC = new Plato();
        platoC.nombre = "Tarta de Queso";
        platoC.tipo = "Postre";
        platoC.precio = 6.00;
        platoC.disponible = true;

        System.out.println("Nombre del plato: " + platoC.nombre);
        System.out.println("Tipo: " + platoC.tipo);
        System.out.println("Precio: $" + platoC.precio);
        System.out.println("Disponible: " + platoC.disponible);
    }
}
