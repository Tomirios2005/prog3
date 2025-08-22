package ProgramacionIII.finalJulio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class GrafoDirigido<T> implements Grafo<T> {
	private HashMap<Integer, LinkedList<Arco<T>>>vertices;
	public GrafoDirigido(){
		vertices=new HashMap<>();
	}


	@Override
	public void agregarVertice(int verticeId) {
		if (!vertices.containsKey(verticeId)) {
			vertices.put(verticeId, new LinkedList<>());
		}else {
			System.out.println("El vertice ya existe");
		}
	}

	@Override
	public void borrarVertice(int verticeId) {
		if (vertices.containsKey(verticeId)) {
			vertices.remove(verticeId);
		}
		else {
			System.out.println("No se puede borrar el arco");
		}
	}

	@Override
	public void agregarArco(int verticeId1, int verticeId2, T etiqueta) {
		if (!vertices.containsKey(verticeId1)|| !vertices.containsKey(verticeId2)) {
			System.out.println("Los vertices no existen");

		}else{
			Arco<T> arco=new Arco<>(verticeId1, verticeId2, etiqueta);
			vertices.get(verticeId1).add(arco);

		}


	}

	@Override
	public void borrarArco(int verticeId1, int verticeId2) {
		if (!vertices.containsKey(verticeId1)|| !vertices.containsKey(verticeId2)) {
			System.out.println("Los vertices no existen");
		}else {
			for (Integer vv: vertices.keySet()) {
				LinkedList<Arco<T>> arcos = vertices.get(vv);
				arcos.removeIf(arco -> arco.getVerticeDestino() == vv);
			}
		}
	}

	@Override
	public boolean contieneVertice(int verticeId) {
		return vertices.containsKey(verticeId);
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		if (!vertices.containsKey(verticeId1)|| !vertices.containsKey(verticeId2)) {
			System.out.println("Los vertices no existen");
			return false;
		}else{
			LinkedList<Arco<T>> arcos = vertices.get(verticeId1);
			for (Arco<T> arco: arcos) {
				if (arco.getVerticeDestino() == verticeId2) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Arco<T> obtenerArco(int verticeId1, int verticeId2) {
		if (!vertices.containsKey(verticeId1)) {
			System.out.println("el vertice no existe");
			return null;
		}else{
			Arco<T> retorno;
			for (Arco<T> arco: vertices.get(verticeId1)) {
				if (arco.getVerticeDestino() == verticeId2) {
					retorno=arco;
					return retorno;

				}
			}
		}

		return null;
	}

	@Override
	public int cantidadVertices() {
		return vertices.size();
	}

	@Override
	public int cantidadArcos() {
		int retorno=0;
		for (LinkedList<Arco<T>>arcos: vertices.values()){
			retorno+=arcos.size();
		}
		return retorno;
	}

	@Override
	public Iterator<Integer> obtenerVertices() {
        return vertices.keySet().iterator();


	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		if (!vertices.containsKey(verticeId)){
			return null;
		}
		LinkedList<Integer>ady=new LinkedList<>();
		for (Arco<T> arco:vertices.get(verticeId)){
			ady.add(arco.getVerticeDestino());

		}
		return ady.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		LinkedList<Arco<T>>arcos=new LinkedList<>();
		for (LinkedList<Arco<T>>arc:vertices.values()){
			arcos.addAll(arc);

		}

		return arcos.iterator();
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		if (!vertices.containsKey(verticeId)){
			return null;
		}

		return vertices.get(verticeId).iterator();
	}

}
