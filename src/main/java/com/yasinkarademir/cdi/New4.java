package com.yasinkarademir.cdi;

import com.yasinkarademir.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class New4 {

    //üretilen

    @Produces
    public String uretilenData(@New StudentDto studentDto) {
        studentDto = StudentDto.builder()
                .studentId(0L).studentName("student adi")
                .build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}
