package kpi.koshovets.Catalogue.controller;


import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.entity.Tool;
import kpi.koshovets.Catalogue.mapper.ToolMapper;
import kpi.koshovets.Catalogue.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    private ToolService toolService;

    @Autowired
    private ToolMapper toolMapper;

    @PostMapping(
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void createTool(@RequestBody ToolTO toolTO){

        toolService.saveTool(toolMapper.map(toolTO));
    }

    @GetMapping
    public ResponseEntity<List<ToolTO>> getAllTools(){

//        List<Tool> tools = toolService.getAllTools();

//    return ResponseEntity.ok(toolMapper.map(tools));
        return ResponseEntity.ok(Collections.singletonList(new ToolTO("name", null,null,null)));
    }
}
