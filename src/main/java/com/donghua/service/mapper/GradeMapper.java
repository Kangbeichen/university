package com.donghua.service.mapper;

import com.donghua.domain.Grade;
import com.donghua.service.dto.GradeDTO;
import org.springframework.stereotype.Service;

@Service
public class GradeMapper {
    public Grade gradeDTOToGrade(GradeDTO gradeDTO){
        if(gradeDTO == null){
            return null;
        }else{
            Grade grade = new Grade();
            grade.setId(gradeDTO.getId());
            grade.setName(gradeDTO.getName());
            grade.setClassNumber(gradeDTO.getClassNumber());
            grade.setTotal(gradeDTO.getTotal());
            return grade;
        }
    }

    public GradeDTO gtadeToGradeDTO(Grade grade){
        if(grade == null) {
            return null;
        }else{
            GradeDTO gradeDTO = new GradeDTO();
            gradeDTO.setId(grade.getId());
            gradeDTO.setName(grade.getName());
            gradeDTO.setClassNumber(grade.getClassNumber());
            gradeDTO.setTotal(grade.getTotal());
            return gradeDTO;
        }
    }
}
