// Kata 5: Comportamiento de los Objetos
class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, 100);
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("Combustible insuficiente para el despegue.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }

    public void recargarCombustible(int cantidad) {
        combustible = Math.min(100, combustible + cantidad);
    }

    public void mostrarEstado() {
        System.out.println("Nave " + nombre + " - Combustible: " + combustible + " unidades");
    }
}

