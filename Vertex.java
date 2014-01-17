/**
 * Variables and methods that describe a vertex object in a directed,
 * acyclic graph.
 * 
 * @author Alison Mayer
 * @version 1.1; 8 Dec. 2011
 */
import java.util.*;

public class Vertex implements Comparable<Vertex>
{
    char name;
    char [] adj;
    Edge [] outEdges;
    Vertex previous;
    int distance;
    boolean known;
    
    /**
     * Constructor for objects of class Vertex
     */
    public Vertex(char name, char [] adj, Edge [] outEdges, Vertex previous, int distance, boolean known)
    {        
    }
    
    /**
     * Constructor for objects of class Vertex
     */
    public Vertex(char name)
    {        
    }
    
     /**
     * Setter method that sets a character array of adjacent verticies.
     * 
     */
    public void setAdjacent(char [] adj)
    {
        this.adj = adj;
    }
    
    /**
     * Getter method that returns a List of adjacent verticies.
     * 
     * @return a list of adjecent verticies 
     */
    public char [] getAdjacent()
    {
        return adj;
    }
    
     /**
     * Getter method that returns the distance of the vertex.
     * 
     * @return the distance of the vertex
     */
    public int getDistance()
    {
        return distance;
    }
    
    /**
     * Compares distance of two verticies and returns an integer value of the first vertex's
     * distance relative to the second vertex's distance. A negative value of 1 implies the first
     * vertex's distance is less than the second vertex's distance, a value of 0 implies the 
     * distances are equal, and a positive value of 1 implies the first vertex's distance is greater 
     * than the second vertex's distance.
     * 
     * @param v2, the second vertex to be compared
     * @return an integer representation of the relative value of the first vertex to the second vertex
     */
    public int compareTo(Vertex v2)
    {
        Integer v1Distance = this.getDistance();
        Integer v2Distance = v2.getDistance();
        if (v1Distance.compareTo(v2Distance) < 0)
            return -1;
        else if (v1Distance.compareTo(v2Distance) > 0)
            return 1;
        else
            return 0;
    }
}
