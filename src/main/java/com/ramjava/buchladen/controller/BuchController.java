package com.ramjava.buchladen.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buchladen")
public class BuchController {

    @GetMapping("/{buchId}")
    public ResponseEntity<String> getBuch(@PathVariable String buchId) {
        return new ResponseEntity<>("Buch Buch gefunden " + buchId, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<String>> getAllBuch() {
        // Return the mock data list
        //List<String> buch = List.of("Buch 1", "Buch 2", "Buch 3");
        List<String> buch = new ArrayList<>();
        buch.add("Java");
        buch.add("Mongo DB");
        buch.add("Spring Boot");
        return new ResponseEntity<>(buch, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> createBuch(String buch) {
        return new ResponseEntity<>("Buch erstellt", HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<String> updateBuch(String buch) {
        return new ResponseEntity<>("Buch aktualisiert", HttpStatus.OK);
    }

    @DeleteMapping("/{buchId}")
    public ResponseEntity<String> deleteBuch(@PathVariable String buchId) {
        return new ResponseEntity<>("Buch gelöscht", HttpStatus.OK);
    }
}
