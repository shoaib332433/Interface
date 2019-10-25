package com.example.aninterface;

public class Boxer implements Fighter {


    @Override
    public String throwJab() {
        return "This is Boxer throwJab";
    }

    @Override
    public String throwcross() {
        return "This is Boxer throwcross";
    }

    @Override
    public String throwhook() {
        return "This is Boxer throwhook";
    }

    @Override
    public String throwuppercut() {
        return "This is Boxer throwuppercut";
    }
}
