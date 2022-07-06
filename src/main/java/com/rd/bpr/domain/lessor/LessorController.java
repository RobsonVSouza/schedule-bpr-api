package com.rd.bpr.domain.lessor;

import com.rd.bpr.domain.lessor.dto.LessorDto;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LessorController {

    @Autowired
    private LessorService service;

    @PostMapping
    public ResponseEntity<LessorDto> save(@RequestBody @Valid LessorDto lessorDto) {
        return ResponseEntity.status(HttpStatus.OK).body(service.save(lessorDto));
    }

    @PutMapping
    public ResponseEntity<LessorDto> update(@RequestBody LessorDto lessorDto){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(lessorDto));
    }

    @GetMapping
    public ResponseEntity<LessorDto> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }
}
