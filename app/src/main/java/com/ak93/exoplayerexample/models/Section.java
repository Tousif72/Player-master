package com.ak93.exoplayerexample.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Section {

    @SerializedName("meta")
    @Expose
    private Meta_ meta;
    @SerializedName("words")
    @Expose
    private List<Word> words = null;

    public Meta_ getMeta() {
        return meta;
    }

    public void setMeta(Meta_ meta) {
        this.meta = meta;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}


