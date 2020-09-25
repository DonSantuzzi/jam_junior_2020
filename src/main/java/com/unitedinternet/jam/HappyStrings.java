package com.unitedinternet.jam;

public class HappyStrings {
    public static void main(String[] args) {
        new HappyStrings().start();
    }
    
    private void start() {
        String oliver = "Oliver";
        checkLogin(oliver);
        
        String andre = new String("Andre");
        System.out.println(new HappyStrings());
        
        String lastname = "Grunow";
    
        int x = 5 + 6;
        System.out.println("Summe: " + 5 * 6);
        
        int z = 1 + 3 * 4 + 1;
        System.out.println(z);
        
        lastname = lastname.toUpperCase();
        System.out.println(lastname);
    }
    
    private void checkLogin(String loginName) {
        boolean result = loginName.equals("Oliver");
        System.out.println("Login check: " + result);
    }
    
    @Override
    public String toString() {
        return "Hi I am cool";
    }
}
