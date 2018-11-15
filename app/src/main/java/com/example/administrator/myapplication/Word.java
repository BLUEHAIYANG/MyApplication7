package com.example.administrator.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Word {
    private  String ChineseWord;
    private  String EnglishWord;

    public Word(String ChineseWord,String EnglishWord){
        this.ChineseWord= ChineseWord;
        this.EnglishWord = EnglishWord;

    }

    public String getChineseWord(){
        return ChineseWord;
    }

    public  String getEnglishWord(){
        return EnglishWord;
    }

}
