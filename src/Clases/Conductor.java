
package Clases;

public class Conductor {

    private String trayectoC;
    private String fechaC;
    private String horaC;
    private String barrioC;
    private String municipioC;
    private int id_usuario;

    public Conductor() {
    }

    public Conductor(String Trayecto, String fecha, String hora,String barrio, String municipio, int id_usuario) {
        this.trayectoC = Trayecto;
        this.fechaC = fecha;
        this.horaC = hora;
        this.barrioC = barrio;
        this.municipioC = municipio;
        this.id_usuario = id_usuario;
    }
    public String getTrayecto() {
        return trayectoC;
    }

    public void setTrayecto(String Trayecto) {
        this.trayectoC = Trayecto;
    }

    public String getFecha() {
        return fechaC;
    }

    public void setFecha(String fecha) {
        this.fechaC = fecha;
    }

    public String getHora() {
        return horaC;
    }

    public void setHora(String hora) {
        this.horaC = hora;
    }
     public String getBarrio() {
        return barrioC;
    }

    public void setBarrio(String barrio) {
        this.barrioC = barrio;
    }
    public String getMunicipio() {
        return municipioC;
    }

    public void setMunicipio(String municipio) {
        this.municipioC = municipio;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
}
