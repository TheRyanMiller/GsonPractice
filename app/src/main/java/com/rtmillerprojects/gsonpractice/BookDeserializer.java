package com.rtmillerprojects.gsonpractice;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Ryan on 8/14/2016.
 */
public class BookDeserializer implements JsonDeserializer<Book> {

    @Override
    public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonObject, Book.class);
        final String title = jsonObject.get("title").getAsString();
        final String publishYear = jsonObject.get("publish_year").getAsString();
        final String isbn = jsonObject.get("isbn").getAsString();
        //final Book book = new Book();
        book.setPublishYear(publishYear);
        book.setIsbn(isbn);
        book.setTitle(title);
        return book;
    }
}
                /*
          final String isbn = jsonObject.get("isbn-10").getAsString();
          final String isbn13 = jsonObject.get("isbn-13").getAsString();
          final JsonArray jsonAuthorsArray = jsonObject.get("authors").getAsJsonArray();
 @@ -26,12 +27,15 @@ public Book deserialize(JsonElement json, Type typeOfT, JsonDeserializationConte
              final JsonElement jsonAuthor = jsonAuthorsArray.get(i);
              authors[i] = jsonAuthor.getAsString();
          }
 +        */
