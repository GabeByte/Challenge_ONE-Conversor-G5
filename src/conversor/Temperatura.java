package conversor;

public enum Temperatura {
    Celsius("Celsius"),
    Farenheit("Farenheit"),
    Kelvin("Kelvin");

    private String nombre;

    private Temperatura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
