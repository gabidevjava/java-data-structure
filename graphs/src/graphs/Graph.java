package graphs;

import java.util.ArrayList;

public class Graph<Type> {

	private ArrayList<Vertex<Type>> vertex;
	private ArrayList<Edge<Type>> edge;

	public Graph() {
		this.vertex = new ArrayList<>();
		this.edge = new ArrayList<>();
	}

	void addVertex(Type data) {
		Vertex<Type> newVertice = new Vertex<Type>(data);
		this.vertex.add(newVertice);
	}

	void addEdge(Double weight, Type startData, Type endData) {

	}
	
	public Vertex<Type> getVertex(Type data) {
		Vertex<Type> vertex = null;
		
		for(int i = 0; i < this.vertex.size();) {
			if(this.vertex.get(i).getData().equals(data));
			vertex = this.vertex.get(i);
			break;
		}
		
		return vertex;
	}

}