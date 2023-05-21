package kpi.koshovets.Catalogue.service;

import kpi.koshovets.Catalogue.entity.Metric;
import kpi.koshovets.Catalogue.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class MetricService {

    @Autowired
    MetricRepository metricRepository;

    public void saveMetric(Metric metric) {
        metricRepository.save(metric);
    }

    public void updateMetric(Metric metric) {
        Metric metricToUpdate = metricRepository.getReferenceById(metric.getId());
        metricToUpdate =metric;
        metricRepository.save(metric);
    }

    public void deleteMetric(Long id) {
        metricRepository.deleteById(id);
    }

    public List<Metric> getAllMetrics() {
        return metricRepository.findAll();
    }
}
