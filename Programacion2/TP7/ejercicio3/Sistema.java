package ejercicio3;

import java.util.ArrayList;

public class Sistema {
    private final ArrayList<Planta>plantas;
    public Sistema(){
        plantas=new ArrayList<>();
    }
    public void addPlantas(Planta pp){
        if(!plantas.contains(pp)){
            plantas.add(pp);
        }
    }
    public ArrayList<Planta>filtrar(Condicion cc){
        ArrayList<Planta>plantasFiltradas=new ArrayList<>();
        for (int i = 0; i <plantas.size() ; i++) {
            if (cc.cumple(plantas.get(i))){
                plantasFiltradas.add(plantas.get(i));
            }

        }
        return plantasFiltradas;
    }

    public static void main(String[] args) {
        Planta potus=new Planta("Epipremnum aureum", "Epipremnum","Araceae", "Monocotyledoneae", "interior",3,4);
        potus.addNombreVulgar("potus");
        potus.addNombreVulgar("pothos");
        potus.addNombreVulgar("potos");
        Sistema s1=new Sistema();
        s1.addPlantas(potus);
        Condicion condicionMayorSol=new CondicionNivelSol(2);
        Condicion condicionmayorRiego=new CondicionNivelRiego(5);
        Condicion menorRiego=new CondicionNot(condicionmayorRiego);
        Condicion ambas=new CondicionAnd(menorRiego,condicionMayorSol);
        System.out.println(  s1.filtrar(ambas));
        System.out.println(s1.filtrar(new CondicionNombreCientifico("estero")));



    }
}
