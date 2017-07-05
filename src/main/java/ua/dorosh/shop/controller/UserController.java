package ua.dorosh.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.dorosh.shop.entity.user.User;
import ua.dorosh.shop.service.MailSenderService;
import ua.dorosh.shop.service.UserService;


import java.util.UUID;

/**
 * Created by n.dorosh on 01.07.2017.
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    private MailSenderService mailSenderService;

    @GetMapping("/login")
    private String login(){
        return "user/login";
    }

    @GetMapping("/signup")
    private String signup(Model model){
        model.addAttribute("user", new User());
        return "user/register";
    }

    @PostMapping("/signup")
    private String save(@ModelAttribute User user, Model model) {
        System.out.println("Save!!!!!");
        String uuid = UUID.randomUUID().toString();

        user.setUuid(uuid);


            System.out.println("Try!!!!!");
        System.out.println(user.toString());
            // userService.save(user, image);

            userService.save(user);

        System.out.println("After!!!!!");

            String theme = "thank's for registration";
            String mailBody = "gl & hf       http://localhost:8080/confirm/" + uuid;

            mailSenderService.sendMail(theme, mailBody, user.getEmail());
        System.out.println("Email!!!!!");

        return "redirect:/";
    }
}