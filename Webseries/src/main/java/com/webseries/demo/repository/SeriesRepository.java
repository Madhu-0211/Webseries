package com.webseries.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.webseries.demo.model.SeriesModel;

public interface SeriesRepository extends JpaRepository<SeriesModel,Integer> {
	List<SeriesModel> findByName(String name);

}
