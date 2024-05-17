package com.Mycompany.MiPortafolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "index"; // Devuelve el nombre de la plantilla sin la extensión
    }
}
