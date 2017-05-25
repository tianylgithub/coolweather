package com.coolweather.android.gson;

import android.test.MoreAsserts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TYL on 2017/5/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}
