package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String ONETHOUSANDISLAND = "1000 ISLAND";
    public static final String BBQ = "BBQ";
    public final String sauceType;

    public Sauce(String sauceType) {
        if (
            sauceType.equals(STANDARD) ||
            sauceType.equals(ONETHOUSANDISLAND) ||
            sauceType.equals(BBQ)
        ) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("Sauce should be checked");
        }
    }

    public String getSauceType() {
        return sauceType;
    }
}
