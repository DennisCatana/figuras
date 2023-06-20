public class FIGURAS {
    private String dimencion;
    private int n_lados;


    public FIGURAS(String dimencion, int n_lados) {
        this.dimencion = dimencion;
        this.n_lados = n_lados;
    }

    public String getDimencion() {
        return dimencion;
    }

    public void setDimencion(String dimencion) {
        this.dimencion = dimencion;
    }

    public int getN_lados() {
        return n_lados;
    }

    public void setN_lados(int n_lados) {
        n_lados = n_lados;
    }
}
