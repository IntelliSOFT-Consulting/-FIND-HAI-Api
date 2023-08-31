package com.intellisoft.findhai.service;

import com.intellisoft.findhai.entity.Outcome;
import com.intellisoft.findhai.entity.PeriOperative;
import com.intellisoft.findhai.entity.PostOperative;
import com.intellisoft.findhai.entity.SurgicalSitePathogenInfo;

public interface EncounterService {
    PeriOperative addPeriOperative(PeriOperative periOperative);

    PostOperative addPostOperative(PostOperative postOperative);

    SurgicalSitePathogenInfo addSsi(SurgicalSitePathogenInfo surgicalSitePathogenInfo);

    Outcome addOutcome(Outcome outcome);
}
