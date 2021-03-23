import java.util.*

class Vertex(// wegen Priority-Queue
    var name // Name des Knoten               (fix)
    : String
) : Comparable<Vertex?> {
    var edges // Nachbarn als Kantenliste      (fix)
            : MutableList<Edge>
    var nr // Knotennummer                  (errechnet)
            = 0
    var indegree // Eingangsgrad                  (errechnet)
            = 0
    var dist // Kosten fuer diesen Knoten     (errechnet)
            = 0.0
    var seen // Besuchs-Status                (errechnet)
            = false
    var prev // Vorgaenger fuer diesen Knoten (errechnet)
            : Vertex? = null

    fun hasEdge(w: Vertex): Boolean { // testet, ob Kante zu w besteht
        for (e in edges)  // fuer jede ausgehende Nachbarkante pruefe
            if (e.dest === w) // falls Zielknoten mit w uebereinstimmt
                return true // melde Erfolg
        return false // ansonsten: melde Misserfolg
    }

    override operator fun compareTo(other: Vertex?): Int { // vergl. Kosten mit anderem Vertex
        if (other != null) {
            return (dist - other.dist).toInt() // liefert Ergebnis des Vergleichs
        }
       else return -1
    }

    init {      // Konstruktor fuer Knoten
        // initialisiere Name des Knoten
        edges = LinkedList() // initialisiere Nachbarschaftsliste
    }



}