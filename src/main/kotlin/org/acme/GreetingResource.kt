package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.acme.fromJson
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

data class User(val name:String, val age:Int)

@Path("/user")
class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun user(): User {
        val json = """ {"name":"hon", "age": 35}  """
        val user : User = json.fromJson()
        println()
        return user
    }
}