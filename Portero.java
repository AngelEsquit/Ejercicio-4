public class Portero extends Jugador {
    private int paradas_e;
    private int goles_r;
    private Float efectividad;

    public Portero(String nombre, String pais, int faltas, int goles_d, int total_lanzamientos, int paradas_e, int goles_r) {
        super.setNombre(nombre);
        super.setPais(pais);
        super.setFaltas(faltas);
        super.setGoles_d(goles_d);
        super.setTotal_lanzamientos(total_lanzamientos);
        this.paradas_e = paradas_e;
        this.goles_r = goles_r;
        this.efectividad = (float) ((((paradas_e - goles_r) * 100) / (paradas_e + goles_r)) + ((goles_d * 100) / total_lanzamientos));
    }

    public void setParadas_e(int paradas_e) {
        this.paradas_e = paradas_e;
    }

    public int getParadas_e() {
        return paradas_e;
    }

    public void setGoles_r(int goles_r) {
        this.goles_r = goles_r;
    }

    public int getGoles_r() {
        return goles_r;
    }
}
