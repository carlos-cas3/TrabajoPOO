import java.util.ArrayList;
import java.util.Iterator;

public class ProcesoDeVacunacion {
    public static void main(String[] args) {
        ArrayList<Persona> listapersonas = new ArrayList<>();

        listapersonas.add(new Paciente("Carlos","Alberto","987654321","DNI","70784532","Callao","11/01/2004",new  Vacuna("123","24","Pfizer",12,2021),"123456"));
        listapersonas.add(new Trabajador("Jose","Benito","123456789","Pasaporte Ext.","12345","Los Olivos","12/07/1900",new  Vacuna("123","24","Astrazeneca",12,2001),"A102"));

        Iterator<Persona> itp = listapersonas.iterator();
        while(itp.hasNext()) {

            String nombre_personas = itp.next().getNombre();
            System.out.println(nombre_personas);
        }

    }
}