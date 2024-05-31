package edu.upc.dsa.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.upc.dsa.models.Question;
import edu.upc.dsa.models.FormResponse;
import io.swagger.annotations.Api;

import java.time.LocalDateTime;

@Api(value = "/question", description = "Endpoint to Question Service")
@Path("/question")
public class QuestionService {
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response submitQuestion(Question question) {
        if (question.getSender() == null || question.getTitle() == null || question.getMessage() == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Por favor, complete todos los campos").build();
        }

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Date: " + now + ", Sender: " + question.getSender() + ", Title: " + question.getTitle() + ", Message: " + question.getMessage());

        return Response.status(200).entity(new FormResponse("Pregunta recibida")).build();
    }
}