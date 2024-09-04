package prims;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
    private String name;
    private List<Edge> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public void addNeighbour(Edge edge) {
        this.adjacencyList.add(edge);
    }

    @Override
    public String toString() {
        return name;
    }

}
