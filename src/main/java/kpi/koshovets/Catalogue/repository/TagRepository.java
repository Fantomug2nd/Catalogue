package kpi.koshovets.Catalogue.repository;

import kpi.koshovets.Catalogue.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
