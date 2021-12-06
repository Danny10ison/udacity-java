package javaBestPractices;

public class WhatAWorldWeLiveIn{
    private String _sound;

    public WhatAWorldWeLiveIn(String sound){
        this._sound = sound;
    }

    public void set_sound(String _sound) {
        this._sound = _sound;
    }

    public String get_sound() {
        return _sound;
    }
}


public class NamingConventions {

        public static void main(String[] args) {
        /*
        *  Before starting your project, you need to define a suitable
        *     set naming conventions.
        *  + Variable,
        *  + Long Variables
        *  + Constants
        *  + Classes
        *  + Interfaces
        *  + Methods
        *  + Packages
        *  + etc
        * */
        /*
        * Names must be self-explanatory
        * Names should have meaningful distinctions
        * Names should be pronounceable
        * */

        final double ACCELERATION_DUE_TO_GRAVITY = 9.8;
        int myFatherAge = 17;
        String my_first_name = "Daniel";

    }
}
