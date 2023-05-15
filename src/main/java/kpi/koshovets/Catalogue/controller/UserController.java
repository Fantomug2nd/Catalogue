package kpi.koshovets.Catalogue.controller;

import kpi.koshovets.Catalogue.dto.ToolTO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @PostMapping(
//            produces = MediaType.APPLICATION_JSON_VALUE
            )
    public void requestRole(@RequestParam Long id){

        userService.requestRole(id);
    }

    @PostMapping(
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void acceptRole(@RequestParam Long id){

        userService.acceptRole(id);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<UserDTO>> getCandidates(){

        Set<User> candidates = userService.geteCandidates();
        return ResponseEntity.ok(userMapper.map(candidates));
    }
}
