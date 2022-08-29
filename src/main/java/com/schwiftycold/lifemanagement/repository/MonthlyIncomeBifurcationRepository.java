package com.schwiftycold.lifemanagement.repository;

import com.schwiftycold.lifemanagement.model.MonthlyIncomeBifurcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyIncomeBifurcationRepository extends JpaRepository<MonthlyIncomeBifurcation, Long> {
}
