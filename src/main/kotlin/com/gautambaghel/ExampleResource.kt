package com.gautambaghel

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}


@Path("/ping")
class Ping {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun ping() = "ping"
}