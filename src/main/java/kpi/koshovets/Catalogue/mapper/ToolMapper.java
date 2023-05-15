package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.Tool;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ToolMapper {
    ToolTO map(Tool tool);
    Tool map(ToolTO toolTO);
}
