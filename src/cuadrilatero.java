public class cuadrilatero extends FIGURAS{
    private String Nombre;
    private int T_lado;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getT_lado() {
        return T_lado;
    }

    public void setT_lado(int t_lado) {
        T_lado = t_lado;
    }

    public cuadrilatero(String dimencion, int n_lados, String nombre, int t_lado) {
        super(dimencion, n_lados);
        Nombre = nombre;
        T_lado = t_lado;
    }
}

