package com.example.generadordeinformes.clases;

public class FinOperativo extends InicioOperativo {
    private int controlados;
    private int infraccionados;
    private int licenciasRetenidas;
    private int vehiculosRetenidos;
    private String motivos;
    private String graduaciones;

    public FinOperativo(String base, String tipoOperativo, String lugarOperativo, String horarioInicio, String horarioFin, String agentes,
                        String dominios, String fuerza, String observaciones, int controlados, int infraccionados, int licenciasRetenidas,
                        int vehiculosRetenidos, String motivos, String graduaciones) {
        super(base, tipoOperativo, lugarOperativo, horarioInicio, horarioFin, agentes, dominios, fuerza, observaciones);
        this.controlados = controlados;
        this.infraccionados = infraccionados;
        this.licenciasRetenidas = licenciasRetenidas;
        this.vehiculosRetenidos = vehiculosRetenidos;
        this.motivos = motivos;
        this.graduaciones = graduaciones;
    }

    public int getControlados() {
        return controlados;
    }

    public void setControlados(int controlados) {
        this.controlados = controlados;
    }

    public int getInfraccionados() {
        return infraccionados;
    }

    public void setInfraccionados(int infraccionados) {
        this.infraccionados = infraccionados;
    }

    public int getLicenciasRetenidas() {
        return licenciasRetenidas;
    }

    public void setLicenciasRetenidas(int licenciasRetenidas) {
        this.licenciasRetenidas = licenciasRetenidas;
    }

    public int getVehiculosRetenidos() {
        return vehiculosRetenidos;
    }

    public void setVehiculosRetenidos(int vehiculosRetenidos) {
        this.vehiculosRetenidos = vehiculosRetenidos;
    }

    public String getMotivos() {
        return motivos;
    }

    public void setMotivos(String motivos) {
        this.motivos = motivos;
    }

    public String getGraduaciones() {
        return graduaciones;
    }

    public void setGraduaciones(String graduaciones) {
        this.graduaciones = graduaciones;
    }
}
