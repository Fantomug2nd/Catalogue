package kpi.koshovets.Catalogue.repository;

import kpi.koshovets.Catalogue.entity.Tool;
import kpi.koshovets.Catalogue.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByIsRoleRequestedIsTrue();
}
