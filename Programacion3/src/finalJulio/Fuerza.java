package ProgramacionIII.finalJulio;

import java.util.ArrayList;
import java.util.HashMap;

public class Fuerza {
    private HashMap<Integer, Integer> personas;

    public Fuerza(HashMap<Integer, Integer> personas) {
        this.personas = personas;
    }

    public void setPersonas(Integer num, Integer fuerza) {
        this.personas.put(num, fuerza);
    }
    public HashMap<ArrayList<Integer>, Integer> greedy() {
        // Inicializar los 4 equipos
        ArrayList<ArrayList<Integer>> equipos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            equipos.add(new ArrayList<>());
        }

        // Inicializar fuerza acumulada por equipo
        int[] fuerzas = new int[4];

        // Iterar sobre personas ordenadas (ya están de mayor a menor fuerza)
        for (Integer persona : personas.keySet()) {
            int fuerzaPersona = personas.get(persona);

            // Buscar el equipo con menor fuerza acumulada
            int indiceMin = 0;
            for (int i = 1; i < 4; i++) {
                if (fuerzas[i] < fuerzas[indiceMin]) {
                    indiceMin = i;
                }
            }

            // Asignar persona al equipo más débil
            equipos.get(indiceMin).add(persona);
            fuerzas[indiceMin] += fuerzaPersona;
        }

        // Armar el mapa de retorno
        HashMap<ArrayList<Integer>, Integer> retorno = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            retorno.put(equipos.get(i), fuerzas[i]);
        }

        return retorno;
    }

}
