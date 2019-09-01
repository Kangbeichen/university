package com.donghua.service;

import com.donghua.domain.Grade;
import com.donghua.repository.GradeRepository;
import com.donghua.service.dto.GradeDTO;
import com.donghua.service.mapper.GradeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class GradeService {
    private final Logger log = LoggerFactory.getLogger(GradeService.class);

    private final GradeRepository gradeRepository;

    private final GradeMapper gradeMapper;

    public GradeService(GradeRepository gradeRepository, GradeMapper gradeMapper) {
        this.gradeRepository = gradeRepository;
        this.gradeMapper = gradeMapper;
    }

    public Grade createGrade(GradeDTO gradeDTO){
        Grade grade = new Grade();
        grade.setId(gradeDTO.getId());
        grade.setName(gradeDTO.getName());
        grade.setClassNumber(gradeDTO.getClassNumber());
        grade.setTotal(gradeDTO.getTotal());
        gradeRepository.save(grade);
        return grade;
    }



    public void updateGrade(GradeDTO gradeDTO){
        gradeRepository.save(gradeMapper
            .gradeDTOToGrade(gradeDTO));
    }

    public void deleteGradeById(Long id){
        gradeRepository.deleteById(id);
    }

    public GradeDTO getGradeByName(String name){
        Optional<Grade> grade = gradeRepository.findByName(name);


              return  gradeMapper.gtadeToGradeDTO(grade.get());


    }
}

