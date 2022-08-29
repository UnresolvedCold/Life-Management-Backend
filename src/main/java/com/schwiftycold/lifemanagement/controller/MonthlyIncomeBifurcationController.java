package com.schwiftycold.lifemanagement.controller;

import com.schwiftycold.lifemanagement.model.MonthlyIncomeBifurcation;
import com.schwiftycold.lifemanagement.repository.MonthlyIncomeBifurcationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/monthlyIncomeBifurcation/")
public class MonthlyIncomeBifurcationController {
    @Autowired
    private MonthlyIncomeBifurcationRepository monthlyIncomeBifurcationRepository;
    // get
    @GetMapping("getAll")
    public List<MonthlyIncomeBifurcation> getAll() {
        return this.monthlyIncomeBifurcationRepository.findAll();
    }

    // save
    @PostMapping("initMonth")
    public MonthlyIncomeBifurcation createNewBifurcation(@RequestBody MonthlyIncomeBifurcation bifurcation) {
        return this.monthlyIncomeBifurcationRepository.save(bifurcation);
    }
}
