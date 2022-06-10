package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String SEASAM = "SEASAM";
    public static final String NOSEASAM = "WITHOUT SEASAM";
    public final String bunType;

    public Bun(String bunType) {
        if (bunType.equals(SEASAM) || bunType.equals(NOSEASAM)) {
            this.bunType = bunType;
        } else {
            throw new IllegalStateException("The bun should be with seaseam or without");
        }
    }

    public String getBunType() {
        return bunType;
    }
}
