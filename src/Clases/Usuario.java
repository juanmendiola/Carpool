
package Clases;

public class Usuario {
    private String pago;
    private String trayecto;
    private String fecha;
    private String hora;
    private String barrio;
    private String municipio;
    private int id_usuario;
    public Usuario(){   
    }
    public Usuario(String Pago, String Trayecto, String fecha, String hora,String barrio, String municipio, int id_usuario) {
        this.pago = Pago;
        this.trayecto = Trayecto;
        this.fecha = fecha;
        this.hora = hora;
        this.barrio = barrio;
        this.municipio = municipio;
        this.id_usuario = id_usuario;
        }
    public String getPago() {
        return pago;
    }

    public void setPago(String Pago) {
        this.pago = Pago;
    }
    public String getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(String Trayecto) {
        this.trayecto = Trayecto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
     public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

}
