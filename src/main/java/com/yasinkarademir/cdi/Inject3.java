package com.yasinkarademir.cdi;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class Inject3 {
    @Inject
    List<String> tuketen;

    public List<String> getTuketen() {
        return tuketen;
    }
}
