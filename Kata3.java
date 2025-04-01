// Kata 3: Primeros Pasos en Encapsulamiento
class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void setAñoPublicacion(int nuevoAño) {
        if (nuevoAño >= 1900 && nuevoAño <= java.time.Year.now().getValue()) {
            this.añoPublicacion = nuevoAño;
        } else {
            System.out.println("Año inválido.");
        }
    }
}
