package com.example.siang.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data = "[{\"name\":\"Jerry\",\"age\":\"30\", \"weight\":\"60.5\", " +
                "\"habbit\":[{\"sport\":\"run\"}]}," +
                "{\"name\":\"Kevin\",\"age\":\"50\", \"weight\":\"55.4\"}]";

        //方法一
//        Gson gson = new Gson();
        //過濾Expose
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        Student[] students = gson.fromJson(data, Student[].class);

        for (Student s : students)
        {
            Log.i("siang", s.getName());
        }

        //方法二
        //TypeToken 取得泛型參數的類別
        List<Student> studentList = gson.fromJson(data, new TypeToken<ArrayList<Student>>(){}.getType());
        for (int i = 0; i < studentList.size(); i++)
        {
            Log.i("siang", studentList.get(i).getAge()+"");
        }


    }
}