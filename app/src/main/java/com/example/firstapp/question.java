package com.example.firstapp;

import java.io.Serializable;
import java.util.List;

public class question implements Serializable {
    String statement;
    String[] options;
    int correctOption;
    int selectedOption;

    public boolean check(){
        return this.selectedOption == this.correctOption;
    }
}