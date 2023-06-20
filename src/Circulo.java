public class Circulo extends circunferencia{
    float area;
    float diametro;

    public Circulo(String dimencion, int n_lados, String nombre, int radio, int arco, float area, float diametro) {
        super(dimencion, n_lados, nombre, radio, arco);
        this.area = area;
        this.diametro = diametro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
}
