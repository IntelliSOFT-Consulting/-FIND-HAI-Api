package com.intellisoft.findhai.service;

import com.intellisoft.findhai.entity.Outcome;
import com.intellisoft.findhai.entity.PeriOperative;
import com.intellisoft.findhai.entity.PostOperative;
import com.intellisoft.findhai.entity.SurgicalSitePathogenInfo;
import com.intellisoft.findhai.repository.OutComeRepository;
import com.intellisoft.findhai.repository.PeriOperativeRepository;
import com.intellisoft.findhai.repository.PostOperativeRepository;
import com.intellisoft.findhai.repository.SurgicalSitePathogenInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncounterServiceImpl implements EncounterService {

    private final OutComeRepository outComeRepository;
    private final PeriOperativeRepository periOperativeRepository;
    private final PostOperativeRepository postOperativeRepository;
    private final SurgicalSitePathogenInfoRepository surgicalSitePathogenInfoRepository;


    @Autowired
    public EncounterServiceImpl(OutComeRepository outComeRepository, PeriOperativeRepository periOperativeRepository, PostOperativeRepository postOperativeRepository, SurgicalSitePathogenInfoRepository surgicalSitePathogenInfoRepository) {
        this.outComeRepository = outComeRepository;
        this.periOperativeRepository = periOperativeRepository;
        this.postOperativeRepository = postOperativeRepository;
        this.surgicalSitePathogenInfoRepository = surgicalSitePathogenInfoRepository;
    }

    @Override
    public PeriOperative addPeriOperative(PeriOperative periOperative) {
        return periOperativeRepository.save(periOperative);
    }

    @Override
    public PostOperative addPostOperative(PostOperative postOperative) {
        return postOperativeRepository.save(postOperative);
    }

    @Override
    public SurgicalSitePathogenInfo addSsi(SurgicalSitePathogenInfo surgicalSitePathogenInfo) {
        return surgicalSitePathogenInfoRepository.save(surgicalSitePathogenInfo);
    }

    @Override
    public Outcome addOutcome(Outcome outcome) {
        return outComeRepository.save(outcome);
    }

}
