package com.penzastretstudios.questtext.creators;

import com.penzastretstudios.questtext.Edge;
import com.penzastretstudios.questtext.Situation;
import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

public class EdgeCreator {
    static int increment_id = 0;

    public Edge createEdge(AbstractSituation sit_from, AbstractSituation sit_into, String variant, int deltaRespect) {
        if (sit_from != null && sit_into != null)
            System.out.println("Связь не добавлена");
        Edge edge = new Edge(increment_id, variant, deltaRespect,
                sit_from, sit_into);
        increment_id++;
        return edge;
    }
}
