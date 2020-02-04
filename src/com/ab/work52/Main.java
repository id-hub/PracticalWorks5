package com.ab.work52;

public class Main {
    public static void main(String[] args) {
        String name = "National Aviation " +
                "University";
//        String abrr = "" + name.charAt(0);
//        abrr += name.charAt(name.indexOf(" ") + 1);
//        abrr += name.charAt(name.lastIndexOf(" ") + 1);
//        System.out.println(abrr);


        String abr1 = "" + name.charAt(0);
        abr1 += name.charAt(name.indexOf(" ") + 1);
        abr1 += name.charAt(name.lastIndexOf(" ") + 1);
        System.out.println("abrr = " + abr1);
    }
}
