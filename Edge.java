/**
 * Write a description of class Edge here.
 * 
 * @author Alison Mayer
 * @version 1.1, Nov. 26 2011
 */

public class Edge implements Comparable<Edge>
{
    public char vertex1;
    public char vertex2;
    public int weight;

    /**
     * Constructor for Edge object
     */
    public Edge(char vertex1, char vertex2, int weight)
    {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    } 
    
     /**
     * Setter method that sets edge to user specified
     * values.
     * 
     * @param vertex1, the first vertex in the edge
     * @param vertex2, the second vertex in the edge
     * @param weight, the weight of the edge
     */
    public void setEdge(char vertex1, char vertex2, int weight)
    {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }
    
     /**
     * Setter method that sets the first vertex in the edge
     * to the user-input value.
     * 
     * @param c, the value to set vertex1 to.
     */
    public void setVertex1 (char c)
    {
       vertex1 = c;
    }
    
      /**
     * Setter method that sets the second vertex in the edge
     * to the user-input value.
     * 
     * @param c, the value to set vertex2 to.
     */
    public void setVertex2 (char c)
    {
       vertex2 = c;
    }
    
    /**
     * Setter method that sets the weight of the edge
     * to the user-input value.
     * 
     * @param x, the value to set the weight to.
     */
    public void setWeight (int x)
    {
       weight = x;
    }
    
    /**
     * Getter method that returns the first vertex in the edge.
     * 
     * @return vertex1, the first vertex in the edge.
     */
    public char getVertex1 ()
    {
        return vertex1;
    }
    
     /**
     * Getter method that returns the second vertex in the edge.
     * 
     * @return vertex2, the second vertex in the edge.
     */
    public char getVertex2 ()
    {
        return vertex2;
    }
    
     /**
     * Getter method that returns the weight of the edge
     * 
     * @return weight, the edge's weight.
     */
    public int getWeight ()
    {
       return weight;
    }
    
      /**
     * Compares weight of two edges and returns an integer value of the first edge's
     * weight relative to the second edge's weight. A negative value of 1 implies the first
     * edge's weight is less than the second edge's weight, a value of 0 implies the 
     * weights are equal, and a positive value of 1 implies the first edge's weight is greater 
     * than the second edge's weight.
     * 
     * @param e2, the second edge to be compared
     * @return an integer representation of the relative value of the first edge to the second edge
     */
    public int compareTo(Edge edge2)
    {
        Integer e1W = this.getWeight();
        Integer e2W = edge2.getWeight();
        if (e1W.compareTo(e2W) < 0)
            return -1;
        else if (e1W.compareTo(e2W) > 0)
            return 1;
        else
            return 0;
    }
    
}
