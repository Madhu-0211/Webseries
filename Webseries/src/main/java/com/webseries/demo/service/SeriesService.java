package com.webseries.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webseries.demo.model.SeriesModel;
import com.webseries.demo.repository.SeriesRepository;

@Service
public class SeriesService {
@Autowired
private SeriesRepository seriesRepo;
@Transactional
public void addSeries(SeriesModel series)
{
	seriesRepo.save(series);
}
@Transactional
public List<SeriesModel> getSeries()
{
	return seriesRepo.findAll();
}
@Transactional
public Optional<SeriesModel> getSeriesById(int id)
{
	return seriesRepo.findById(id);
}
@Transactional
public List<SeriesModel> getSeriesByName(String name)
{
	return seriesRepo.findByName(name);
}
@Transactional
public void updateSeries(SeriesModel series)
{
	seriesRepo.save(series);
}
@Transactional
public void deleteSeries(int id)
{
	SeriesModel seriesModel=seriesRepo.getOne(id);
	seriesRepo.delete(seriesModel);
}
}
