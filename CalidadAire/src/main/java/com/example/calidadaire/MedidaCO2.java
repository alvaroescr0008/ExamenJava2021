package com.example.calidadaire;

public class MedidaCO2 {

    private long fecha;
    private  int aulaElectronica;
    private  int aulaTelematica;
    private  int aula9;

    //-------------------------------------------GET SET

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public int getAulaElectronica() {
        return aulaElectronica;
    }

    public void setAulaElectronica(int aulaElectronica) {
        this.aulaElectronica = aulaElectronica;
    }

    public int getAulaTelematica() {
        return aulaTelematica;
    }

    public void setAulaTelematica(int aulaTelematica) {
        this.aulaTelematica = aulaTelematica;
    }

    public int getAula9() {
        return aula9;
    }

    public void setAula9(int aula9) {
        this.aula9 = aula9;
    }

//-------------------------------------------CONSTRUCTOR

    public MedidaCO2(long fecha, int aulaElectronica, int aulaTelematica, int aula9) {
        this.fecha = fecha;
        this.aulaElectronica = aulaElectronica;
        this.aulaTelematica = aulaTelematica;
        this.aula9 = aula9;
    }
}
