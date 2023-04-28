package com.yasinkarademir.cdi;

//kapsam
//yasam suresi
//persormansı etkiler


import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

@Named
//@ApplicationScoped //bütün uygulama boyunca yaşar
//RequestScoped //her istek için yeni bir nesne üretilir(1 istek boyunca yaşar)
//SessionScoped //her session için yeni bir nesne üretilir(1 session boyunca yaşar)
//@Dependent
//class çağırıldığı yerde ApplicationScoped içindeysen ApplicationScoped, RequestScoped içindeysen RequestScoped, SessionScoped içindeysen SessionScoped gibi davranır //bukalemun gibi
//@ConversationScoped //belli istek boyunca yaşar. mesela bir alışveriş sepeti
public class Soped0 {
}
