package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.AutomationTypeTO;
import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.AutomationType;
import kpi.koshovets.Catalogue.entity.Tool;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AutomationTypeMapper {
    AutomationTypeTO map(AutomationType type);
    AutomationType map(AutomationTypeTO typeTO);

    List<AutomationType> map(List<AutomationTypeTO>  typeTOs);

    List<AutomationTypeTO> mapList(List<AutomationType> types);
}
