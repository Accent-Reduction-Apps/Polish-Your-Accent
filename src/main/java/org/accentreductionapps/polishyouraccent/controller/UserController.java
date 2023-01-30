package org.accentreductionapps.polishyouraccent.controller;


import org.accentreductionapps.polishyouraccent.model.UserStudent;
import org.accentreductionapps.polishyouraccent.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserStudent> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserStudent getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping()
    public void addUser(@RequestBody UserStudent userStudent) {
        userService.addUser(userStudent);
    }

    @PutMapping("/{id}")
    public Object addIngredientToPotion(@PathVariable("id") Long id, @RequestBody UserStudent userStudentNew){
            UserStudent userStudentOld = userService.getUserById(id);
            if(userStudentOld!= null){
                userService.updateUser(userStudentOld, userStudentNew);
                return userStudentOld;
            }else{
                return String.format("No user found with id %d", id);
            }
    }


}
