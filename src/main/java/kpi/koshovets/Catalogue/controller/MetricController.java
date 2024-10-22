package kpi.koshovets.Catalogue.controller;


import kpi.koshovets.Catalogue.dto.MetricTO;
import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.Metric;
import kpi.koshovets.Catalogue.entity.Tool;
import kpi.koshovets.Catalogue.mapper.MetricMapper;
import kpi.koshovets.Catalogue.service.MetricService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/metric")
@CrossOrigin
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
    public ResponseEntity<List<MetricTO>> getAllMetrics(){

        List<Metric> metrics = metricService.getAllMetrics();

        return ResponseEntity.ok(metricMapper.map(metrics));
    }

    @GetMapping("/say")
    public ResponseEntity<String> say(){
        return ResponseEntity.ok("hello");
    }
}
