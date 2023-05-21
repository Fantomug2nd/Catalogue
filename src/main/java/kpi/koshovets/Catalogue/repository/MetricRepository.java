package kpi.koshovets.Catalogue.repository;

import kpi.koshovets.Catalogue.entity.Metric;
import kpi.koshovets.Catalogue.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricRepository  extends JpaRepository<Metric, Long> {
}
