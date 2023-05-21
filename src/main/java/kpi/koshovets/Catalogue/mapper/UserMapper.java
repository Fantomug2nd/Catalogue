package kpi.koshovets.Catalogue.mapper;

import kpi.koshovets.Catalogue.dto.UserTO;
import kpi.koshovets.Catalogue.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User map(UserTO userTO);
    UserTO map(User user);

    List<User> mapList(List<UserTO> userTOs);

    List<UserTO> map(List<User> users);

}
