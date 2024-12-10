package de.htwberlin.webtech.demowebtech_ws2425_backend.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/thingsthing")
public class ThingController {

    @GetMapping
    public List<Thing> getThings() {
        // Beispiel-Daten: Diese kannst du später aus einer Datenbank holen
        return List.of(
                new Thing(1, "Thing 1", 100.0),
                new Thing(2, "Thing 2", 200.0)
        );
    }
}

// Eine einfache Datenklasse für Thing
class Thing {
    private int id;
    private String name;
    private double price;

    public Thing(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter und Setter (werden von Spring benötigt)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
