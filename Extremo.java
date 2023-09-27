public class Extremo extends Jugador {
    private int pases;
    private int asistencias_e;
    private float efectividad;

    public Extremo(String nombre, String pais, int faltas, int goles_d, int total_lanzamientos, int pases, int asistencias_e) {
        super.setNombre(nombre);
        super.setPais(pais);
        super.setFaltas(faltas);
        super.setGoles_d(goles_d);
        super.setTotal_lanzamientos(total_lanzamientos);
        this.pases = pases;
        this.asistencias_e = asistencias_e;
        this.efectividad = (float) ((((pases + asistencias_e - faltas) * 100) / (pases + asistencias_e + faltas)) + ((goles_d * 100) / total_lanzamientos));
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getPases() {
        return pases;
    }

    public void setAsistencias_e(int asistencias_e) {
        this.asistencias_e = asistencias_e;
    }

    public int getAsistencias_e() {
        return asistencias_e;
    }

    public float getEfectividad() {
        return efectividad;
    }
}
