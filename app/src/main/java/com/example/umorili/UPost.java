package com.example.umorili;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UPost {
    @SerializedName("elementPureHTML")
    @Expose
    private String elementPureHTML;

    public String getElementPureHTML() {
        return elementPureHTML;
    }
}
