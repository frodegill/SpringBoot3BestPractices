package com.example.demo.controller;

import com.example.demo.generated.model.Thing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class V10Api implements com.example.demo.generated.api.V10Api {

    @Override
    public ResponseEntity<Void> createThing(final Thing thing) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> deleteThing(final String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Thing> getThing(final String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<List<Thing>> getThings() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> updateThing(final String id, final Thing thing) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
