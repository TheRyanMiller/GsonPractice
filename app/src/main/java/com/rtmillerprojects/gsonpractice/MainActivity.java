package com.rtmillerprojects.gsonpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

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
                .registerTypeAdapter(Books.class, new BookDeserializer());
        Gson gson = gsonBuilder.create();

        InputStream is = this.getResources().openRawResource(R.raw.samplebookjson);
        Reader reader = new InputStreamReader(is);

        /*
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        String aux = "";
        try {
            while ((aux = bufferedReader.readLine()) != null) {
                builder.append(aux);
            }
            // Parse JSON to Java
            Book book = gson.fromJson(aux, Book.class);
            JSONObject jsonObj = new JSONObject(aux);
            final Book[] books = jsonObj.get("books"), Book[].class;
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        */
        //Book books = gson.fromJson(reader, Book.class);
        Books booklist = gson.fromJson(reader, Books.class);
        //final Book[] books = jsonObj.get("books"), Book[].class;
        //System.out.println(book);

    }
}
