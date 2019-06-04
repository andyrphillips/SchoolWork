/* City.java  
 *
  * The CityProject software package creates a graph of cities in the Unitied 
 * States with links between the cities. Each city is a vertex in the graph.
 * Each link between cities is an edge in the graph. The data for the cities and
 * links are read into arrays from CSV data files, which should be in the 
 * project folder. (CSV files, can be created, read, and edited using MS Excel.)
 *
 * The package's main class is the CityProject class. Other classes include:
 * 
 *   * AjacencyNode - a node for a linked list of Cities.  Each City has a list 
 *     of adjacnt cities, created from the links data file. Each list node has 
 *     a destination City, distance data, and a pointer to the next node. 
 *
 *   * City extends Vertex - Each City is a Vertex with added properties.  
 *     Each City has a unique name, and X and Y coordinates for location on a 
 *     1500 by 900 Canvas.
 *
 *   * Edge - an edge in a graph, with a source, destination, and length.
 *   
 *   * CityMap extends Canvas - a map of the graph on a 1500 by 900 GUI JPanel.
 *
 *   * Vertex - each Vertex in a graph.
 * 
 * The main method in the CityProject class calls methods to reads City and Edge 
 * data from data files into arrays, set up the adjacency list in each instance 
 * of City, print a list of Vertex cities and their Edges, then draw a map of the graph.
 *
 * created for use by students in CSCI 211 at Community Colle of Philadelphia
 * copyright 2014 by C. herbert.  last edited Nov. 23, 2014 by C. Herbert
 */

package cityproject;

class City extends Vertex {

    // added properties
    private boolean visited = false;
    private int bestDistance = Integer.MAX_VALUE;   //maximum value and integer can have
    private City immediatePredecessor = null;
    private AdjacencyNode adjacencyListHead;  // link to first node in adjacency list

    
    // city constructor
    City() {}
    
    
//added methods
    public void setVisited(boolean v) {
        this.visited = v;
    } // end setVisited()

    public void setBestDistance(int b) {
        this.bestDistance = b;
    } // end setBestDistance()

    public void setImmediatePredecessor(City c) {
        this.immediatePredecessor = c;
    } // end setImmediatePredecessor()

    public void setAdjacencyListHead(AdjacencyNode a) {
        this.adjacencyListHead = a;
    } // end setAdjacencyListHead()
    
    public boolean getVisited() {
        return this.visited;
    } // end getVisited()

    public int getBestDistance() {
        return this.bestDistance;
    } // end getBestDistance()

    public City getImmediatePredecessor() {
        return this.immediatePredecessor;
    } // end getImmediatePredecessor()

    public AdjacencyNode getAdjacencyListHead()  {
        return this.adjacencyListHead;
    } // end getAdjacencyListHead()
    
    
} // end class MyCity
