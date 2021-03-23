
import java.util.*

/**
 * implementiert den single source shortest path Algorithmus nach Dijkstra
 */
/*                                                                            */ /*  Es sind nur nichtnegative Kantenkosten zugelassen                         */ /*                                                                            */ /*  Verwendet wird eine Priority-Queue der Knoten, gewichtet mit den Kosten   */ /*  des vorlaeufig kuerzesten Weges vom Startknoten bis zu diesem Knoten      */
object Dijkstra {
    fun dijkstra(g: Graph, start: Vertex) {
        val p = PriorityQueue<Vertex>()
        for (v in g.vertices()) {
            v.dist = Double.MAX_VALUE
            v.seen = false
            v.prev = null
        }
        start.dist = 0.0
        p.add(start)
        while (!p.isEmpty()) {
            val v = p.poll()
            if (v.seen) continue
            v.seen = true
            for (e in v.edges) {
                val w: Vertex = e.dest
                val c: Double = e.cost
                if (c < 0) throw RuntimeException("Negativ")
                if (w.dist > v.dist + c) {
                    w.dist = v.dist + c
                    w.prev = v
                    p.add(w)
                }
            }
        }
    }
}