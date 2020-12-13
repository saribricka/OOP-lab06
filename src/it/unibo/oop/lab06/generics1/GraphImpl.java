package it.unibo.oop.lab06.generics1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GraphImpl<N> implements Graph<N> {

	private Set<N> nodes;
	private Map<N, Set<N>> edges;
	
	public GraphImpl() {
		this.nodes = new HashSet<N>();
		this.edges = new HashMap<N,Set<N>>();
	}

	@Override
	public void addNode(N node) {
		this.nodes.add(node);
		
	}

	@Override
	public void addEdge(Object source, Object target) {
		if(this.nodes.contains(source) && this.nodes.contains(target)) {
			this.edges.put(source, target);
		}
	}

	@Override
	public Set linkedNodes(Object node) {
		return edges.get(node);	//maybe to cast into (Set<N>) 
	}

	@Override
	public List getPath(Object source, Object target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<N> nodeSet() {
		return new HashSet<N>(nodes);
	}
}
