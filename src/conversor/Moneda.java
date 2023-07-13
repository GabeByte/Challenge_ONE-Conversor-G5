package conversor;

public enum Moneda {
    USD(811.59, "Dolares"),
    EUR(903.32, "Euros"),
    GBP(1054.18, "Libras esterlinas"),
    JPY(5.86, "Yenes japonés"),
    CLP(0, "Pesos Chilenos"),
    KRW(0.64, "Wons surcoreano");

    private double tasaConversion;
    private String nombre;

    private Moneda(double tasaConversion, String nombre) {
        this.tasaConversion = tasaConversion;
        this.nombre = nombre;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    public String getNombre() {
        return nombre;
    }
}

