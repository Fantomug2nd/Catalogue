package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.Tool;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TagMapper.class, AutomationTypeMapper.class})
public interface ToolMapper {
    ToolTO map(Tool tool);
    Tool map(ToolTO toolTO);

    List<ToolTO> map(List<Tool> tools);

    List<Tool> map(List<ToolTO> toolTO);
}
