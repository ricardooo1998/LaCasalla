package com.tema3.ricardo.fragmentsdinamicos;

import java.util.ArrayList;

class CiclesFlorida {
    private String familiaProfessional;
    private String tipus;
    private String titol;
    private String Descripcio;

    public CiclesFlorida(String familiaProfessional, String tipus, String titol, String descripcio) {

        this.familiaProfessional = familiaProfessional;
        this.tipus = tipus;
        this.titol = titol;
        Descripcio = descripcio;
    }

    public String getFamiliaProfessional() {
        return familiaProfessional;
    }

    public void setFamiliaProfessional(String familiaProfessional) {
        this.familiaProfessional = familiaProfessional;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return Descripcio;
    }

    public void setDescripcio(String descripcio) {
        Descripcio = descripcio;
    }

    public void creaDades(){
        CiclesFlorida c;
        ArrayList<CiclesFlorida> llistat_titulacions = new ArrayList<CiclesFlorida>();

        c = new CiclesFlorida("ESPORT","Superior","Animació d'activitats físiques i esportives","Aquesta formació concertat de nivell superior cicle formes com un Tècnic Superior en activitats físiques i esportives, que està especialitzat en ensenyament i dinamització de jocs i activitats de fitness.");
        llistat_titulacions.add(c);
        c = new CiclesFlorida("ESPORT","Mitjà","Conducción de actividades físico deportivas en el medio natural","Este Ciclo Formativo de Grado Medio te forma como Técnico/a en Conducción de actividades físico deportivas en el medio natural, permitiéndote la especialización posterior como Técnico de Actividades físico deportivas.");
        llistat_titulacions.add(c);
        c = new CiclesFlorida("EMPRESA","Superior","Gestión de Ventas y Espacios Comerciales","Nuevo ciclo formativo de grado superior concertado por la GVA");
        llistat_titulacions.add(c);
        c = new CiclesFlorida("EMPRESA","Superior","Marketing y publicidad","Este ciclo te prepara para definir y efectuar el seguimiento de las políticas de marketing de una empresa.");
        c = new CiclesFlorida("EMPRESA","Superior","Administración y Finanzas / FP Dual BANKIA","Dentro de la modalidad de FP Dual, Florida Universitaria, en colaboración con Bankia, pone en marcha el Ciclo de Técnico/a Superior en Administración y Finanzas. Este Ciclo Formativo se desarrolla 100% en modalidad DUAL, con 9 meses de estancia en las sucursales de Bankia, formándote con una alta especialización en el ámbito financiero bancario.");
        c = new CiclesFlorida("INFORMÀTICA","Mitjà","Sistemas Microinformáticos y Redes","Este Ciclo Formativo de Grado Medio concertado te forma como Técnico/a en Sistemas Microinformáticos y Redes, permitiéndote la especialización posterior en el desarrollo de aplicaciones o la administración de sistemas informáticos.");
        c = new CiclesFlorida("INFORMÀTICA","Superior","Administración de Sistemas Informáticos y en Red","Este Ciclo Formativo de Grado Superior concertado te forma como profesional de la informática y las comunicaciones, especializado en la configuración, administración y mantenimiento de sistemas informáticos en red.");
        c = new CiclesFlorida("INFORMÀTICA","Superior","Desarrollo de Aplicaciones Multiplataforma","Este NUEVO Ciclo Formativo de Grado Superior concertado te forma como profesional de la informática y las comunicaciones, especializado en el desarrollo, implantación y mantenimiento de aplicaciones para diferentes plataformas tecnológicas.");
        c = new CiclesFlorida("INFORMÀTICA","Superior","Desarrollo de Aplicaciones Web","ste NUEVO Ciclo Formativo de Grado Superior privado te forma como profesional de la informática y las comunicaciones, especializado en el desarrollo, implantación y mantenimiento de aplicaciones web");
    }
}
