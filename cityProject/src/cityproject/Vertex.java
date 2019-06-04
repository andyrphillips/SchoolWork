/* Vertex.Java - class file
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


    
public class Vertex {

    private String name; 	// name of the city
    private int x;  		// city's x-coordinate for drawing
    private int y;  		// city's y-coordinate for drawing

    Vertex() {
    }  // end Vertex()

    Vertex(String n, String s, int x, int y) {
        this.name = n;
        this.x = x;
        this.y = y;
    }  // end Vertex(...)

    public void setName(String n) {
        this.name = n;
    } // end setName()

    public void setX(int x) {
        this.x = x;
    } // end setX()

    public void setY(int y) {
        this.y = y;
    } // end setY()

    public String getName() {
        return this.name;
    } // end getName()

    public int getX() {
        return this.x;
    } // end getX()

    public int getY() {
        return this.y;
    } // end getY()

    public String toString() {
        return (this.name + " " + " " + this.x + " " + this.y);
    } // end toString()

} // end class Vertex


