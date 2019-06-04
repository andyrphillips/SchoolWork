/* Edge.java  
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

//Array of edges sorted by source 
public class Edge {

    protected City  source;		// the name of the source vertex;
    protected City  destination;	// the name of the destination vertex;
    protected int length;			// the length of the edge;

    Edge() {
    }

    Edge(City s, City d, int l) {
        this.source = s;
        this.destination = d;
        this.length = l;
    } // end Edge(...)

    public void setSource(City s) {
        this.source = s;
    }  // end setSource

    public void setDestination(City d) {
        this.destination = d;
    } // end setDestination

    public void setLength(int l) {
        this.length = l;
    } // end setLength

    public City getSource() {
        return this.source;
    }  // end getSource

    public City getDestination() {
        return this.destination;
    } // end getDestination

    public int getLength() {
        return this.length;
    } // end getLength

    public String toString() {
        return this.source + " to " + this.destination + ": " + this.length;
    }

}  //end class edge
