// Kata 1: Registro de Estudiantes
class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(apellido + " " + nombre + " - " + curso + " - Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion = Math.min(10, calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        calificacion = Math.max(0, calificacion - puntos);
    }
}
