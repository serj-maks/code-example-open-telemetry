package edu.serjmaks.opentelemetry;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class MsTwoController {

    @GetMapping
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("hello from ms-two");
    }
}
