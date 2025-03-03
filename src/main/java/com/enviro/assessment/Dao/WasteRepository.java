package com.enviro.assessment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enviro.assessment.Entity.Waste;

public interface WasteRepository extends JpaRepository<Waste, Integer> {

}
