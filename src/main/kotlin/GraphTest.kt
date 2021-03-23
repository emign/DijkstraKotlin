import Dijkstra.dijkstra
import GraphIO.printGraph
import GraphIO.readGraph

/************************* GraphTest.java  */
/**
 * testet die Graph-Algorithmen
 */


    fun main(argv: Array<String>) {
        val g = readGraph() // Graph einlesen
        printGraph(g) // Graph ausgeben
        dijkstra(g, g.getVertex("Hamburg")) // kuerzeste Wege von A berechnen
        Result.printPath(g, g.getVertex("Kassel")) // kuerzesten Weg zu E ausgeben
    }
