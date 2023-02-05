
public class ProcesoDeVacunacion {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Carlos","Alberto","987654321","DNI","70784532","Callao","11/01/2004",new  Vacuna("123","24","Pfizer",12,2021),"123456");
        System.out.println(p1.validarMayoriaEdad());
        p1.mostrarDatos();
        p1.mostrarDatosEspecifico();
        System.out.println(p1.getVacuna().getMarca());
        System.out.println(p1.getVacuna().validarVigencia());


        Trabajador t1 = new Trabajador("Jose","Benito","123456789","Pasaporte Ext.","12345","Los Olivos","12/07/1900",new  Vacuna("123","24","Astrazeneca",12,2001),"A102");
        t1.mostrarDatos();
        t1.mostrarDatosEspecifico();
        System.out.println(t1.getVacuna().getMarca());
        System.out.println(t1.getVacuna().validarVigencia());

    }
}