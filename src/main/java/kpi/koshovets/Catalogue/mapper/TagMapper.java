package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.TagTO;
import kpi.koshovets.Catalogue.entity.Tag;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TagMapper {
    TagTO map(Tag tag);
    Tag map(TagTO tagTO);
    
    List<Tag> map(List<TagTO>  tagTOs);
    
    List<TagTO> mapList(List<Tag> tages);
}
