/* AjacencyNode.java  
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

/**
 *
 * @author user
 */
//class for the city's adjaceny list
class AdjacencyNode {

    //data

    private City city;
    private int distance;

    // link
    AdjacencyNode next;

    AdjacencyNode() {
    }

    AdjacencyNode(City c, int d) {
        this.city = c;
        this.distance = d;

    }  // end AdjacencyNode

    public void setCity(City c) {
        this.city = c;
    } // end setCityName()

    public void setDistance(int d) {
        this.distance = d;
    } // end setDistance()

    public void setNext(AdjacencyNode a) {
        this.next = a;
    } // end setNext()

    public City getCity() {
        return this.city;
    } // end getcityName()

    public int getcDistance() {
        return this.distance;
    } // end getcDistance()

    public AdjacencyNode getNext() {
        return this.next;
    } // end getNext()

        public String  toString() {
        return ("to: " + this.city.getName() +" distance: "+ this.distance);
    } // end getNext()

    
}   // end class AdjacencyNode 
