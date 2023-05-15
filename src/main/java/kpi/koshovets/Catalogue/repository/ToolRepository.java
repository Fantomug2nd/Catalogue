package kpi.koshovets.Catalogue.repository;

import kpi.koshovets.Catalogue.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository  extends JpaRepository<Tool, Long> {
}
