package com.ravis.demographqlspringkickstart.resolver;


import com.ravis.demographqlspringkickstart.model.Book;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {
    public Book getBook(String isbn) {
        return new Book("Book by Ravi Shankar" , "123456");
    }
}
