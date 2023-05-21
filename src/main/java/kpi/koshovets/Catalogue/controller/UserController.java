package kpi.koshovets.Catalogue.controller;

import kpi.koshovets.Catalogue.dto.ToolTO;
import kpi.koshovets.Catalogue.dto.UserTO;
import kpi.koshovets.Catalogue.entity.User;
import kpi.koshovets.Catalogue.mapper.UserMapper;
import kpi.koshovets.Catalogue.service.UserService;
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

    @PostMapping( path = "/request"
//            produces = MediaType.APPLICATION_JSON_VALUE
            )
    public void requestRole(@RequestParam Long id){

        userService.requestRole(id);
    }

    @PostMapping(path = "/accept"
//            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void acceptRole(@RequestParam Long id){

        userService.acceptRole(id);
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserTO>> getCandidates(){

        List<User> candidates = userService.getCandidates();
        return ResponseEntity.ok(userMapper.map(candidates));
    }

    @PostMapping(path = "user/create")
    public void addUser(@RequestBody UserTO userTO){
        userService.createUser(userMapper.map(userTO));
    }
}
