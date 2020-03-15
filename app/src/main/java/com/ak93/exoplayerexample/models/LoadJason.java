package com.ak93.exoplayerexample.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoadJason {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

}
