package com.penzastretstudios.questtext.abstarcts;

public abstract class AbstractSituationCreator {
    protected static int increment_id = 1;

    protected abstract AbstractSituation createSituation(String title, String history);
}
