package graphs;

import java.util.ArrayList;

public class Vertex<Type> {
	
	private Type data;
	private ArrayList<Edge<Type>> openEdges;
	private ArrayList<Edge<Type>> exitEdges;

	public Vertex(Type data) {
		this.data = data;
		this.openEdges = new ArrayList<>();
		this.exitEdges = new ArrayList<>();
	}

	public Type getData() {
		return data;
	}

	public void setData(Type data) {
		this.data = data;
	}
	
	public void addOpenEdge(Edge<Type> edge) {
		this.openEdges.add(edge);
	}
	
	public void addExitEdge(Edge<Type> edge) {
		this.exitEdges.add(edge);
	}
	
}