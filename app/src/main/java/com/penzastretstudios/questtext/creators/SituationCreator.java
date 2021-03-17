package com.penzastretstudios.questtext.creators;

import com.penzastretstudios.questtext.Situation;
import com.penzastretstudios.questtext.abstarcts.AbstractSituation;
import com.penzastretstudios.questtext.abstarcts.AbstractSituationCreator;

public class SituationCreator extends AbstractSituationCreator {

    @Override
    public AbstractSituation createSituation(String title, String history) {
        Situation situation = new Situation(increment_id, title, history);
        increment_id++;
        return situation;
    }
}
