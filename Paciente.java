import java.time.format.DateTimeFormatter;

public class Paciente extends Persona implements MostrarDatos{

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String codPaciente;
    private boolean confirmar;

    Paciente() { }
    Paciente(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio, String fechaNac, Vacuna vacuna, String codPaciente) {
        super(nombre, apellido, telefono, tipoDoc, codDoc, domicilio, fechaNac,vacuna);
        this.codPaciente = codPaciente;
    }

    public boolean validarMayoriaEdad() {
        return confirmar = getPeriodo().getYears()>= 18;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Mostrando Pacientes...");

    }
    @Override
    public void mostrarDatosEspecifico() {
        System.out.println("Mostrando paciente en especifico...");

    }
}