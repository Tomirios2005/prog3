package ej1;

import ej1.comparadores.*;
import ej1.filtros.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList<Socio>socios;

    public Club() {
        socios=new ArrayList<>();
    }
    public void addSocio(Socio socio){
        socios.add(socio);
    }
    public ArrayList<Socio>buscar(Filtro filtro){
        ArrayList<Socio>retorno=new ArrayList<>();
        for(Socio socio:socios){
            if (filtro.cumple(socio)){
                retorno.add(socio);
            }
        }
        return retorno;
    }
    public ArrayList<Socio>buscarOrdenado(Filtro filtro, Comparator<Socio> comparador){
        ArrayList<Socio> retorno=this.buscar(filtro);
        Collections.sort(retorno,comparador);
        return retorno;


    }

    public static void main(String[] args) {
        Club club = new Club();
        Socio tomas = new Socio("tomas", "aios", 9, false);
        Socio juan = new Socio("juan", "rios", 10, true);
        Socio agustin = new Socio("agustin", "aereyra", 13, false);
        Alquiler a1=new Alquiler(23, LocalDate.now(),700);
        Alquiler a2=new Alquiler(25, LocalDate.now(),1000);
        Alquiler a3=new Alquiler(23, LocalDate.now(),700);
        Alquiler a4=new Alquiler(23, LocalDate.now(),700);
        Alquiler a5=new Alquiler(23, LocalDate.now(),700);
        club.addSocio(tomas);
        club.addSocio(juan);
        club.addSocio(agustin);
        agustin.addCancha(a1);
        agustin.addCancha(a4);
        agustin.addCancha(a5);
        juan.addCancha(a2);
        tomas.addCancha(a3);

        Comparator<Socio>nombre=new ComparadorNombre();
        Filtro cuota=new FIltroCuota();
        Filtro edad=new FiltroEdad(18);
        Filtro cancha=new FiltroCancha(23);
        Filtro pagomas=new FiltroPrecio(500);
        System.out.println(club.buscarOrdenado(cuota,nombre));
        System.out.println(club.buscarOrdenado(edad,new ComparadorEdad()));
        System.out.println(club.buscarOrdenado(cancha, new ComparadorCantAlquileres(23)));
        System.out.println(club.buscarOrdenado(pagomas,new ComparadorCompuesto(new ComparadorMoroso(), nombre)));
        //faltaria filtros and or y todo eso






    }
}
