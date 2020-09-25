package com.unitedinternet.jam;

public class Main {

    private final static int FETT = 1;
    private final static int KURSIV = 2;
    private final static int UNTERSTRICHEN = 4;
    private final static int DURCHGESTRICHEN = 8;
    private final static int HOCHGESTELLT = 16;
    
    public static void main(String[] args) {
	    new Main().wurst(FETT | UNTERSTRICHEN | DURCHGESTRICHEN);
    }
    
    private void wurst(int stil) {
        System.out.println("Fett: " + ((stil & FETT) == FETT));
        System.out.println("kursiv: " + ((stil & KURSIV) == KURSIV));
        System.out.println("unterstrichen: " + ((stil & UNTERSTRICHEN) == UNTERSTRICHEN));
        System.out.println("durchgestrichen: " + ((stil & DURCHGESTRICHEN) == DURCHGESTRICHEN));
        System.out.println("hochgestellt: " + ((stil & HOCHGESTELLT) == HOCHGESTELLT));
    }
}
