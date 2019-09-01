package com.donghua.web.rest;

import com.donghua.domain.Grade;
import com.donghua.repository.GradeRepository;
import com.donghua.service.GradeService;
import com.donghua.service.dto.GradeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class GradeResource {
    private final Logger log = LoggerFactory.getLogger(GradeResource.class);


    private final GradeService gradeService;

    private final GradeRepository gradeRepository;

    public GradeResource(GradeService gradeService, GradeRepository gradeRepository) {
        this.gradeService = gradeService;
        this.gradeRepository = gradeRepository;
    }

    @PostMapping("/grades")
    public ResponseEntity<Grade> createGrade(@Valid @RequestBody GradeDTO graderDTO){
        Grade newGrade = gradeService.createGrade(graderDTO);
        return ResponseEntity.ok(newGrade);
    }

    @PutMapping("/grades")
    public void updateGrade(@Valid @RequestBody GradeDTO graderDTO){
        gradeService.updateGrade(graderDTO);
        ResponseEntity.ok();
     }

     @DeleteMapping("/grades/{id}")
    public void deleteGradeById(@PathVariable Long id){
        gradeService.deleteGradeById(id);
        ResponseEntity.ok();
    }

    @GetMapping("/grades/{name}")
    public ResponseEntity<GradeDTO> getGrade(@PathVariable String name){
        log.debug(name);
        GradeDTO gradeDTO = gradeService.getGradeByName(name);
        return ResponseEntity.ok(gradeDTO);
    }

}
