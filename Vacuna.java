import java.time.LocalDate;

public class Vacuna extends Persona {

    private String kit;
    private String lote;
    private String marca;
    private int mesExp;
    private int anioExp;
    private boolean confirmar;
    final int VIGENCIAVACUNA = 3;



    Vacuna() { }
    Vacuna(String kit, String lote, String marca, int mesExp, int anioExp) {
        this.kit = kit;
        this.lote = lote;
        this.marca = marca;
        this.mesExp = mesExp;
        this.anioExp = anioExp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean validarVigencia() {
        return confirmar = LocalDate.now().getYear() - anioExp < VIGENCIAVACUNA;
    }

}
