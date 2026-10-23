package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Stretch-task controller.
 * Endpoints:
 *   GET /info -> a description of the application
 */
@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "Products API — a Spring Boot REST service for managing products, "
                + "built for 5COSC019W Tutorial 1.";
    }

}
