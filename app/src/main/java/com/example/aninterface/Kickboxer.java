package com.example.aninterface;

import android.util.Log;

public class Kickboxer implements Fighter{


    @Override
    public String throwJab() {
        return "This is Kickboxer throwJab";
    }

    @Override
    public String throwcross() {
        return "This is Kickboxer Throwcrosss";
    }

    @Override
    public String throwhook() {
        return "This is Kickboxer Throwhook";
    }

    @Override
    public String throwuppercut() {
        return "This is Kickboxer Throwuppercut";
    }
}
