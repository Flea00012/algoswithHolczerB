package depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        adjacencyList.add(vertex);
    }

    public List<Vertex> getNeighbours(){
        return adjacencyList;
    }

    public boolean isVisited(){
        return visited;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    @Override
    public String  toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
