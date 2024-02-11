package com.mycompany.patronfacade;
import metodoFacade.facade;

public class PatronFacade {

    public static void main(String[] args) {
        facade usuarioJavier = new facade();
        usuarioJavier.buscar("11/20/2023", "24/20/2023", "Estado México", "Yucatan");
    }
}
