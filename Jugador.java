public class Jugador {
    private String nombre;
    private String pais;
    private int faltas;
    private int goles_d;
    private int total_lanzamientos;
    private Float efectividad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setGoles_d(int goles_d) {
        this.goles_d = goles_d;
    }

    public int getGoles_d() {
        return goles_d;
    }

    public void setTotal_lanzamientos(int total_lanzamientos) {
        this.total_lanzamientos = total_lanzamientos;
    }

    public int getTotal_lanzamientos() {
        return total_lanzamientos;
    }

    public void calcularEfectividad() {
        this.efectividad = efectividad;
    }

    public Float getEfectividad() {
        return efectividad;
    }
}
