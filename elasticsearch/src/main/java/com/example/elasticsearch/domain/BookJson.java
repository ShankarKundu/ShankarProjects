package com.example.elasticsearch.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class BookJson extends JsonDeserializer<Book> {
    @Override
    public Book deserialize(JsonParser jsonParserp, DeserializationContext deserializationContext) throws IOException ,JsonProcessingException {
        Book book=new Book();
        JsonNode node=jsonParserp.getCodec().readTree(jsonParserp);
        String id=node.get("id")!=null?node.get("id").asText():"";
        String title=node.get("title").asText();
        String author=node.get("author").asText();
        String price=node.get("price").asText();

        if(id!=null && id.isEmpty()){
            book.setId(id);
        }
        book.setAuthor(author);
        book.setTitle(title);
        book.setPrice(price);
        return book;
    }
}
