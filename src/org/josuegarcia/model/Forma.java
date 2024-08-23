
package org.josuegarcia.model;


public abstract class Forma {
    private int color;

    public Forma() {
    }

    public Forma(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Forma{" + "color=" + color + '}';
    }
    
    
   
    
}
