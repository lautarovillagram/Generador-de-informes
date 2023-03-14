package com.example.generadordeinformes.clases;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InicioOperativo {
    private String base;
    private String tipoOperativo;
    private String lugarOperativo;
    private String horarioInicio;
    private String horarioFin;
    private String agentes;
    private String dominios;
    private String fuerza;
    private String observaciones;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTipoOperativo() {
        return tipoOperativo;
    }

    public void setTipoOperativo(String tipoOperativo) {
        this.tipoOperativo = tipoOperativo;
    }

    public String getLugarOperativo() {
        return lugarOperativo;
    }

    public void setLugarOperativo(String lugarOperativo) {
        this.lugarOperativo = lugarOperativo;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(String horarioFin) {
        this.horarioFin = horarioFin;
    }

    public String getAgentes() {
        return agentes;
    }

    public void setAgentes(String agentes) {
        this.agentes = agentes;
    }

    public String getDominios() {
        return dominios;
    }

    public void setDominios(String dominios) {
        this.dominios = dominios;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public InicioOperativo(String base, String tipoOperativo, String lugarOperativo, String horarioInicio,
                           String horarioFin, String agentes, String dominios, String fuerza, String observaciones) {
        this.base = base;
        this.tipoOperativo = tipoOperativo;
        this.lugarOperativo = lugarOperativo;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
        this.agentes = agentes;
        this.dominios = dominios;
        this.fuerza = fuerza;
        this.observaciones = observaciones;
    }

    public List<String> separarString(String stringASeparar) {
        String str = stringASeparar;
        List<String> listaDeStr = new ArrayList<>;
        listaDeStr = str.split(",");

        return listaDeStr;
    }
}


