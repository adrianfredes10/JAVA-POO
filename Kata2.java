// Kata 2: Registro de Mascotas
class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - " + especie + " - " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
    }
}