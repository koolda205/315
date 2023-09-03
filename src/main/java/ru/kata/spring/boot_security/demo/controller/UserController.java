package ru.kata.spring.boot_security.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping()
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

//    @GetMapping("/user")
//    public ModelAndView showUserInfo(@AuthenticationPrincipal User authUser) {
//        User user = userService.getUserById(authUser.getId());
//        ModelAndView modelAndView = new ModelAndView("user-info");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
//
//    @GetMapping(path = "/api/auth", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Optional<User>> getAuthUser(@CurrentSecurityContext(expression = "authentication") Principal principal) {
//        Optional<User> user = userService.findByName(principal.getName());
//        return ResponseEntity.ok(user);
//    }
}