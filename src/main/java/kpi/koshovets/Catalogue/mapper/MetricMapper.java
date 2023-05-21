package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.MetricTO;
import kpi.koshovets.Catalogue.entity.Metric;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TagMapper.class, AutomationTypeMapper.class})
public interface MetricMapper {
    MetricTO map(Metric metric);
    Metric map(MetricTO metricTO);

    List<MetricTO> map(List<Metric> metrics);

    List<Metric> mapList(List<MetricTO> metricTO);
}
