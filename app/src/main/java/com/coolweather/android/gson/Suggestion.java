package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TYL on 2017/5/24.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort {
        @SerializedName("text")
        public String info;
    }

    public class CarWash {
        @SerializedName("text")
        public String info;
    }

    public class Sport {
        @SerializedName("text")
        public String info;
    }



}
