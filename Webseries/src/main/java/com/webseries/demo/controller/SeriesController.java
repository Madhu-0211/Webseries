package com.webseries.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webseries.demo.model.SeriesModel;
import com.webseries.demo.service.SeriesService;

@RestController
public class SeriesController {
@Autowired
SeriesService seriesService;
@PostMapping(value="/addseries")
public String addSeries(@RequestBody SeriesModel series)
{
	seriesService.addSeries(series);
	return "Inserted Successfully";
}
@GetMapping(value="/series")
public List<SeriesModel> getSeries()
{
	return seriesService.getSeries();
}
@GetMapping(value="/series/id/{id}")
public Optional<SeriesModel> getSeriesByName(@PathVariable int id)
{
	return seriesService.getSeriesById(id);
}
@GetMapping(value="/series/name/{name}")
public List<SeriesModel> getSeriesByName(@PathVariable String name)
{
	return seriesService.getSeriesByName(name);
}
@PutMapping(value="/update")
public String updateSeries(@RequestBody SeriesModel series)
{
	seriesService.updateSeries(series);
	return "Updated";
}
@DeleteMapping(value="/delete/{id}")
public String deleteSeries(@PathVariable int id)
{
	seriesService.deleteSeries(id);
	return "Series Removed! "+id;
}
}
