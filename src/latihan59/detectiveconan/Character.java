/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan59.detectiveconan;

/**
 *
 * @author Aero
 */
public class Character {
    
    protected String name;
    protected String from;
    protected boolean eyeglasses;
    
    public Character(String name, String from, boolean eyeglasses) {
        this.name = name;
        this.from = from;
        this.eyeglasses = eyeglasses;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
    
}