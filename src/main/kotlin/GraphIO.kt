
import java.io.BufferedReader
import java.io.FileReader
import java.lang.Exception
import java.util.*

/**
 * Routinen zum Einlesen eines gerichteten Graphen
 */
/*  Der Graph wird realisiert durch eine HashMap, welche                      */ /*  den Namen des Knoten auf den Knoten abbildet                              */
object GraphIO {
    fun readGraph(): Graph {   // liest Graph aus Datei ein
        val g = Graph()
        try {
            val f = BufferedReader(FileReader("src/graph.dat"))
            var zeile: String?
            while (f.readLine().also { zeile = it } != null) {
                val st = StringTokenizer(zeile)
                val source = st.nextToken()
                val dest = st.nextToken()
                val cost = st.nextToken().toDouble()
                g.addEdge(source, dest, cost)
            }
        } catch (e: Exception) {
            println(e)
        }
        return g
    }

    fun printGraph(g: Graph) { // gibt Graph aus
        println("Adjazenzlisten des Graphen:")
        for (v in g.vertices()) {
            for (e in v.edges) {
                print("(" + v.name.toString() + "," + e.dest.name.toString() + ")" + e.cost.toString() + "  ")
            }
            println()
        }
        println()
    }
}