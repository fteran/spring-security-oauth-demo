package org.ft.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Fernando Teran
 */
@Controller
public class MainController {
    Logger log = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token) {
        log.info("OAuth2 Token: {}", token);
        return "main.html";
    }
}
