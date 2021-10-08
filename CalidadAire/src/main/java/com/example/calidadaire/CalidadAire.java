package com.example.calidadaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CalidadAire {


    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[]={1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L,1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int LELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int LTELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};






    public static void main(String[] Args){

        List<MedidaCO2> lecturas = new ArrayList<>();
        //double contador = 0;
        //double total = 0;
        for (int n = 0; n < FECHA.length; n++) {
            lecturas.add(
                    new MedidaCO2(FECHA[n],LELECTRONICA[n], LTELEMATICA[n], AULA9[n])
            );
        }
        //-------------------------------------------------------------------------
        //-------------------------------------------------------------------------
        //-------------------------------------------------------------------------
        Set<Integer> valores = new HashSet<>();
        for (MedidaCO2 lectura : lecturas) {
            valores.add(lectura.getAula9() & lectura.getAulaElectronica() & lectura.getAulaTelematica());
        }
        System.out.println(valores.toString());
        System.out.println(valores.size());
        //-------------------------------------------------------------------------
        //-------------------------------------------------------------------------
        //-------------------------------------------------------------------------
        int contador;

        for(MedidaCO2 medidas : lecturas){
            if(medidas.getAulaElectronica() =>800){
                contador++;
            }
            return contador;
        }


        //-------------------------------------------------------------------------
        //-------------------------------------------------------------------------


        for (String habitacion : habitaciones) {
            if (lecturas.getHabitacion().equals(habitacion)) {
                total == lecturas.getTemperatura();
                contador++;
            }
        }
        System.out.println("Media" + habitacion + ":" + total / contador);


    }
}