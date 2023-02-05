import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String tipoDoc;
    private String codDoc;
    private String domicilio;
    private String fechaNac;  // para fecha usado en la misma
    private LocalDate lc; // para fecha usado en la misma
    private Period periodo;

    private Vacuna vacuna;


    //private Date fechaNac;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate ahora = LocalDate.now();

    Persona() { }
    Persona(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio,String fechaNac,Vacuna vacuna) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDoc = tipoDoc;
        this.codDoc = codDoc;
        this.domicilio = domicilio;
        this.vacuna = vacuna;

        lc = LocalDate.parse(fechaNac,fmt);
        periodo = Period.between(lc, ahora);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

   public String getFechaNac() {
       return periodo.getDays() + "/" +  periodo.getMonths()+ "/" + periodo.getYears();
    }


    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
        lc = LocalDate.parse(fechaNac,fmt);
        periodo = Period.between(lc, ahora);
    }
    public Vacuna getVacuna() {
        return vacuna;
    }
    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }

    public Period getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Period periodo) {
        this.periodo = periodo;
    }
}
