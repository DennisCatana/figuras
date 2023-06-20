public class circunferencia extends FIGURAS{
    private String nombre;
    private int radio;
    private int arco;

    public circunferencia(String dimencion, int n_lados, String nombre, int radio, int arco) {
        super(dimencion, n_lados);
        this.nombre = nombre;
        this.radio = radio;
        this.arco = arco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getArco() {
        return arco;
    }

    public void setArco(int arco) {
        this.arco = arco;
    }
}
