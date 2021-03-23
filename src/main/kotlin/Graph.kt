

/**
 * Klasse zur Implementation eines Graphen basierend auf Vertex und Edge
 */
/*  Der Graph wird implementiert als HashMap <String, Vertex>, d.h. als eine  */ /*  Hashtabelle mit Keys vom Typ String und Values vom Typ Knoten             */
class Graph {
    private val graph // Datenstruktur fuer Graph
            : MutableMap<String, Vertex>

    // liefert true, falls Graph leer
    // mit isEmpty() von HashMap
    val isEmpty: Boolean
        get() =// liefert true, falls Graph leer
            graph.isEmpty() // mit isEmpty() von HashMap

    fun size(): Int {                           // liefert die Anzahl der Knoten
        return graph.size // mit size() von HashMap
    }

    fun vertices(): Collection<Vertex> {       // liefert Knoten als Collection
        return graph.values // mit values() von HashMap
    }

    fun getVertex(s: String): Vertex {  // liefere Knoten zu String
        var v = graph[s] // besorge Knoten zu Knotennamen
        if (v == null) {                    // falls nicht gefunden
            v = Vertex(s) // lege neuen Knoten an
            graph[s] = v // fuege Namen und Knoten in HashMap ein
        }
        return v // liefere gefundenen oder neuen Knoten
    }

    fun addEdge(
        source: String,  // fuege Kante ein von Knotennamen source
        dest: String,  // zu Knotennamen dest
        cost: Double
    ) {  // mit Kosten cost
        val v = getVertex(source) // finde Knoten v zum Startnamen
        val w = getVertex(dest) // finde Knoten w zum Zielnamen
        v.edges.add(Edge(w, cost)) // fuege Kante (v,w) mit Kosten cost ein
    }

    init {                             // leerer Graph wird angelegt
        graph = HashMap() // als HashMap von String,Vertex
    }
}