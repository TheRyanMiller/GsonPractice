package com.rtmillerprojects.gsonpractice;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by Ryan on 8/14/2016.
 */
public class BooksDeserializer implements JsonDeserializer<Books> {
    @Override

    public Books deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        final JsonObject jsonObject = json.getAsJsonObject();
        Gson gson = new Gson();
        Books books = gson.fromJson(jsonObject, Books.class);
        return books;
    }
}