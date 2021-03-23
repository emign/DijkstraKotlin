


/*
 * Klasse zur Repraesentation einer Kante
 */
class Edge(// Zielknoten, zu dem die Kante fuehrt
    var dest: Vertex, // Kosten dieser Kante
    var cost: Double
) {
    init {  // Konstruktor fuer Kante
        // initialisiere Zielknoten
        cost = cost // initialisiere Kantenkosten
    }
}