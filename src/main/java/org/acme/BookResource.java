package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Path("/api/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {
    @Inject
    private BookDAO bookDAO;

    @GET
    public List<BookEntity> getAllBooks() {
       return bookDAO.findAll();
    }

    @GET
    @Path("/{id}")
    public Optional<BookEntity> getBookById(@PathParam("id") Long id) {
        return getAllBooks().stream().filter(book -> Objects.equals(book.getId(), id)).findFirst();
    }
}
