package com.ak93.exoplayerexample.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Word {

    @SerializedName("start_time")
    @Expose
    private Double startTime;
    @SerializedName("end_time")
    @Expose
    private Double endTime;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("confidence")
    @Expose
    private Double confidence;
    @SerializedName("strikethrough")
    @Expose
    private Boolean strikethrough;
    @SerializedName("highlight")
    @Expose
    private Boolean highlight;
    @SerializedName("bold")
    @Expose
    private Boolean bold;
    @SerializedName("color")
    @Expose
    private String color;

    public Double getStartTime() {
        return startTime;
    }

    public void setStartTime(Double startTime) {
        this.startTime = startTime;
    }

    public Double getEndTime() {
        return endTime;
    }

    public void setEndTime(Double endTime) {
        this.endTime = endTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Boolean getStrikethrough() {
        return strikethrough;
    }

    public void setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


