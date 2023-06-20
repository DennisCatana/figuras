public class trapecio extends cuadrado{
    float altura;
    int angulo;
    int dimensiones;

    public trapecio(String dimencion, int n_lados, String nombre, int t_lado, String area, String base, String perimetro, float altura, int angulo, int dimensiones) {
        super(dimencion, n_lados, nombre, t_lado, area, base, perimetro);
        this.altura = altura;
        this.angulo = angulo;
        this.dimensiones = dimensiones;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }
}
