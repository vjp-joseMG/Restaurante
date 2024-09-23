
public abstract class Trabajador {
    private String nombre;
    private int edad;

    public Trabajador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract int calcularSalario();

    @Override
    public String toString() {
        return "nombre=" + this.getNombre() + "edad=" + this.getEdad();
    }

}