package kpi.koshovets.Catalogue.service;

import kpi.koshovets.Catalogue.entity.Tool;
import kpi.koshovets.Catalogue.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToolService {

    @Autowired
    private ToolRepository toolRepository;

    public void saveTool(Tool tool){
        toolRepository.save(tool);
    }
}
