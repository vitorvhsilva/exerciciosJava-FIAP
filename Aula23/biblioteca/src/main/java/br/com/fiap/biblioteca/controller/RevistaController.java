package br.com.fiap.biblioteca.controller;

import br.com.fiap.biblioteca.model.Revista;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("revistas")
public class RevistaController {

    private static final ArrayList<Revista> revistas = new ArrayList<>();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response salvar(Revista revista) {
        revistas.add(revista);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response obterTodaRevistas() {
        return Response
                .status(Response.Status.OK)
                .entity(revistas)
                .build();
    }


}
