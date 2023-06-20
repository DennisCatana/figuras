public class rectangulo extends cuadrado{
    String lados2;
    String baseD;
    float sumlaR;

    public rectangulo(String dimencion, int n_lados, String nombre, int t_lado, String area, String base, String perimetro, String lados2, String baseD, float sumlaR) {
        super(dimencion, n_lados, nombre, t_lado, area, base, perimetro);
        this.lados2 = lados2;
        this.baseD = baseD;
        this.sumlaR = sumlaR;
    }

    public String getLados2() {
        return lados2;
    }

    public void setLados2(String lados2) {
        this.lados2 = lados2;
    }

    public String getBaseD() {
        return baseD;
    }

    public void setBaseD(String baseD) {
        this.baseD = baseD;
    }

    public float getSumlaR() {
        return sumlaR;
    }

    public void setSumlaR(float sumlaR) {
        this.sumlaR = sumlaR;
    }
}
