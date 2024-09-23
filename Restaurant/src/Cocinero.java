public class Cocinero extends Trabajador{
    private int salario;
    private int horasTrabajadas;

    public Cocinero(int salario, int horasTrabajadas, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
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
        int euroHora = 20;
        salario = euroHora * horasTrabajadas;
        return salario;
    }


    @Override
    public String toString() {
        String padre = super.toString();
        return padre + "{" +
            " salario='" + getSalario() + "'" +
            ", horasTrabajadas='" + getHorasTrabajadas() + "'" +
            "}";
    }

    
}