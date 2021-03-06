package com.shaigor.example.openapi;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shaigor.example.openapi.model.ByIdResponse;
import com.shaigor.example.openapi.model.ContainerizedResponse;
import com.shaigor.example.openapi.model.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "ExampleService")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path(Service.ROOT_PATH)
public interface Service {
    String ROOT_PATH = "/example";

    @GET
    @Path("/model")
    @Operation(summary = " Retrieve models for display to the user")
    Response getModels();

    @GET
    @Path("/model/by/ids")
    @Operation(summary = " Retrieve models by their ids")
    ByIdResponse getModelsById();

    @GET
    @Path("/containerized/model")
    @Operation(summary = " Retrieve review insights for a specific product")
    ContainerizedResponse getContainerizedModels();
}
