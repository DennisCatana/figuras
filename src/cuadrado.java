public class cuadrado extends cuadrilatero {
    String area;
    String base;
    String perimetro;

    public cuadrado(String dimencion, int n_lados, String nombre, int t_lado, String area, String base, String perimetro) {
        super(dimencion, n_lados, nombre, t_lado);
        this.area = area;
        this.base = base;
        this.perimetro = perimetro;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }
}
