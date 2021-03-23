

/**
 * Routinen zum Anzeigen der Loesungen, kodiert in den Arbeitsvariablen
 */
object Result {
    private fun printPath(dest: Vertex) {
        if (dest.prev != null) {
            printPath(dest.prev!!)
            print(" -> ")
        }
        print(dest.name)
    }

    fun printPath(g: Graph?, w: Vertex) {
        if (w.dist === kotlin.Double.Companion.MAX_VALUE) println(w.name.toString() + " nicht erreichbar") else {
            println("Der kuerzeste Weg (mit Gesamtkosten " + w.dist.toString() + ") lautet: ")
            printPath(w)
        }
        println()
        println()
    }

    fun printHamilton(g: Graph?, last: Vertex?) {
        if (last == null) println("Graph hat keinen Hamiltonkreis") else {
            println("Der Hamiltonkreis lautet:")
            printPath(last)
        }
        println()
        println()
    }

    fun printTopo(g: Graph) {
        var erfolgreich = true
        for (v in g.vertices()) if (v.nr < 0) erfolgreich = false
        if (erfolgreich) {
            println("Die Sortierung lautet:")
            for (v in g.vertices()) println("Knoten " + v.name.toString() + " erhaelt Nr. " + v.nr)
        } else println("Graph kann nicht topologisch sortiert werden")
        println()
    }

    fun printTraverse(g: Graph) {
        println("Traversierungsreihenfolge:")
        for (v in g.vertices()) {
            println(v.name.toString() + " erhaelt Nr. " + v.nr)
        }
        println()
    }
}