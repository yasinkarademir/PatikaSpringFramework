package com.yasinkarademir.cdi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class Named1 {

    private Long namedId;
    private String namedData = "Merhabalar Named1 Cdi Bean";

}
