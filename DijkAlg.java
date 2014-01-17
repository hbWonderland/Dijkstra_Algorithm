/**
 * An implementation of Dijkstra's Algorithm.
 * 
 * @author Alison Mayer
 * @version 1.1, 30 Nov. 2011
 */
import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class DijkAlg
{
    int numVerticies; 
    Vertex [] verticies;
    Edge [] edges;
    Vertex source;
    Vertex v;
    Edge e;
    BinaryHeap <Vertex> fringe;

    /**
     * Constructor for DijkAlg
     */
    public DijkAlg(String pathname)
    {
      // reads in a file, collects Vertex variables and Edge variable into two separate arrays
      try {
            Scanner scanVertex = new Scanner(new File (pathname));
            Scanner scanEdge = new Scanner(new File (pathname));
           
            numVerticies = scanVertex.nextInt();
            verticies = new Vertex [numVerticies];
              
            //fill Vertex array
            scanVertex.useDelimiter("\\d");
            for (int i = 0; i < numVerticies; i++) 
            {
                 /*   while (found != true)
                    {
                        if (scanVertex.next("\\w") != null)
                            String nameString = new String (scanVertex.next().toCharArray());
                        else
                            scanVertex.next();
                      } */
                    String nameString = new String (scanVertex.next().toCharArray());
                      
                    verticies[i] = new Vertex (nameString.charAt(2), null, null, null, 0, false);
                    verticies[i].setAdjacent(scanVertex.nextLine().toCharArray());
            }
            
            scanEdge.next();
            //fill Edge array
            while (scanEdge.hasNextLine())
            {
                    String line = new String (scanEdge.nextLine().toCharArray());
                    char vertex1 = line.charAt(2);
                    char vertex2;
                    for (int i = 1; i < line.length(); i++)
                        if (i%2 != 0)
                        {
                            vertex2 = line.charAt(i); 
                            edges[i] = new Edge(vertex1, vertex2, line.charAt(i+1)); 
                        }
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }  
      //put the verticies into a priority queue--should not be sorted, as 
      //all distances are initally infinite
      fringe = new BinaryHeap(verticies);
    }

    /**
     * Computes the minimum distance path from the source vertex to
     * each other vertex in the graph. Also keeps track of the previous vertex
     * on the shortest path from the source vertex to vertex v.
     * 
     * @param source, the node to begin traversing the graph from  
     * @return     
     */
    public int computePaths()
    {
        source = fringe.findMin();
        source.distance = 0;
        //visit each vertex, visiting vertex with minDistance first
        //need some kind of data structure (binary min heap?) to function as priority queue
        //priority queue would contain all veriticies in the graph
        //after visiting vertex, remove it from the priority queue and put it into a collection
        //of visited verticies--so we don't go back to it and create a cycle
        while (!fringe.isEmpty())
        {
            v = fringe.deleteMin();
            if (v.known = false)
            {
                v.known = true;
                for (int i = 0; i < v.adj.length; i++)
                    if (v.adj[i].known = false)
                    {
                        for (int j = 0; j < v.outEdges.length; j++)
                            if (v.outEdges[j].getVertex2 == adj[i])
                                e = v.outEdges[j];                               
                        if (v.adj[i].distance > v.distance + e.weight)
                        {
                            v.adj[i].distance = v.distance + e.weight;
                            fringe.percolateDown(0);
                        }
                            
                    }
                }       
       }
}
    
   /**
    * Main method
    */
    public static void main (String [] args)
    {
        String pathname = "C:\\Users\\Alison\\Documents\\Clark\\Computer Science\\Algorithms\\Dijkstra's Algorithm\\Graph1.txt";
        DijkAlg da1 = new DijkAlg(pathname);
        da1.fringe.print();
    }
}
