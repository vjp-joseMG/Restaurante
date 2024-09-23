public class Camarero extends Trabajador {
    private int salario;
    private int horasTrabajadas;
    private int euroHora;

    public Camarero(int salario, int horasTrabajadas, String nombre, int edad, int euroHora) {
        super(nombre, edad);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
        this.euroHora = euroHora;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public int calcularSalario() {
        salario = euroHora * horasTrabajadas;
        return salario;
    }

    public int getEuroHora() {
        return this.euroHora;
    }

    public void setEuroHora(int euroHora) {
        this.euroHora = euroHora;
    }


    @Override
    public String toString() {
        String padre = super.toString();

        return "{"+padre +
            " salario='" + getSalario() + "'" +
            ", horasTrabajadas='" + getHorasTrabajadas() + "'" +
            ", euroHora='" + getEuroHora() + "'" +
            "}";
    }


}