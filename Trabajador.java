public class Trabajador extends Persona implements MostrarDatos{
    private String codTrabajador;

    Trabajador() { }
    Trabajador(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio,String fechaNac, Vacuna vacuna, String codTrabajador) {
        super(nombre,apellido,telefono,tipoDoc,codDoc,domicilio,fechaNac,vacuna);
        this.codTrabajador = codTrabajador;
    }



    @Override
    public void mostrarDatos() {
        System.out.println("Mostrando trabajadores...");
    }
    @Override
    public void mostrarDatosEspecifico() {
        System.out.println("Mostrando trabajadores en especifico...");

    }

}
