package com.penzastretstudios.questtext.creators;

import com.penzastretstudios.questtext.EndSituation;
import com.penzastretstudios.questtext.abstarcts.AbstractSituation;
import com.penzastretstudios.questtext.abstarcts.AbstractSituationCreator;

public class EndSituationCreator extends AbstractSituationCreator {

    @Override
    public AbstractSituation createSituation(String title, String history) {
        EndSituation endSituation = new EndSituation(increment_id, title, history);
        increment_id++;
        return endSituation;
    }
}
