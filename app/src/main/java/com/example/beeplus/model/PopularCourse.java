
package com.example.beeplus.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PopularCourse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("Descripton")
    @Expose
    private String description;
    @SerializedName("videoUrlyou")
    @Expose
    private String videoUrlyou;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrlyou() {
        return videoUrlyou;
    }

    public void setVideoUrlyou(String videoUrlyou) {
        this.videoUrlyou = videoUrlyou;
    }

}