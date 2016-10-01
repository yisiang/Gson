package com.example.siang.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by siang on 2016/9/9.
 */

public class Student {

    // @Expose => 是否序列化或反序列化(為了解決部分資料不序列化，如num)
    @Expose(serialize = true, deserialize = true)
    private String name;
    @Expose
    private int age;

    private String num = "123";

    //此地要用特殊名字，則序列化時，使用weight去轉換
    @SerializedName("weight")
    private double big_weight;


    public String getName() {
        return name + num;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBig_weight() {
        return big_weight;
    }

    public void setBig_weight(int big_weight) {
        this.big_weight = big_weight;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static class habbit
    {
        @Expose
        private String sport;

        public String getSport() {
            return sport;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }
    }


}
