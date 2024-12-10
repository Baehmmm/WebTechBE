package de.htwberlin.webtech.demowebtech_ws2425_backend.web;

import de.htwberlin.webtech.demowebtech_ws2425_backend.model.Adresse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
public class AdresseController {

    // Liste von Adressen als Instanzvariable
    private final List<Adresse> adressen;

    // Initialisiere die Liste im Konstruktor, um sie nur einmal zu erstellen
    public AdresseController() {
        this.adressen = Arrays.asList(
                new Adresse("Florian", "Pink", "Karlstr."),
                new Adresse("Anna", "Schwarz", "Musterstr."),
                new Adresse("Markus", "Blau", "Hauptstr.")
        );
    }

    // Endpunkt für die Liste
    @GetMapping(path = "/adressen")
    public ResponseEntity<List<Adresse>> getAdressen() {
        return ResponseEntity.ok(adressen);
    }
}
