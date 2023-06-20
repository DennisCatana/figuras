public class Triangulos extends FIGURAS{
    private String nombre;
    private int altura;
    private int base;

    public Triangulos(String dimencion, int n_lados, String nombre, int altura, int base) {
        super(dimencion, n_lados);
        this.nombre = nombre;
        this.altura = altura;
        this.base = base;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
