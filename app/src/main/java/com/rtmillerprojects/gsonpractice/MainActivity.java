package com.rtmillerprojects.gsonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(Book.class, new BookDeserializer());
        Gson gson = gsonBuilder.create();

        InputStream is = this.getResources().openRawResource(R.raw.samplebookjson);
        Reader reader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder result = new StringBuilder();
        String line;

        // Parse JSON to Java
        Book book = gson.fromJson(reader, Book.class);
        //System.out.println(book);

    }
}
