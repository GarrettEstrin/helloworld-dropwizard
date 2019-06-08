package com.garrettestrin.helloworld.resources;

import com.codahale.metrics.annotation.Timed;
import com.garrettestrin.helloworld.api.Clap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
@Path("/clap")
@Produces(MediaType.APPLICATION_JSON)
public class ClapResource {

    public ClapResource() {

    }

    @GET
    @Timed
    @Path("/{message}")
    public Clap clapify(@PathParam("message") String message) {
        return new Clap(message);
    }
}