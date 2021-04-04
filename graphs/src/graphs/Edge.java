package graphs;

public class Edge<Type> {
	
	private Double weight;
	private Vertex<Type> first;
	private Vertex<Type> end;
	
	public Edge(Double weight, Vertex<Type> first, Vertex<Type> end) {
		this.weight = weight;
		this.first = first;
		this.end = end;
	}

	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Vertex<Type> getFirst() {
		return first;
	}
	
	public void setFirst(Vertex<Type> first) {
		this.first = first;
	}
	
	public Vertex<Type> getEnd() {
		return end;
	}
	
	public void setEnd(Vertex<Type> end) {
		this.end = end;
	}

}