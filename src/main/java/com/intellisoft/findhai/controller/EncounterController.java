package com.intellisoft.findhai.controller;


import com.intellisoft.findhai.entity.Outcome;
import com.intellisoft.findhai.entity.PeriOperative;
import com.intellisoft.findhai.entity.PostOperative;
import com.intellisoft.findhai.entity.SurgicalSitePathogenInfo;
import com.intellisoft.findhai.service.EncounterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.ALL_VALUE;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/api/v1/encounter", produces = "application/json")
@RestController
@RequiredArgsConstructor
public class EncounterController {

    @Autowired
    EncounterService encounterService;

    @PostMapping(path = "/peri-operative/add", consumes = ALL_VALUE)
    public ResponseEntity<PeriOperative> addPeriOperative(@Valid @RequestBody PeriOperative periOperative) {
        return ResponseEntity.status(HttpStatus.CREATED).body(encounterService.addPeriOperative(periOperative));
    }

    @PostMapping(path = "/post-operative/add", consumes = ALL_VALUE)
    public ResponseEntity<PostOperative> addPostOperative(@Valid @RequestBody PostOperative postOperative) {
        return ResponseEntity.status(HttpStatus.CREATED).body(encounterService.addPostOperative(postOperative));
    }

    @PostMapping(path = "/surgical-site-infection/add", consumes = ALL_VALUE)
    public ResponseEntity<SurgicalSitePathogenInfo> addSsi(@Valid @RequestBody SurgicalSitePathogenInfo surgicalSitePathogenInfo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(encounterService.addSsi(surgicalSitePathogenInfo));
    }

    @PostMapping(path = "/outcome/add", consumes = ALL_VALUE)
    public ResponseEntity<Outcome> addOutcome(@Valid @RequestBody Outcome outcome) {
        return ResponseEntity.status(HttpStatus.CREATED).body(encounterService.addOutcome(outcome));
    }

}
