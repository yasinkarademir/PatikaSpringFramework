package com.yasinkarademir.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class Produces2 {

    @Produces //üretiyor
    public List<String> getList() {

        List<String> liste = new ArrayList<>();

        liste.add("HTML5");
        liste.add("CSS3");
        liste.add("JS");
        liste.add("React");
        liste.add("Angular");

        return liste;

    }
}
