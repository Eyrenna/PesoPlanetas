package org.lasencinas;

import java.util.EnumSet;

public enum Planeta {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    //Atributos
    private Double masa = 0d;
    private Double radio = 0d;
    private Double GRAVEDAD = 6.67300E-11;

    //Constructor
    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    //Métodos

    //Seters
    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Geters
    public Double getMasa() {
        return masa;
    }

    public Double getRadio() {
        return radio;
    }

    public Double getGRAVEDAD() {
        return GRAVEDAD;
    }

    public double GEnSuperficie(Planeta planeta) {
        return getGRAVEDAD() * planeta.getMasa() / Math.pow(planeta.getRadio(), 2);
    }

    public double masaHumano(double pesoHumano) {
        return pesoHumano / GEnSuperficie(EARTH);
    }

    public double pesoSuperficie(double pesoHumano) {
        return masaHumano(pesoHumano) * GEnSuperficie(this);
    }

    public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(Planeta.MERCURY, Planeta.MARS);
    }
}
