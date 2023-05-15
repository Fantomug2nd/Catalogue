package kpi.koshovets.Catalogue.controller;

import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.Metric;
import kpi.koshovets.Catalogue.entity.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/metric")
public class MetricController {
    @Autowired
    private MetricService metricService;

    @Autowired
    private MetricMapper metricMapper;

    @PostMapping(
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void createMetric(@RequestBody MetricTO metricTO){

        metricService.saveMetric(metricMapper.map(metricTO));
    }

    @PutMapping(
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void updateMetric(@RequestBody MetricTO metricTO){

        metricService.updateMetric(metricMapper.map(metricTO));
    }

    @DeleteMapping ( path = "/{id}"
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void deleteMetric(@RequestParam Long id){

        metricService.deleteMetric(id);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<ToolTO>> getAllMetrics(){

        Set<Metric> metrics = metricService.getAllMetrics();

        return ResponseEntity.ok(metricMapper.map(metrics));
    }
}
